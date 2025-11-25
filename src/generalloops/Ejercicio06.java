package generalloops;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int tamaño;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce un número para utilizarlo como base y como altura en el dibujo del triángulo");
		tamaño=reader.nextInt();
		for (int i=1; i<=tamaño; i++) {
			
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
		}
		
		reader.close();
	}

}
