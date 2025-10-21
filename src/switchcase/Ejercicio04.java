package switchcase;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		String tiradaUno;
		String tiradaDos;
		
		int sumaTiradas;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce con letras cuánto has sacado en la primera tirada del dado \nPrimera tirada: ");
		tiradaUno = reader.next().toUpperCase();
		int tiradaUnoNum = switch (tiradaUno) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default ->{
			System.out.println("No puedes sacar más de 6 en el dado, y con LETRAS");
			yield -1;
		}
		};
		System.out.println("Introduce con letras cuánto has sacado en la segunda tirada del dado \nSegunda tirada: ");
		tiradaDos = reader.next().toUpperCase();
		int tiradaDosNum = switch (tiradaDos) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default ->{
			System.out.println("No puedes sacar más de 6 en el dado, y con LETRAS");
			yield -1;
		}
		};
		sumaTiradas = tiradaUnoNum + tiradaDosNum;
		System.out.println("La suma de las dos tiradas es: " + sumaTiradas);
		reader.close();
	}

}
