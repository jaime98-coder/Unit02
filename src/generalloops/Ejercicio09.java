package generalloops;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		int num;
		int aux;
		int i=0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce un nº para saber cuantas cifras tiene");
		do {
			num = reader.nextInt();
			System.out.println("Por favor introduce un número mayor de 0");
		} while (num <= 0);
		aux=num;
		while (aux>0) {
			aux/=10;
			i++;
		}
		System.out.println("Tiene "+i+" cifras");
		System.out.println("El número inicial fue: "+num);
		System.out.println("\nFin del programa =)");
		reader.close();

		
		
		/*
		 * do { if (num >= 0 && num <= 9) { System.out.println("Tiene 1 cifra"); } else
		 * if (num >= 10 && num <= 99) { System.out.println("Tiene 2 cifras"); } else if
		 * (num >= 100 && num <= 999) { System.out.println("Tiene 3 cifras"); } else if
		 * (num >= 1000 && num <= 9999) { System.out.println("Tiene 4 cifras"); } else
		 * if (num >= 10000 && num <= 99999) { System.out.println("Tiene 5 cifras"); }
		 * else if (num >= 100000 && num <= 999999) {
		 * System.out.println("Tiene 6 cifras"); } } while (num<=0);
		 * System.out.println("Introduce un nº positivo, por favor.");
		 */
	}

}
