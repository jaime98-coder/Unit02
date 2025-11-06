package forloops;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int num;
		Scanner reader = new Scanner(System.in);
		num =reader.nextInt();
		for (int contador=1; contador<=num; contador++)
		
		System.out.println(contador);
		reader.close();
	}

}
