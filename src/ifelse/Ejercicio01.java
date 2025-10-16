package ifelse;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Declaro la variable num
		int num;
		
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Solicito un número y leo de la consola el número introducido
		System.out.println("Introduce un número");
		num = reader.nextInt();
		
		// Creo el if para ver si el número es par, es par si el módulo de 2 da 0 como resultado.
		if (num%2==0) {
			// Imprimo el mensaje indicando que es par
			System.out.println("Es par");
		} else {
			// Imprimo el mensaje indicando que es par
			System.out.println("Es impar");
		}
		
		// Cierro el Scanner
		reader.close();
	}
}
