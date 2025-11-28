package gemteacher;

import java.util.Scanner;

public class Forexercise01 {
	/*
	 * Ejercicio: "La Calculadora de Promedio" El Enunciado: Necesitamos un programa
	 * que calcule la nota media de un grupo de exámenes.
	 * 
	 * Primero, el programa debe preguntar al usuario cuántas notas va a introducir.
	 * 
	 * A continuación, debe pedir las notas una por una.
	 * 
	 * Finalmente, debe mostrar por pantalla el promedio (la media) de esas notas.
	 */
	public static void main(String[] args) {
		// Declaro la variable tipo int para el nº de notas a introducir límite del for
		int numNotas;
		// Declaro la variable tipo double para almacenar la info que me de el usuario
		// por nota
		double nota;
		// Declaro la variable sumaNotas para almacenar la suma de todas las notas
		// introducidas
		double sumaNotas = 0;
		// Declaro la variable mediaNotas para almacenar la media de todas las notas
		// introducidas
		double mediaNotas = 0;
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Solicito y leo de la consola el nº de notas que introduce el usuario
		System.out.println("Introduce el nº de notas que vas a insertar");
		numNotas = sc.nextInt();
		// Creo el bucle for para que el programa le pida notas al usuario hasta que
		// llegue al límite marcado por la variable numNotas, y se vayan acumulando en
		// sumaNotas en cada iteración
		for (int i = 1; i <= numNotas; i++) {
			do {
				System.out.println("Introduce la nota nº"+i);
				nota = sc.nextDouble();
				if (nota < 0 || nota > 10) {
					System.out.println("La nota debe estar entre 0 y 10");
				}

			} while (nota < 0 || nota > 10);

			sumaNotas += nota;
		}
		// Calculo la media final dividiendo la suma de las notas almacenada en el for
		// entre el numNotas introducido al inicio del programa, pero con un if por si
		// el usuario pone numNotas es igual a 0
		if (numNotas > 0) {
			mediaNotas = sumaNotas / numNotas;
			// Imprimo el mensaje final con la media de las notas
			System.out.println("La media de las notas introducidas es " + mediaNotas);
		} else {
			System.out.println("No se ha introducido ninguna nota");
		}

		// Cierro el Scanner
		sc.close();
	}

}
