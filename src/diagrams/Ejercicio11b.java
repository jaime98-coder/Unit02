package diagrams;

import java.util.Scanner;

public class Ejercicio11b {

	public static void main(String[] args) {
		// Declaro la variable 'numHoras' para almacenar el número de horas trabajadas.
		int numHoras;
		// Declaro la variable 'tarifaHoras' para almacenar el precio por hora.
		double tarifaHoras;
		// Declaro la variable 'salarioBruto' para almacenar el salario antes de
		// impuestos.
		double salarioBruto;
		// Declaro la variable 'salarioNeto' para almacenar el salario después de
		// impuestos.
		double salarioNeto;
		// Declaro la variable 'tasas' para almacenar el total de impuestos a pagar.
		// La inicializo a 0.
		double tasas = 0;
		// Declaro la variable 'exceso' para almacenar la cantidad de salario que supera
		// un tramo de impuestos.
		double exceso;
		// Declaro la variable 'impuestoSegundoTramo' para almacenar el impuesto fijo
		// del tramo 2.
		double impuestoSegundoTramo;
		// Declaro la variable 'excesoTercerTramo' para almacenar la cantidad que supera
		// el tramo 2.
		double excesoTercerTramo;
		// Declaro la variable 'impuestoTercerTramo' para almacenar el impuesto
		// calculado en el tramo 3.
		double impuestoTercerTramo;
		// Declaro la variable 'nombre' para almacenar el nombre del trabajador.
		String nombre;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Solicito y leo de la consola el nombre del empleado.
		System.out.println("Introduce el nombre del empleado");
		nombre = reader.nextLine();
		// Solicito y leo de la consola el número de horas trabajadas.
		System.out.println("Introduce el número de horas trabajadas");
		numHoras = reader.nextInt();
		// Solicito y leo de la consola la tarifa por hora.
		System.out.println("Introduce la tarifa (cobro por hora)");
		tarifaHoras = reader.nextDouble();

		// Cálculo del salario bruto (correcto)
		// Creo una estructura if-else para calcular el salario bruto.
		if (numHoras <= 35) {
			// Si trabaja 35 horas o menos, el salario es horas * tarifa.
			salarioBruto = numHoras * tarifaHoras;
		} else {
			// Si trabaja más de 35 horas, las primeras 35 se pagan normal
			// y las restantes (numHoras - 35) se pagan a 1.5 veces la tarifa.
			salarioBruto = 35 * tarifaHoras + (numHoras - 35) * tarifaHoras * 1.5;
		}

		// Creo una estructura if-else if-else para el cálculo progresivo de tasas
		// (impuestos por tramos).
		if (salarioBruto <= 500) {
			// Primer tramo (hasta 500): libre de impuestos.
			tasas = 0;
			salarioNeto = salarioBruto;
		} else if (salarioBruto <= 900) {
			// Segundo tramo (entre 500.01 y 900):
			// Calculo el exceso sobre 500 (la base exenta).
			exceso = salarioBruto - 500;
			// Las tasas son el 25% de ESE exceso.
			tasas = exceso * 0.25;
			salarioNeto = salarioBruto - tasas;
		} else {
			// Tercer tramo (más de 900):
			// Se calcula la parte fija del impuesto del segundo tramo (el 25% de los 400€
			// de ese tramo).
			impuestoSegundoTramo = 400 * 0.25; // 100€ de impuestos
			// Calculo el exceso sobre 900 (la base del tercer tramo).
			excesoTercerTramo = salarioBruto - 900; // Lo que pasa de 900€
			// Calculo el impuesto de ese exceso (45%).
			impuestoTercerTramo = excesoTercerTramo * 0.45;

			// Las tasas totales son la suma de los impuestos de los tramos 2 y 3.
			tasas = impuestoSegundoTramo + impuestoTercerTramo;
			// El salario neto es el bruto menos las tasas totales.
			salarioNeto = salarioBruto - tasas;
		}

		// Imprimo el nombre del trabajador.
		System.out.println("Nombre: " + nombre);
		// Imprimo el salario bruto calculado.
		System.out.println("Salario bruto: " + salarioBruto);
		// Imprimo las tasas totales calculadas.
		System.out.println("Tasas: " + tasas);
		// Imprimo el salario neto resultante.
		System.out.println("Salario neto: " + salarioNeto);

		// Cierro el Scanner.
		reader.close();
	}
}