package whileloops;

import java.util.Scanner;

public class DiagramEjercicio02 {

	public static void main(String[] args) {
		// Declaro la variable conteo para poder almacenar el conteo de los números introducidos por el usuario
		int conteo = 0;
		// Declaro la variable numero para almacenar los números introducidos
		int numero;
		
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Solicito al usuario que introduzca el número y lo leo de la consola
		System.out.println("Introduce un número entero para contarlo");
		numero = reader.nextInt();
		
		// Creo el bucle para que siempre que sea negativo ejecute el código que contiene
		while (numero >= 0) {
			// Cuento con la variable conteo cada vez que el usuario introduce un número
			conteo++;
			// Solicito otro número y leo de la consola
			System.out.println("Introduce otro número entero");
			numero = reader.nextInt();
		}
		// Imprimo el mensaje final indicnado cuantos números ha introducido el usuario.
		System.out.println("Has introducido " + conteo + " números");
		
		// Cierro el Scanner
		reader.close();
	}

}
