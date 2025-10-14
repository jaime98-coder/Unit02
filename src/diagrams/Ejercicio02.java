package diagrams;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int edad;
		Scanner reader = new Scanner(System.in);
		edad = reader.nextInt();
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		reader.close();
	}

}
