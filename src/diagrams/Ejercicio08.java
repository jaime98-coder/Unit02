package diagrams;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Declaro la variable 'num1' para almacenar el primer número entero.
		int num1;
		// Declaro la variable 'num2' para almacenar el segundo número entero.
		int num2;
		// Declaro la variable 'num3' para almacenar el tercer número entero.
		int num3;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Leo de la consola el primer número entero.
		num1 = reader.nextInt();
		// Leo de la consola el segundo número entero.
		num2 = reader.nextInt();
		// Leo de la consola el tercer número entero.
		num3 = reader.nextInt();

		// Creo una estructura if-else if-else para determinar cuál de los tres números
		// es el mayor.
		if (num1 > num2 && num1 > num3) {
			// Si num1 es mayor que num2 Y num1 es mayor que num3, imprime "El número 1 es
			// mayor".
			System.out.println("El número 1 es mayor");
		} else if (num2 > num1 && num2 > num3) {
			// Si la condición anterior no se cumple Y num2 es mayor que num1 Y num2 es
			// mayor que num3,
			// imprime "El número 2 es mayor".
			System.out.println("El número 2 es mayor");
		} else {
			// Si ninguna de las condiciones anteriores se cumple, imprime "El número 3 es
			// mayor".
			// (Esto cubre el caso en que num3 es el mayor, o si hay empates donde num3 es
			// igual al mayor).
			System.out.println("El número 3 es mayor");
		}

		// Cierro el Scanner.
		reader.close();
	}

}