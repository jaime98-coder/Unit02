package switchcase;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Declaro las variables num 1 y num2 para los valores que van a realizar la
		// operación
		double num1;
		double num2;
		// Declaro la variable resultado para el resultado de la operación
		double resultado;
		// Declaro la variable para el código a seleccionar por el usuario por la
		// operación
		String codigoOperacion;

		// Creo el Scanner
		Scanner reader = new Scanner(System.in);

		// Solicito y leo de la consola número 1 y número 2 al usuario
		System.out.println("Introduzca número 1");
		num1 = reader.nextDouble();
		System.out.println("Introduzca número 2");
		num2 = reader.nextDouble();

		// Solicito al usuario que elija la operación a realizar con los números
		// introducidos, y le muestro las diferentes operaciones según el código
		// seleccionado, y leo de la consola el código introducido
		System.out.println("Elije una operación de la A a la D");
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		// Paso a mayúscula la opción introducida con .toUpperCase
		codigoOperacion = reader.next().toUpperCase();

		// Creo un switch con el código introducido por el usuario
		switch (codigoOperacion) {
		// Creo el case 1 para realizar la operación de sumar los números, le asigno a
		// la variable resultado la suma de ambos números e imprimo en pantalla el
		// resultado que da. Por último finalizo la operación con un break

		case "A":
			System.out.println("A. SUMAR LOS NÚMEROS");
			resultado = num1 + num2;
			System.out.println("Suma = " + resultado);
			break;
		// Creo el case 2 para realizar la operación de restar los números, le asigno a
		// la variable resultado la resta de ambos números e imprimo en pantalla el
		// resultado que da. Por último finalizo la operación con un break

		case "B":
			System.out.println("B. RESTAR LOS NÚMEROS");
			resultado = num1 - num2;
			System.out.println("Resta = " + resultado);
			break;

		// Creo el case 3 para realizar la operación de multiplicar los números, le
		// asigno a
		// la variable resultado la multiplicación de ambos números e imprimo en
		// pantalla el
		// resultado que da. Por último finalizo la operación con un break

		case "C":
			System.out.println("C. MULTIPLICAR LOS NÚMEROS");
			resultado = num1 * num2;
			System.out.println("Multiplicación = " + resultado);
			break;

		// Creo el case 4 para realizar la operación de dividir los números, le
		// asigno a la variable resultado la multiplicación de ambos números e imprimo
		// en pantalla el
		// resultado que da. Por último finalizo la operación con un break
		case "D":
			System.out.println("D. DIVIDIR LOS NÚMEROS");
			if (num2 != 0) {
				resultado = num1 / num2;
				System.out.println("División = " + resultado);
			} else {
				System.out.println("No se puede dividir entre 0");
			}

			break;
		// Creo el default case para indicar que el código que introdujo es erróneo
		default:
			System.out.println("Error, el número introducido debe ser un valor del 1 al 4");
		}
		// Cierro el Scanner
		reader.close();
	}

}
