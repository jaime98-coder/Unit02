package gemteacher;

import java.util.Scanner;

public class Switchexercise01 {
	/*
	 * Ejercicio: "La Mini-Calculadora Iterativa" El Enunciado: Realiza un programa
	 * que muestre un menú con 3 opciones:
	 * 
	 * Sumar: Pide dos números y muestra la suma.
	 * 
	 * Restar: Pide dos números y muestra la resta.
	 * 
	 * Salir: Termina el programa.
	 * 
	 * Reglas de Comportamiento:
	 * 
	 * El menú debe repetirse indefinidamente hasta que el usuario pulse la opción
	 * 3.
	 * 
	 * Si el usuario pulsa una opción incorrecta (ej: 5), debe decirle
	 * "Opción no válida" y volver a mostrar el menú.
	 * 
	 * Importante sobre el switch: Aquí SÍ utilizaremos la palabra break, pero solo
	 * dentro de cada case del switch. Es obligatorio para que no se ejecuten todos
	 * los casos seguidos.
	 */
	public static void main(String[] args) {
		int opcion = 0;
		double resultado;
		double num1;
		double num2;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Elige una opción");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Salir del programa");
			opcion = sc.nextInt();
			switch (opcion) {
			// Caso 1 - Suma
			case 1:
				System.out.print("Introduce el primer nº: ");
				num1 = sc.nextDouble();
				System.out.print("Introduce el segundo nº: ");
				num2 = sc.nextDouble();
				resultado = num1 + num2;
				System.out.println("La suma de los dos números es: " + resultado);
				break;
			// Caso 2 - Resta
			case 2:
				System.out.print("Introduce el primer nº: ");
				num1 = sc.nextDouble();
				System.out.print("Introduce el segundo nº: ");
				num2 = sc.nextDouble();
				resultado = num1 - num2;
				System.out.println("La resta de los dos números es: " + resultado);
				break;
			// Caso 3 - Salir
			case 3:
				System.out.println("Has elegido salir.");
				break;
			default:
				System.out.println("ERROR. Tienes que elegir una de las opciones (1, 2 o 3)");
				break;
			}
		} while (opcion !=3);

		System.out.println("\n¡Fin del programa!");

		sc.close();
	}

}
