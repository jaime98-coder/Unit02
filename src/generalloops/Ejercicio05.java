package generalloops;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int num;
		int repeticiones = 0;
		Scanner reader = new Scanner(System.in);

		// Solicito y leo de la consola un nº entero al usuario
		System.out.println("Introduce un nº entero entre 0 y 20");
		num = reader.nextInt();

		// Creo un bucle while para establecer los límites,e imprimir un mensaje de
		// error si se cumple y volver a solicitarle un número
		while (num < 0 || num > 20) {
			System.out.println("Error, introduce un número entero entre 0 y 20");
			num = reader.nextInt();

		}
		// Creo un bucle exterior for que cuente desde 1 hasta el número introducido
		for (int i = 1; i <= num; i++) {
			// Creo un bucle que imprima (sin salto de linea) el número introducido
			for (int j = 1; j <= i; j++) {
				System.out.print(i);

			}
			// Hago un salto de línea para saltar a la siguiente fila
			System.out.println();
		}
		// Cierro el Scanner
		reader.close();
	}

}
