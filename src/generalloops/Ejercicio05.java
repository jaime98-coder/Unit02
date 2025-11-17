package generalloops;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int num;
		int repeticiones=0;
		Scanner reader = new Scanner(System.in);
		
	
		System.out.println("Introduce un nº entero entre 0 y 20");
		num=reader.nextInt();
		while (num<0 || num>20 ) {
			System.out.println("Error, introduce un número entero entre 0 y 20");
			num=reader.nextInt();
			
		}
		for (int i=1;i<=num;i++ ) {

			for (int j=1; j<=i; j++) {
				System.out.print(i);
						
			}
			System.out.println();
		}
		
		reader.close();
	}

}
