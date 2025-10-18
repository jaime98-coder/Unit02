package ifelse;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Declaro la variable num
		double num;

		// Creo el Scanner
		Scanner reader = new Scanner(System.in);

		// Solicito al usuario que introduzca un número para saber las cifras del mismo,
		// y leo de consola el valor introducido
		System.out.println("Introduce un número para saber cuantas cifras tiene");
		num = reader.nextDouble();

		// Creo un IF en primer lugar para marcar los límites del rango, y si no cumple
		// con este límite indicarle que el número introducido es incorrecto
		if (num < 0 || num > 99999) {
			System.out.println("Número incorrecto");
			// Asignp un ELSE IF para cuando entren dentro del rango, indicar el número de
			// cifras ( y así ocurre igual con todas las posibles soluciones

		} else if (num < 100000) {
			System.out.println("Tiene 5 cifras");

		} else if (num < 10000) {
			System.out.println("Tiene 4 cifras");

		} else if (num < 1000) {
			System.out.println("Tiene 3 cifras");

		} else if (num < 100) {
			System.out.println("Tiene 2 cifras");

			// Hasta aquí, que si no tiene las cifras anteriores, por descarte tendrá 1
			// cifra.
		} else {
			System.out.println("Tiene 1 cifra");
		}

		// Cierro el Scanner
		reader.close();
	}

}
