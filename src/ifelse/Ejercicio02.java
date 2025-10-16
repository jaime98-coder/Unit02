package ifelse;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Declaro la variable num
		double num;
		
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Solicito que introduzca un número y leo de la consola
		System.out.println("Introduzca el número");
		num= reader.nextDouble();
		
		// Creo el if indicando los límites y los que no son casi cero.
		if (num>-1 && num<1 && num!=0) {
			// Imprimo mensaje indicando que es un casi cero
			System.out.println("Es un casi cero");
		} else {
			// Imprimo mensaje indicando que es un casi cero
			System.out.println("No es un casi cero");
		}
		// Cierro el Scanner
		reader.close();
	}

}
