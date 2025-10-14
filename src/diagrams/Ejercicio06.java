package diagrams;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner reader = new Scanner(System.in);
		num1 = reader.nextInt();
		num2 = reader.nextInt();
		if (num1>num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		reader.close();
	}

}
