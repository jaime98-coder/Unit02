package englishexercises;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Declare the variables
		// Stores the displacement value (initialized to 0)
		double displacement = 0;
		// Stores the time value (initialized to 0)
		double time = 0;
		// Stores the velocity value (initialized to 0)
		double velocity = 0;
		// Stores the first type of data selected by the user (D, T, or V)
		String dataType1;
		// Stores the second type of data selected by the user (D, T, or V)
		String dataType2;

		// Creating the Scanner
		Scanner reader = new Scanner(System.in);

		// Asking to the user to introduce the first data type
		System.out.println("Give me one type of data (D, T or V)");
		// Reading the first data type introduced by the user
		dataType1 = reader.next();

		// Asking for and reading the value for the first data type
		switch (dataType1) {
		case "D" -> {
			System.out.println("Give the value for that Data");
			displacement = reader.nextDouble();
		}
		case "T" -> {
			System.out.println("Give the value for that Data");
			time = reader.nextDouble();
		}
		case "V" -> {
			System.out.println("Give the value for that Data");
			velocity = reader.nextDouble();
		}
		default -> {
			System.out.println("Please insert D, T or V");
		}
		}

		// Asking to the user to introduce the second data type
		System.out.println("Give me another type of data (D, T or V)");
		// Reading the second data type introduced by the user
		dataType2 = reader.next();

		// Asking for and reading the value for the second data type
		switch (dataType2) {
		case "D" -> {
			System.out.println("Give the value for that Data");
			displacement = reader.nextDouble();
		}
		case "T" -> {
			System.out.println("Give the value for that Data");
			time = reader.nextDouble();
		}
		case "V" -> {
			System.out.println("Give the value for that Data");
			velocity = reader.nextDouble();
		}
		default -> {
			System.out.println("Please insert D,T or V");
		}
		}

		// Calculating the missing value (the one that is still 0)
		if (velocity == 0) {
			// Calculate velocity (V = D / T)
			velocity = displacement / time;
		} else if (displacement == 0) {
			// Calculate displacement (D = V * T)
			displacement = velocity * time;
		} else if (time == 0) {
			// Calculate time (T = D / V)
			time = displacement / velocity;
		}

		// Printing the final results for all three variables
		System.out.println("Velocity=" + velocity);
		System.out.println("Displacement=" + displacement);
		System.out.println("Time=" + time);

		// Closing the Scanner
		reader.close();
	}

}