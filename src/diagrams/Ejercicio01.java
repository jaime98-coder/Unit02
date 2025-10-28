package diagrams;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Declaro la variable 'edad' para almacenar la edad entera introducida
		// por el usuario.
		int edad;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Solicito y leo de la consola la edad entera del usuario.
		System.out.println("Introduzca su edad");
		edad = reader.nextInt();

		// Creo un if para comprobar si la edad es mayor o igual a 18.
		// Si la condición se cumple, imprime "Eres mayor de edad".
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		}

		// Cierro el Scanner.
		reader.close();
	}

}