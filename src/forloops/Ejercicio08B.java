package forloops;

import java.util.Scanner;

public class Ejercicio08B {

	public static void main(String[] args) {
		// Variable donde almacenar el número A
		int numA;
		
		// Variable donde almacenar el número B
		int numB;
		
		// Variables para ver quién es menor y quién es mayor
		int menor;
		int mayor;
		
		// Scanner para pedir los números
		Scanner reader = new Scanner(System.in);
		
		// Pido los dos números
		System.out.println("Introduzca el primer número:");
		numA = reader.nextInt();
		
		// Pido los dos números
		System.out.println("Introduzca el segundo número:");
		numB = reader.nextInt();
		
		// Utilizar las funciones de Math para el mínimo y el máximo
		menor = Math.min(numA, numB);
		mayor = Math.max(numA, numB);
		
		// Miramos quién es menor y quién es mayor
//		if(numA < numB) {
//			menor = numA;
//			mayor = numB;
//		} else {
//			menor = numB;
//			mayor = numA;
//		}
		
		// Vamos desde el número más pequeño al número más grande
		for(int cont = menor; cont<=mayor; cont++) {
			System.out.println(cont);
		}
		
		// Cierro el scanner
		reader.close();

	}

}