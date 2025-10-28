package diagrams;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Declaro la variable 'num1' para almacenar el primer número entero introducido
		// por el usuario.
		int num1;

		// Declaro la variable 'num2' para almacenar el segundo número entero
		// introducido
		// por el usuario.
		int num2;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Leo de la consola el primer número entero.
		num1 = reader.nextInt();

		// Leo de la consola el segundo número entero.
		num2 = reader.nextInt();

		// Creo una estructura if-else if-else para comparar los dos números.
		if (num1 > num2) {
			// Si la condición (num1 > num2) se cumple, imprime "El número 1 es mayor".
			System.out.println("El número 1 es mayor");
		} else if (num1 == num2) {
			// Si la condición anterior no se cumple y (num1 == num2) sí, imprime "Son
			// iguales".
			System.out.println("Son iguales");
		} else {
			// Si ninguna de las condiciones anteriores se cumple, imprime "El número 2 es
			// mayor".
			System.out.println("El número 2 es mayor");
		}

		// Cierro el Scanner.
		reader.close();
	}

}