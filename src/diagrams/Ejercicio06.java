package diagrams;

import java.util.Scanner;

public class Ejercicio06 {

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

		// Creo una estructura if-else para comparar los dos números.
		if (num1 > num2) {
			// Si la condición (num1 > num2) se cumple, imprime el valor de num1.
			System.out.println(num1);
		} else {
			// Si la condición no se cumple (num2 es mayor o igual), imprime el valor de
			// num2.
			System.out.println(num2);
		}

		// Cierro el Scanner.
		reader.close();
	}

}