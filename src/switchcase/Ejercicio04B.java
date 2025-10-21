package switchcase;

import java.util.Scanner;

public class Ejercicio04B {

	public static void main(String[] args) {
		String tiradaUno;
		String tiradaDos;
		int tiradaUnoNum=0;
		int tiradaDosNum=0;
		int sumaTiradas;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce con letras cuánto has sacado en la primera tirada del dado \nPrimera tirada: ");
		tiradaUno = reader.next();
		if (tiradaUno.equalsIgnoreCase("UNO")) {
			tiradaUnoNum = 1;
		} else if (tiradaUno.equalsIgnoreCase("DOS")) {
			tiradaUnoNum = 2;
		} else if (tiradaUno.equalsIgnoreCase("TRES")) {
			tiradaUnoNum = 3;
		} else if (tiradaUno.equalsIgnoreCase("CUATRO")) {
			tiradaUnoNum = 4;
		} else if (tiradaUno.equalsIgnoreCase("CINCO")) {
			tiradaUnoNum = 5;
		} else if (tiradaUno.equalsIgnoreCase("SEIS")) {
			tiradaUnoNum = 6;
		} else {
			System.out.println("Tiene que ser un número del 1 al 6");
		}

		System.out.println("Introduce con letras cuánto has sacado en la segunda tirada del dado \nSegunda tirada: ");
		tiradaDos = reader.next();
		if (tiradaDos.equalsIgnoreCase("UNO")) {
			tiradaDosNum = 1;
		} else if (tiradaDos.equalsIgnoreCase("DOS")) {
			tiradaDosNum = 2;
		} else if (tiradaDos.equalsIgnoreCase("TRES")) {
			tiradaDosNum = 3;
		} else if (tiradaDos.equalsIgnoreCase("CUATRO")) {
			tiradaDosNum = 4;
		} else if (tiradaUno.equalsIgnoreCase("CINCO")) {
			tiradaDosNum = 5;
		} else if (tiradaUno.equalsIgnoreCase("SEIS")) {
			tiradaDosNum = 6;
		} else {
			System.out.println("Tiene que ser un número del 1 al 6");
		}
		sumaTiradas = tiradaUnoNum + tiradaDosNum;
		System.out.println("La suma de las dos tiradas es: " + sumaTiradas);
		
		reader.close();
	}

}
