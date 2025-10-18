package ifelse;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Declaro la variable para el num1
		int num1;
		// Declaro la variable para el num2
		int num2;
		// Declaro la variable para el num3
		int num3;

		// Creo el Scanner
		Scanner reader = new Scanner(System.in);

		// Solicito al usuario que introduzca los números y leo de la consola
		System.out.println("Introduce número 1");
		num1 = reader.nextInt();
		System.out.println("Introduce número 2");
		num2 = reader.nextInt();
		System.out.println("Introduce número 3");
		num3 = reader.nextInt();

		// Creo el IF con la primera posible combinación, donde si la suma de num1 +
		// num2 da num3 e imprimo el mensaje indicándolo
		if (num1 + num2 == num3) {
			System.out.println("La suma de número 1 y número 2 es igual al número 3");

			// Creo el IF con la segunda combinación, donde si la suma de num2 + num3 da
			// num1 e imprimo el mensaje indicándolo
		} else if (num2 + num3 == num1) {
			System.out.println("La suma de número 2 y número 3 es igual al número 1");

			// Creo el IF con la tercera combinación, donde si la suma de num1 + num3 da
			// num2 e imprimo el mensaje indicándolo
		} else if (num1 + num3 == num2) {
			System.out.println("La suma de número 1 y número 3 es igual al número 2");

			// Sino, por descarte indico que las sumas entre si no dan commo resultado otro
			// número
		} else {
			System.out.println("Las suma entre sí no dan como resultado uno de los otros números");
		}

		// Cierro el Scanner
		reader.close();
	}

}
