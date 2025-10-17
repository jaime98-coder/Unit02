package ifelse;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		double num;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce un número para saber cuantas cifras tiene");
		num = reader.nextDouble();
		if (num<0 || num>99999) {
			System.out.println("Número incorrecto");
		} else if (num<100000) {
			System.out.println("Tiene 5 cifras");
		} else if (num<10000) {
			System.out.println("Tiene 4 cifras");
		} else if (num<1000) {
			System.out.println("Tiene 3 cifras");
		} else if (num<100) {
			System.out.println("Tiene 2 cifras");
		} else {
			System.out.println("Tiene 1 cifra");
		}
		reader.close();
	}

}
