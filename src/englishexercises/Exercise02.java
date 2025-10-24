package englishexercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		final double A_ACCOUNT = 0.015;
		final double B_ACCOUNT = 0.02;
		final double C_ACCOUNT = 0.015;
		final double X_ACCOUNT = 0.05;
		double money;
		String typeAccount;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce the money:");
		money = reader.nextDouble();
		System.out.println("Select a type of bank account:");
		System.out.println("A: 1.5%");
		System.out.println("B: 2.0%");
		System.out.println("C: 1.5%");
		System.out.println("X: 5%");
		
		typeAccount=reader.next().toUpperCase();
		
		switch (typeAccount) {
		case "A"->{
			money=money*A_ACCOUNT+money;
		}
		case "B"->{
			money=money*B_ACCOUNT+money;
		}
		case "C"->{
			money=money*C_ACCOUNT+money;
		}
		case "X"->{
			money=money*X_ACCOUNT+money;
		} default->{
			System.out.println("¡Error, write A,B,C or X!");
		}
		}
		System.out.println("The money with the interest is "+money);
		
		
		reader.close();
	}

}
