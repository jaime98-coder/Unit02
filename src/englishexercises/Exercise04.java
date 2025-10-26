package englishexercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		int clientMustPay;
		int clientGives;
		int change;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce the money that the client must pay:");
		clientMustPay=reader.nextInt();
		System.out.println("Introduce the money that the client gives you:");
		clientGives=reader.nextInt();
		
		
		reader.close();
	}

}
