package generalloops;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Número introducido por el usuario
		int numero;

		// Número con las cifras invertidas
		int numInvertido = 0;

		// Número auxiliar para realizar las operaciones
		int numAux;

		// Última cifra del número
		int ultimaCifra;

		// Scanner para leer el número
		Scanner reader = new Scanner(System.in);

		// Le pedimos un número al usuario
		System.out.println("Introduzca un número:");
		numero = reader.nextInt();

		// Almacenamos en la variable auxiliar el número introducido por el usuario
		numAux = numero;

		while (numAux > 0) {
			ultimaCifra = numAux % 10;
			numInvertido = numInvertido * 10 + ultimaCifra;
			numAux /= 10;
		}

		System.out.println(numInvertido == numero ? "Es capicúa" : "No es capicúa");

		// Cerramos el Scanner
		reader.close();

	}

}
