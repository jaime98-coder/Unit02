package ifelse;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		double num;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce un número para saber cuantas cifras tiene");
		num = reader.nextDouble();
		if (num>=10000 && num<=99999) {
			System.out.println("Tiene 5 cifras");
		} else if (num>=1000 && num<=9999) {
			System.out.println("Tiene 4 cifras");
		} else if (num>=100 && num<=999) {
			System.out.println("Tiene 3 cifras");
		} else if (num>=10 && num<=99) {
			System.out.println("Tiene 2 cifras");
		} else if (num>=0 && num<=9){
			System.out.println("Tiene 1 cifra");
		} else {
			System.out.println("Introduce un número que esté entre 0 y 99999 como máximo");
		}
		reader.close();
	}

}
