package generalloops;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int filas;
		Scanner reader = new Scanner(System.in);
		
		// Solicita y lee de la consola el nº de filas
		System.out.println("Introduce el número de filas (n):");
		filas = reader.nextInt();
		// Bucle externo para las filas
		for (int i=1; i<=filas; i++) {
			// Parte ascendente
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			// Parte descendente
			for (int k=i-1; k>=1; k--) {
				System.out.print(k);
			}
			// Hago un salto de línea para saltar a la siguiente fila
			System.out.println();
		}
		reader.close();
	}

}
