package apuntes;

import java.util.Scanner;

public class Apuntes01 {

	public static void main(String[] args) {
		// Número introducido por el usuario
		int num;

		// Variable para determinar si el número es primo
		boolean esPrimo = true;

		int cont = 2;

		// Scanner para leer el número
		Scanner reader = new Scanner(System.in);

		// Pido un número al usuario
		System.out.println("Introduzca un número entero positivo:");
		num = reader.nextInt();

		if (num > 0) {
			// Si es positivo entonces hacemos el estudio de si es primo

			if (num == 1) {
				esPrimo = false;
			} else {
				// Si es distinto de 1
//				for (int cont = 2; cont < num ; cont++) {
//					if (num % cont == 0) {
//						esPrimo = false;
//						break;
//					}
//				}

				while (cont < num && esPrimo) {
					if (num % cont == 0) {
						esPrimo = false;
					}

					cont++;
				}
			}
			System.out.println(esPrimo ? "El número es primo" : "El número no es primo");
		} else {
			System.out.println("El valor introducido debe ser positivo");
		}

		
		
		// Cierre del scanner
		reader.close();
	}

}