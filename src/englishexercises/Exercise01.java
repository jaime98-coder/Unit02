package englishexercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Declare the constants (prices for optional items)
		// Price for the 38cm screen
		final double SCREEN1_38 = 75.99;
		// Price for the 43cm screen
		final double SCREEN2_43 = 99.99;
		// Price for the antivirus software
		final double AVSOFTWARE = 65.99;
		// Price for the printer
		final double PRINTER = 125.00;

		// Declare the variables
		// Stores the user's numeric choice for the screen (1 or 2)
		int option;
		// Stores the accumulated total cost (starts with a base price)
		double totalPrice = 375.99;
		// Stores the user's "Y/N" response
		String answer;

		// Creating the Scanner
		Scanner reader = new Scanner(System.in);

		// Asking to the user to choose the screen
		System.out.println("Which screen do you prefer?");
		System.out.println("1. 38cm -" + SCREEN1_38);
		System.out.println("2. 43cm -" + SCREEN2_43);

		// Reading the option introduced by the user through the console
		option = reader.nextInt();

		// Adding the screen price to the total price based on the user's option
		switch (option) {
		case 1:
			totalPrice += SCREEN1_38;
			break;
		case 2:
			totalPrice += SCREEN2_43;
			break;
		}
		// Asking to the user if they want an antivirus software
		System.out.println("Do you want an antivirus software? (Y/N)");
		// Reading the answer introduced by the user through the console
		answer = reader.next();
		// Adding the antivirus software price if the answer is yes
		if (answer.equalsIgnoreCase("Y")) {
			totalPrice += AVSOFTWARE;
		}
		// Asking to the user if they want a printer
		System.out.println("Do you want a printer? (Y/N)");
		// Reading the answer introduced by the user through the console
		answer = reader.next();
		// Adding the printer price if the answer is yes
		if (answer.equalsIgnoreCase("Y")) {
			totalPrice += PRINTER;
		}
		// Printing the final total price
		System.out.println("Total Price:" + totalPrice);

		// Closing the Scanner
		reader.close();

	}

}