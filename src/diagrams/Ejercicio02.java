package diagrams;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Declaro la variable 'edad' para almacenar la edad entera introducida
		// por el usuario.
		int edad;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Leo de la consola la edad entera del usuario.
		edad = reader.nextInt();

		// Creo una estructura if-else para comprobar la mayoría de edad.
		if (edad >= 18) {
			// Si la condición (edad >= 18) se cumple, imprime "Eres mayor de edad".
			System.out.println("Eres mayor de edad");
		} else {
			// Si la condición no se cumple (menor de 18), imprime "Eres menor de edad".
			System.out.println("Eres menor de edad");
		}

		// Cierro el Scanner.
		reader.close();
	}

}