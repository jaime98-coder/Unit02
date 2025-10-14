package diagrams;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		Scanner reader = new Scanner(System.in);
		num1 = reader.nextInt();
		num2 = reader.nextInt();
		num3 = reader.nextInt();
		if (num1>num2 && num1>num3) {
			System.out.println("El número 1 es mayor");
		} else if (num2>num1 && num2>num3){
			System.out.println("El número 2 es mayor");
		} else {
			System.out.println("El número 3 es mayor");
		}
		reader.close();
	}

}
