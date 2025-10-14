package diagrams;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creo las variables num1 y num2
		int num1;
		int num2;

		// Creo las variables para realizar la suma
		int suma;

		// Creo las variables para realizar la resta
		int resta;

		// Creo las variables para realizar la multiplicacion
		int multiplicacion;

		// Creo las variables para realizar la división
		double division;

		// Creo el Scannner y leo valores introducidos en num1 y num2
		Scanner reader = new Scanner(System.in);
		num1 = reader.nextInt();
		num2 = reader.nextInt();
		
		// Asigno a la variable suma, resta y multiplicación los valores introducidos
		// por el usuario en num1 y num2
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		
		// Imprimo los valores de las variables suma, resta, multiplicación
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multiplicacion);
		
		// Creo el if poniendole la condición de si el num2 == 0
		if (num2 == 0) {
			// Imprimo el mensaje no se puede dividir
			System.out.println("No se puede dividir entre 0");
			// Creo el else para cuando no se cumple la condición
		} else {
			// Asigno a la variable división los valores introducido por el usuario en num1 y num2
			division = (double)num1 / num2;
			// Imprimo el mensaje del valor de la división
			System.out.println(division);
		}
		// Cierro el Scanner
		reader.close();
	}
}
