package diagrams;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int num1;
		Scanner reader = new Scanner(System.in);
		num1 = reader.nextInt();
		if (num1>=0) {
			System.out.println("Es positivo");
		} else {
			System.out.println("Es negativo");
		}
		reader.close();
	}

}
