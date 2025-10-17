package ifelse;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce número 1");
		num1 = reader.nextInt();
		System.out.println("Introduce número 2");
		num2 = reader.nextInt();
		System.out.println("Introduce número 3");
		num3 = reader.nextInt();
		if (num1+num2==num3) {
			System.out.println("La suma de número 1 y número 2 es igual al número 3");
		} else if (num2+num3==num1) {
			System.out.println("La suma de número 2 y número 3 es igual al número 1");
		} else if (num1+num3==num2) {
			System.out.println("La suma de número 1 y número 3 es igual al número 2");
		}
	reader.close();
	}

}
