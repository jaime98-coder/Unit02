package diagrams;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Declaro la variable entera para el num1
		int num1;
		// Declaro la variable entera para el num2
		int num2;
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Leo de la consola los valores introducidos por el usuario y los asigno a num1
		// y num2
		num1 = reader.nextInt();
		num2 = reader.nextInt();
		// Creo el if con la condición de si num1 es mayor que num 2 imprima el mensaje,
		// sino que finalice el programa sin hacer nada más
		if (num1 > num2) {
			System.out.println(num1);
		}
		// Cierro el Scanner
		reader.close();
	}

}
