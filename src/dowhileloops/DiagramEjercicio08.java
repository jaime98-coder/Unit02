package dowhileloops;

import java.util.Scanner;

public class DiagramEjercicio08 {

	public static void main(String[] args) {
		// Declaro la variable 'tiradaUno' para almacenar el valor de la primera tirada
		// como texto.
		String tiradaUno;
		// Declaro la variable 'tiradaDos' para almacenar el valor de la segunda tirada
		// como texto.
		String tiradaDos;

		// Declaro la variable 'sumaTiradas' para almacenar la suma total de los valores
		// numéricos de las tiradas.
		int sumaTiradas;
		int tiradaUnoNum;
		int tiradaDosNum;
		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		do {

			// --- Primera Tirada ---
			// Solicito y leo de la consola el valor de la primera tirada del dado (en
			// letras) y lo convierto a mayúsculas.
			System.out
					.println("Introduce con letras cuánto has sacado en la primera tirada del dado \nPrimera tirada: ");
			tiradaUno = reader.next().toUpperCase();

			// Uso un switch expression para convertir el valor de texto ('tiradaUno') a un
			// valor numérico entero ('tiradaUnoNum').
			tiradaUnoNum = switch (tiradaUno) {
			// Case si el usuario introduce "UNO", el valor numérico es 1.
			case "UNO" -> {
				yield 1;
			}
			// Case si el usuario introduce "DOS", el valor numérico es 2.
			case "DOS" -> {
				yield 2;
			}
			// Case si el usuario introduce "TRES", el valor numérico es 3.
			case "TRES" -> {
				yield 3;
			}
			// Case si el usuario introduce "CUATRO", el valor numérico es 4.
			case "CUATRO" -> {
				yield 4;
			}
			// Case si el usuario introduce "CINCO", el valor numérico es 5.
			case "CINCO" -> {
				yield 5;
			}
			// Case si el usuario introduce "SEIS", el valor numérico es 6.
			case "SEIS" -> {
				yield 6;
			}
			// Case default si el valor no es un número de dado válido (1-6) o no está en
			// letras.
			default -> {
				System.out.println("No puedes sacar más de 6 en el dado, y con LETRAS");
				// Devuelvo -1 para indicar un error.
				yield -1;
			}
			};
		} while (tiradaUnoNum == -1);

		do {

			// --- Segunda Tirada ---
			// Solicito y leo de la consola el valor de la segunda tirada del dado (en
			// letras) y lo convierto a mayúsculas.
			System.out
					.println("Introduce con letras cuánto has sacado en la segunda tirada del dado \nSegunda tirada: ");
			tiradaDos = reader.next().toUpperCase();

			// Uso un segundo switch expression para convertir el valor de texto
			// ('tiradaDos') a un valor numérico entero ('tiradaDosNum').
			tiradaDosNum = switch (tiradaDos) {
			// Se repiten los casos de UNO a SEIS.
			case "UNO" -> {
				yield 1;
			}
			case "DOS" -> {
				yield 2;
			}
			case "TRES" -> {
				yield 3;
			}
			case "CUATRO" -> {
				yield 4;
			}
			case "CINCO" -> {
				yield 5;
			}
			case "SEIS" -> {
				yield 6;
			}
			// Case default si el valor no es un número de dado válido (1-6) o no está en
			// letras.
			default -> {
				System.out.println("No puedes sacar más de 6 en el dado, y con LETRAS");
				// Devuelvo -1 para indicar un error.
				yield -1;
			}
			};
		} while (tiradaDosNum == -1);

		// Asigno a la variable 'sumaTiradas' el resultado de sumar los valores
		// numéricos de ambas tiradas.
		// Si alguna tirada fue inválida (devuelve -1), la suma final será incorrecta,
		// pero el error ya fue notificado.
		sumaTiradas = tiradaUnoNum + tiradaDosNum;

		// Imprimo en pantalla el resultado final de la suma.
		System.out.println("La suma de las dos tiradas es: " + sumaTiradas);

		// Cierro el Scanner.
		reader.close();
	}

}