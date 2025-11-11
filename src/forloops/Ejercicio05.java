package forloops;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int num;
		int factorial=1;
		Scanner reader = new Scanner (System.in);
		num=reader.nextInt();
		for (int contador=num; contador>=1; contador-- ) {
			System.out.print(contador);
			if (contador!=1) {
				System.out.print("*");
			}
			factorial*=contador;
		}
		System.out.println("="+factorial);
		
		reader.close();

	}

}
