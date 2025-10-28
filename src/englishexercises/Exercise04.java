package englishexercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Declare the variables
		// Stores the amount the client must pay (in cents)
		int clientMustPay;
		// Stores the amount the client gives (in cents)
		int clientGives;
		// Stores the total change to be returned (in cents)
		int changeNumber;

		// Variables to store the count of each coin type
		// Stores the count of 2 euro (200 cents) coins
		int numCoin200 = 200;
		// Stores the count of 1 euro (100 cents) coins
		int numCoin100 = 100;
		// Stores the count of 50 cents coins
		int numCoin50 = 50;
		// Stores the count of 20 cents coins
		int numCoin20 = 20;
		// Stores the count of 10 cents coins
		int numCoin10 = 10;
		// Stores the count of 5 cents coins
		int numCoin5 = 5;
		// Stores the count of 2 cents coins
		int numCoin2 = 2;
		// Stores the count of 1 cent coins
		int numCoin1 = 1;

		// Creating the Scanner
		Scanner reader = new Scanner(System.in);

		// Asking to the user to introduce the total price
		System.out.println("Introduce the money that the client must pay (in cents)");
		// Reading the price introduced by the user through the console
		clientMustPay = reader.nextInt();

		// Asking to the user to introduce the money given
		System.out.println("Introduce the money that the client gives you (in cents)");
		// Reading the money given by the user through the console
		clientGives = reader.nextInt();

		// Calculating the total change (and converting the result to positive)
		changeNumber = (clientMustPay - clientGives) * -1;
		// Printing the total change
		System.out.println("The change is " + changeNumber + " cents");

		// Calculating the number of 200 cents coins
		numCoin200 = changeNumber / 200;
		// Updating the remaining change
		changeNumber = changeNumber % 200;

		// Calculating the number of 100 cents coins
		numCoin100 = changeNumber / 100;
		// Updating the remaining change
		changeNumber = changeNumber % 100;

		// Calculating the number of 50 cents coins
		numCoin50 = changeNumber / 50;
		// Updating the remaining change
		changeNumber = changeNumber % 50;

		// Calculating the number of 20 cents coins
		numCoin20 = changeNumber / 20;
		// Updating the remaining change
		changeNumber = changeNumber % 20;

		// Calculating the number of 10 cents coins
		numCoin10 = changeNumber / 10;
		// Updating the remaining change
		changeNumber = changeNumber % 10;

		// Calculating the number of 5 cents coins
		numCoin5 = changeNumber / 5;
		// Updating the remaining change
		changeNumber = changeNumber % 5;

		// Calculating the number of 2 cents coins
		numCoin2 = changeNumber / 2;
		// Updating the remaining change
		changeNumber = changeNumber % 2;

		// Calculating the number of 1 cent coins
		numCoin1 = changeNumber / numCoin1;
		// Updating the remaining change (will be 0)
		changeNumber = changeNumber % 1;

		// Printing the final breakdown of all coins
		System.out.println("Coins:" + numCoin200 + " " + numCoin100 + " " + numCoin50 + " " + numCoin20 + " "
				+ numCoin10 + " " + numCoin5 + " " + numCoin2 + " " + numCoin1);

		// Closing the Scanner
		reader.close();
	}

}