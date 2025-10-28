package diagrams;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Declaro la variable 'numHoras' para almacenar el número de horas trabajadas.
		int numHoras;
		// Declaro la variable 'tarifa' para almacenar el precio por hora.
		double tarifa;
		// Declaro la variable 'salarioBruto' para almacenar el salario antes de
		// impuestos.
		double salarioBruto;
		// Declaro la variable 'salarioNeto' para almacenar el salario después de
		// impuestos.
		double salarioNeto;
		// Declaro la variable 'tasas' para almacenar el total de impuestos a pagar.
		// La inicializo a 0.
		double tasas = 0;
		// Declaro la variable 'nombre' para almacenar el nombre del trabajador.
		String nombre;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Leo de la consola el nombre (línea completa).
		nombre = reader.nextLine();
		// Leo de la consola el número de horas (entero).
		numHoras = reader.nextInt();
		// Leo de la consola la tarifa (entero, aunque se almacena en double).
		tarifa = reader.nextInt();

		// Creo una estructura if-else para calcular el salario bruto.
		if (numHoras <= 35) {
			// Si trabaja 35 horas o menos, el salario es horas * tarifa.
			salarioBruto = numHoras * tarifa;
		} else {
			// Si trabaja más de 35 horas, las primeras 35 se pagan normal
			// y las restantes (numHoras - 35) se pagan a 1.5 veces la tarifa.
			salarioBruto = 35 * tarifa + (numHoras - 35) * tarifa * 1.5;

		}

		// Creo una estructura if-else if-else para calcular las tasas y el salario
		// neto.
		if (salarioBruto <= 500) {
			// Si el salario bruto es 500 o menos, no hay tasas.
			salarioNeto = salarioBruto;
		} else if (salarioBruto <= 900) {
			// Si está entre 500 (excluido) y 900 (incluido), las tasas son del 25%.
			tasas = salarioBruto * 0.25;
			salarioNeto = salarioBruto - salarioBruto * 0.25;
		} else {
			// Si es mayor que 900, las tasas son del 45%.
			tasas = salarioBruto * 0.45;
			salarioNeto = salarioBruto - salarioBruto * 0.45;
		}

		// Imprimo el nombre del trabajador.
		System.out.println("Nombre:" + nombre);
		// Imprimo el salario bruto calculado.
		System.out.println("Salaro bruto:" + salarioBruto);
		// Imprimo las tasas calculadas.
		System.out.println("Tasas" + tasas);
		// Imprimo el salario neto (bruto - tasas).
		System.out.println("Salario neto:" + salarioNeto);

		// Cierro el Scanner.
		reader.close();
	}

}