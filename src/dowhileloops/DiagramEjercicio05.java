package dowhileloops;

import java.util.Random;
import java.util.Scanner;

public class DiagramEjercicio05 {

	public static void main(String[] args) {
		// Declaro la variable numeroAleatorio para almacenar el número aleatorio
		// generado por la máquina
		int numeroAleatorio;
		// Declaro la variable resultado para almacenar el valor pensado por el usuario
		String resultado;
		// Declaro la variable limiteMinimo para almacenar el límite inferior para
		// utilizarlo en la generación de nº aleatorios
		int limiteMinimo = 1;
		// Declaro la variable limiteMaximo para almacenar el límite máximo para
		// utilizarlo en la generación de nº aleatorios, en este caso dado que quiero
		// que sea aleatorio hasta el 100, pongo 101, ya que el nº máximo no está
		// incluido
		int limiteMaximo = 101;

		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Creo el Random
		Random aleatorio = new Random();

		// Imprimo mensaje para registar cual es el nº pensando por el usuario.
		System.out.println("Número pensado por el usuario:");
		resultado = reader.next();

		// Comienzo el bucle con el DO indicando que tiene que repetirse en bucle,
		// cuando se cumpla la condición posterior.
		do {
			// Creo el nº aleatorio
			numeroAleatorio = aleatorio.nextInt(limiteMinimo, limiteMaximo);
			// Imprimo el mensaje indicando el nº que dijo la máquina, y el nº.
			System.out.println("Número indicado por la máquina:");
			System.out.println(numeroAleatorio);

			// Imprimo el mensaje para decirle si es menor, mayor o iguales y leo de la
			// consola lo que introduzca..
			System.out.println("Introduce si es menor, mayor o iguales");
			resultado = reader.next();

			// Creo el IF para cuando se escriba menor, se ponga el nº dicho por la máquina
			// como límite máximo
			if (resultado.equals("menor")) {
				limiteMaximo = numeroAleatorio;
				// Creo un ELSE IF para cuando se escriba mayor, se ponga el nº dicho por la
				// máquina como limite Minimo
			} else if (resultado.equals("mayor")) {
				limiteMinimo = numeroAleatorio + 1;
			}

			// Finalizo la estructura del bucle con el WHILE indicando que se vuelva a
			// ejecutar el bucle siempre y cuando el resultado sea diferente de iguales
		} while (!resultado.equals("iguales"));

		// Imprimo el mensaje final indicando que la máquina ha acertado el nº pensado
		// por el usuario
		System.out.println("¡La máquina ha acertado!");

		// Cierro el Scanner
		reader.close();
	}

}
