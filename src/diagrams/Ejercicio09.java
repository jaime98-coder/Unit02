package diagrams;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Declaro la variable 'calificacion' para almacenar la nota entera introducida
		// por el usuario.
		int calificacion;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Leo de la consola la calificación entera del usuario.
		calificacion = reader.nextInt();

		// Creo una estructura if-else if-else para determinar la calificación textual
		// según el rango de la nota.
		if (calificacion >= 0 && calificacion < 3) {
			// Si la calificación está entre 0 (incluido) y 3 (excluido), imprime "Muy
			// deficiente".
			System.out.println("Tu nota es " + calificacion + ". Muy deficiente");
		} else if (calificacion >= 3 && calificacion < 5) {
			// Si no, si está entre 3 (incluido) y 5 (excluido), imprime "Insuficiente".
			System.out.println("Tu nota es " + calificacion + ". Insuficiente");
		} else if (calificacion >= 5 && calificacion < 7) {
			// Si no, si está entre 5 (incluido) y 7 (excluido), imprime "Bien".
			System.out.println("Tu nota es " + calificacion + ". Bien");
		} else if (calificacion >= 7 && calificacion < 9) {
			// Si no, si está entre 7 (incluido) y 9 (excluido), imprime "Notable".
			System.out.println("Tu nota es " + calificacion + ". Notable");
		} else if (calificacion >= 9 && calificacion <= 10) {
			// Si no, si está entre 9 (incluido) y 10 (incluido), imprime "Sobresaliente".
			System.out.println("Tu nota es " + calificacion + ". Sobresaliente");
		} else {
			// Si ninguna condición anterior se cumple (fuera del rango 0-10), imprime un
			// mensaje de error.
			System.out.println("La nota debe ser un valor entre 0 y 10");

		}

		// Cierro el Scanner.
		reader.close();
	}

}