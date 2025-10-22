package condicionals;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Declaro las variables 'mes' y 'año' para almacenar los valores de entrada.
		int mes;
		int año;
		// Declaro la variable booleana 'esBisiesto' para almacenar el resultado del
		// cálculo del año.
		boolean esBisiesto;
		
		// Creo el Scanner para leer la entrada del usuario
		Scanner reader = new Scanner(System.in);
		
		// Solicito y leo de la consola el número del mes (del 1 al 12)
		System.out.println("Introduce el número del mes (1-12)");
		mes = reader.nextInt();
		
		// Solicito y leo de la consola el año
		System.out.println("Introduce el año");
		año = reader.nextInt();
		
		// Asigno el valor a la variable 'esBisiesto' usando la lógica correcta:
		// Es bisiesto si (es divisible por 4 Y no por 100) O (es divisible por 400)
		esBisiesto = (año % 4 == 0 && año % 100 != 0 || (año % 100 == 0 && año % 400 == 0));
		
		// Creo un condicional if-else para informar al usuario si el año es bisiesto o no
		if (esBisiesto) {
			System.out.println("El año " + año + " es bisiesto");

		} else {
			System.out.println("El año " + año + " no es bisiesto");
		}

		// Utilizo un switch expression (con yield) para calcular e imprimir los días del mes.
		// Asigno el resultado a la variable 'dias'
		int dias = switch (mes) {
		// Case para los meses con 31 días (Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre)
		case 1, 3, 5, 7, 8, 10, 12 -> {
			System.out.println("Tiene 31 días");
			yield 31;
		}
		// Case para los meses con 30 días (Abril, Junio, Septiembre, Noviembre)
		case 4, 6, 9, 11 -> {
			System.out.println("Tiene 30 días");
			yield 30;
		}
		// Case para Febrero, que depende de la variable 'esBisiesto'
		case 2 -> {
			// Si el año SI es bisiesto
			if (esBisiesto) {
				System.out.println("Tiene 29 días ya que el año SI es bisiesto");
				yield 29;
			} 
			// Si el año NO es bisiesto
			else {
				System.out.println("Tiene 28 días ya que el año NO es bisiesto");
				yield 28;
			}

		}
		// Case default para indicar que el número de mes introducido es erróneo
		default -> {
			System.out.println("Error, introduce un número del 1 al 12");
			yield -1;
		}
		};

		// Cierro el Scanner
		reader.close();
	}
}