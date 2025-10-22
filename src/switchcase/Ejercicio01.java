package switchcase;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Declaro la variable 'nota' para almacenar la calificación entera introducida
		// por el usuario.
		int nota;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Solicito y leo de la consola una nota entera al usuario.
		System.out.println("Introduce una nota entera");
		nota = reader.nextInt();

		// Creo un switch para determinar la calificación textual de la nota
		// introducida.
		switch (nota) {
		// Creo el case para las notas de 1 a 4. Si la nota coincide con alguno de estos
		// valores,
		// imprime "Insuficiente". Finalizo el bloque con break.
		case 1, 2, 3, 4:
			System.out.println("Insuficiente");
			break;

		// Creo el case para la nota 5, que corresponde a "Suficiente". Finalizo el
		// bloque con break.
		case 5:
			System.out.println("Suficiente");
			break;

		// Creo el case para la nota 6, que corresponde a "Bien". Finalizo el bloque con
		// break.
		case 6:
			System.out.println("Bien");
			break;

		// Creo el case para las notas 7 y 8, que corresponden a "Notable". Finalizo el
		// bloque con break.
		case 7, 8:
			System.out.println("Notable");
			break;

		// Creo el case para las notas 9 y 10, que corresponden a "Sobresaliente".
		// Finalizo el bloque con break.
		case 9, 10:
			System.out.println("Sobresaliente");
			break;

		// Creo el default case para indicar que el valor introducido no está en el
		// rango esperado (típicamente de 1 a 10).
		default:
			System.out.println("El valor introducido es incorrecto");
		}

		// Cierro el Scanner.
		reader.close();
	}

}