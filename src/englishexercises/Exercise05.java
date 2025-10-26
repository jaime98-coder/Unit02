package englishexercises;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		double displacement=0;
		double time=0;
		double velocity=0;
		String dataType1;
		String dataType2;
		Scanner reader = new Scanner(System.in);
		System.out.println("Give me one type of data (D, T or V)");
		dataType1 = reader.next();
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

		System.out.println("Give me another type of data (D, T or V)");
		dataType2 = reader.next();
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
		if (velocity==0) {
			velocity=displacement/time;
		}else if (displacement==0) {
			displacement=velocity*time;
		}else if (time==0) {
			time=displacement/velocity;
		}
		System.out.println("Velocity="+velocity);
		System.out.println("Displacement="+displacement);
		System.out.println("Time="+time);
		reader.close();
	}

}
