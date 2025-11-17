package generalloops;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		int num;
		boolean esPrimo = true;
		int cuentaPrimos = 0;
		int divisor = 2;

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce un número para saber cuantos primos hay entre 1 y este");
		num = reader.nextInt();
		for (int cont = 2; cont <= num; cont++) {
			divisor = 2;
			esPrimo = true;
			while (divisor < cont && esPrimo) {
				if (cont % divisor == 0) {
					esPrimo = false;
				}
				divisor++;
			}
			if (esPrimo) {
				cuentaPrimos++;
			}
			// Imprimimos cuantos primos hay

		}
		System.out.println("Hay " + cuentaPrimos+"números primos");

		reader.close();
	}
}
