package englishexercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		int mirrorHour;
		int mirrorMinute;

		int realHour;
		int realMinute;
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce the hour that you are seeing in the mirror:");
		mirrorHour = reader.nextInt();
		System.out.println("Introduce the minutes that you are seeing in the mirror:");
		mirrorMinute = reader.nextInt();

		// if hour==12 I change it to 0 to operate later
		mirrorHour = (mirrorHour == 12) ? 0 : mirrorHour;

		// Hour oclock
		if (mirrorMinute == 0) {
			realHour = 12 - mirrorHour;
			realMinute = 0;

		} else {
			// Not hour oclock
			realHour = 11 - mirrorHour;
			realMinute = 60 - mirrorMinute;
		}

		if (realHour < 10) {
			System.out.print("0");
		}
		System.out.print(realHour + ":");

		if (realMinute < 10) {
			System.out.print("0");
		}
		System.out.println(realMinute);

		reader.close();
	}

}
