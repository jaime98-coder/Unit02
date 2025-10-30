package whileloops;

import java.util.Scanner;

public class DiagramEjercicio01 {

	public static void main(String[] args) {
		// Declaro la variable suma y la inicializo a 0
		double suma = 0;
		// Declaro la variable número la cual voy a utilizar para que el usuario
		// introduzca
		double numero;

		// Creo el Scanner
		Scanner reader = new Scanner(System.in);

		// Solicito al usuario que introduzca un número y leo de la consola el valor
		// introducido
		System.out.println("Introduce un número");
		numero = reader.nextDouble();

		// Creo el bucle con la condición de que siempre NO SEA NEGATIVO (>=0) ejecute
		// el código que contiene
		while (numero >= 0) {
			// Le asigno a la variable suma el valor de sumarle el numero introducido por el
			// usuario
			suma += numero;
			// Solicito al usuario otro número y leo de la consola
			System.out.println("Introduce otro número para sumarlo");
			numero = reader.nextDouble();
		}

		// Imprimo el resultado de la suma de los números introducidos por el usuario
		System.out.println("La suma es: " + suma);

		// Cierro el Scanner
		reader.close();
	}

}
