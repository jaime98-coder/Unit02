package forloops;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int num;
		boolean esPrimo=true;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce un número para saber si es o no primo");
		num = reader.nextInt();
		for (int contador=2; contador<=(num-1); contador++) {
			if(num%contador==0){
				esPrimo=false;
			}
		}
		System.out.println(esPrimo);
		reader.close();
		
	}

}
