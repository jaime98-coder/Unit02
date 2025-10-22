package switchcase;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Declaro la variable 'dia' para almacenar el número introducido por el
		// usuario.
		int dia;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Solicito y leo de la consola un número del 1 al 7 al usuario.
		System.out.println("Introduce un número del 1 al 7 para saber que día de la semana es");
		dia = reader.nextInt();

		// Creo un switch expression para determinar el día de la semana basado en el
		// número introducido.
		switch (dia) {
		// Case 1 corresponde al primer día de la semana y así sucesivamente
		case 1 -> System.out.println("Lunes");

		case 2 -> System.out.println("Martes");

		case 3 -> System.out.println("Miercoles");

		case 4 -> System.out.println("Jueves");

		case 5 -> System.out.println("Viernes");

		case 6 -> System.out.println("Sábado");
		// Case 7 corresponde al último día de la semana
		case 7 -> System.out.println("Domingo");
		// Case default para indicar que el número introducido es erróneo (no está entre
		// 1 y 7).
		default -> System.out.println("El valor introducido es incorrecto");
		}

		// Cierro el Scanner.
		reader.close();
	}

}