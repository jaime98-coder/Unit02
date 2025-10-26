package englishexercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		int clientMustPay;
		int clientGives;
		int changeNumber;
		int numCoin200 = 200;
		int numCoin100 = 100;
		int numCoin50 = 50;
		int numCoin20 = 20;
		int numCoin10 = 10;
		int numCoin5 = 5;
		int numCoin2 = 2;
		int numCoin1 = 1;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce the money that the client must pay (in cents)");
		clientMustPay = reader.nextInt();
		System.out.println("Introduce the money that the client gives you (in cents)");
		clientGives = reader.nextInt();
		changeNumber = (clientMustPay - clientGives) * -1;
		System.out.println("The change is " + changeNumber + " cents");
		numCoin200 = changeNumber / 200;
		changeNumber = changeNumber % 200;
		numCoin100 = changeNumber / 100;
		changeNumber = changeNumber % 100;
		numCoin50 = changeNumber / 50;
		changeNumber = changeNumber % 50;
		numCoin20 = changeNumber / 20;
		changeNumber = changeNumber % 20;
		numCoin10 = changeNumber / 10;
		changeNumber = changeNumber % 10;
		numCoin5 = changeNumber / 5;
		changeNumber = changeNumber % 5;
		numCoin2 = changeNumber / 2;
		changeNumber = changeNumber % 2;
		numCoin1 = changeNumber / numCoin1;
		changeNumber = changeNumber % 1;
		System.out.println("Coins:" + numCoin200 + " " + numCoin100 + " " + numCoin50 + " " + numCoin20 + " "
				+ numCoin10 + " " + numCoin5 + " " + numCoin2 + " " + numCoin1);
		reader.close();
	}

}
