package englishexercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Declare the variables
		// Stores the hour seen in the mirror
		int mirrorHour;
		// Stores the minutes seen in the mirror
		int mirrorMinute;

		// Stores the calculated real hour
		int realHour;
		// Stores the calculated real minutes
		int realMinute;

		// Creating the Scanner
		Scanner reader = new Scanner(System.in);

		// Asking to the user to introduce the mirror hour
		System.out.println("Introduce the hour that you are seeing in the mirror:");
		// Reading the hour introduced by the user through the console
		mirrorHour = reader.nextInt();
		// Asking to the user to introduce the mirror minutes
		System.out.println("Introduce the minutes that you are seeing in the mirror:");
		// Reading the minutes introduced by the user through the console
		mirrorMinute = reader.nextInt();

		// Converting 12 o'clock to 0 to simplify the calculation
		mirrorHour = (mirrorHour == 12) ? 0 : mirrorHour;

		// Calculating the real time
		// Checking if the time is exactly on the hour
		if (mirrorMinute == 0) {
			// If it's o'clock, the real hour is 12 minus the mirror hour
			realHour = 12 - mirrorHour;
			// The minutes are 0
			realMinute = 0;

		} else {
			// If it's not on the hour
			// The real hour is calculated based on 11
			realHour = 11 - mirrorHour;
			// The real minutes are 60 minus the mirror minutes
			realMinute = 60 - mirrorMinute;
		}

		// Printing the real time with correct formatting (HH:MM)
		// Adding a leading zero to the hour if it's less than 10
		if (realHour < 10) {
			System.out.print("0");
		}
		// Printing the hour and the separator
		System.out.print(realHour + ":");

		// Adding a leading zero to the minutes if they are less than 10
		if (realMinute < 10) {
			System.out.print("0");
		}
		// Printing the minutes
		System.out.println(realMinute);

		// Closing the Scanner
		reader.close();
	}

}