package englishexercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Declare the constants (interest rates for each account type)
		// Interest rate for account A (1.5%)
		final double A_ACCOUNT = 0.015;
		// Interest rate for account B (2.0%)
		final double B_ACCOUNT = 0.02;
		// Interest rate for account C (1.5%)
		final double C_ACCOUNT = 0.015;
		// Interest rate for account X (5.0%)
		final double X_ACCOUNT = 0.05;

		// Declare the variables
		// Stores the amount of money introduced by the user
		double money;
		// Stores the type of account selected by the user (A, B, C, or X)
		String typeAccount;

		// Creating the Scanner
		Scanner reader = new Scanner(System.in);

		// Asking to the user to introduce the money
		System.out.println("Introduce the money:");
		// Reading the money introduced by the user through the console
		money = reader.nextDouble();

		// Asking to the user to select the account type
		System.out.println("Select a type of bank account:");
		System.out.println("A: 1.5%");
		System.out.println("B: 2.0%");
		System.out.println("C: 1.5%");
		System.out.println("X: 5%");

		// Reading the account type and converting it to uppercase
		typeAccount = reader.next().toUpperCase();

		// Calculating the new total money based on the account type
		switch (typeAccount) {
		case "A" -> {
			// Calculate interest for account A and add it to the money
			money = money * A_ACCOUNT + money;
		}
		case "B" -> {
			// Calculate interest for account B and add it to the money
			money = money * B_ACCOUNT + money;
		}
		case "C" -> {
			// Calculate interest for account C and add it to the money
			money = money * C_ACCOUNT + money;
		}
		case "X" -> {
			// Calculate interest for account X and add it to the money
			money = money * X_ACCOUNT + money;
		}
		// Handling an invalid option
		default -> {
			System.out.println("¡Error, write A,B,C or X!");
		}
		}
		// Printing the final money with the interest applied
		System.out.println("The money with the interest is " + money);

		// Closing the Scanner
		reader.close();
	}

}