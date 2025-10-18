package ifelse;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Declaro la variable para el valor de a
		int a;
		// Declaro la variable para el valor de b
		int b;
		// Declaro la variable para el valor de c
		int c;
		// Declaro la variable para uno de los resultados de x
		double x1;
		// Declaro la variable para el otro resultado de x
		double x2;
		// Declaro la variable para el discriminante
		double discriminante;

		// Creo el Scanner
		Scanner reader = new Scanner(System.in);

		// Solicito al usuario que introduzca los valores de a, b y c y leo de la
		// consola el valor introducido
		System.out.println("Introduce valor de a");
		a = reader.nextInt();
		System.out.println("Introduce valor de b");
		b = reader.nextInt();
		System.out.println("Introduce valor de c");
		c = reader.nextInt();

		// Le asigno el valor al discriminante
		discriminante = Math.pow(b, 2) - 4 * a * c;

		// Creo un IF donde si el valor de a es 0, indicar que es una ecuacion de primer
		// grado y el resultado de la misma
		if (a == 0) {
			x1 = (double) -c / b;
			System.out.println("La ecuación tiene solo una solución: " + x1);
			// Creo un ELSE IF para calcular los 2 posibles resultados en el caso de que el
			// discriminante sea mayor o igual a 0

		} else if (discriminante >= 0) {
			// Si es positivo, y se aplica la fórmula
			x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
			System.out.println("El resultado 1 de la ecuación es: " + x1);
			System.out.println("El resultado 2 de la ecuación es: " + x2);

		} else {
			// Si es negativo, no tiene solución
			System.out.println("La ecuación no tiene solución");
		}

		// Cierro el Scanner
		reader.close();
	}

}
