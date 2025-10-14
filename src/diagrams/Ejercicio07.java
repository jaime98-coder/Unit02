package diagrams;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner reader = new Scanner(System.in);
		num1 = reader.nextInt();
		num2 = reader.nextInt();
		if (num1>num2) {
			System.out.println("El número 1 es mayor");
		} else if (num1==num2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("El número 2 es mayor");
		}
		reader.close();
	}

}
