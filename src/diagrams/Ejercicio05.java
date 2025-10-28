package diagrams;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Declaro la variable 'num1' para almacenar el número entero introducido
		// por el usuario.
		int num1;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Leo de la consola un número entero del usuario.
		num1 = reader.nextInt();

		// Creo una estructura if-else para comprobar si el número es positivo o
		// negativo.
		if (num1 >= 0) {
			// Si la condición (num1 >= 0) se cumple, imprime "Es positivo".
			System.out.println("Es positivo");
		} else {
			// Si la condición no se cumple (menor que 0), imprime "Es negativo".
			System.out.println("Es negativo");
		}

		// Cierro el Scanner.
		reader.close();
	}

}