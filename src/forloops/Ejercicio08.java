package forloops;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		int numA;
		int numB;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce número A:");
		numA=reader.nextInt();
		System.out.println("Introduce número B:");
		numB=reader.nextInt();
		if (numA<numB) {
			for (int contador=numA;contador<=numB;contador++) {
				System.out.println(contador);
			}
		} else if (numB<numA) {
			for (int contador=numB;contador<=numA;contador++) {
				System.out.println(contador);
			}
		}
		
		reader.close();

	}

}
