package englishexercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		final double SCREEN1_38 = 75.99;
		final double SCREEN2_43 = 99.99;
		final double AVSOFTWARE = 65.99;
		final double PRINTER = 125.00;
		int option;
		double totalPrice=375.99;
		String answer;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Which screen do you prefer?");
		System.out.println("1. 38cm -"+SCREEN1_38);
		System.out.println("2. 43cm -"+SCREEN2_43);
		option = reader.nextInt();
		
		switch (option) {
		case 1:
			totalPrice+=SCREEN1_38;
			break;
		case 2:
			totalPrice+=SCREEN2_43;
			break;
		}
		System.out.println("Do you want an antivirus software? (Y/N)");
		answer = reader.next();
		if (answer.equalsIgnoreCase("Y")) {
			totalPrice+=AVSOFTWARE;
		}
		System.out.println("Do you want a printer? (Y/N)");
		answer = reader.next();
		if (answer.equalsIgnoreCase("Y")) {
			totalPrice+=PRINTER;
		}
		System.out.println("Total Price:"+totalPrice);
		
		reader.close();
		
	}

}
