package whileloops;

import java.util.Scanner;

public class diagram_Ejercicio03 {

	public static void main(String[] args) {
		// Declaro la variable 'suma' para acumular el total de los números
		// introducidos.
		// La inicializo a 0.
		int suma = 0;

		// Declaro la variable 'media' para almacenar el resultado de la media.
		// La inicializo a 0.
		int media = 0;

		// Declaro la variable 'conteo' para contar el número de entradas válidas
		// (positivas o cero).
		// La inicializo a 0.
		int conteo = 0;

		// Declaro la variable 'numero' para almacenar el valor introducido por el
		// usuario en cada iteración.
		int numero;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Solicito y leo de la consola el primer número.
		System.out.println("Introduce un número");
		numero = reader.nextInt();

		// Creo un bucle while que se ejecutará mientras el 'numero' introducido sea
		// mayor o igual a 0.
		// El bucle se detendrá cuando se introduzca un número negativo.
		while (numero >= 0) {
			// Acumulo el número actual en la variable 'suma'.
			suma += numero;
			// Incremento el contador de números introducidos.
			conteo++;

			// Solicito y leo el siguiente número para evaluarlo en la próxima iteración.
			System.out.println("Introduce otro número");
			numero = reader.nextInt();

		}

		// Calculo la media (división entera) una vez finalizado el bucle.
		media = suma / conteo;

		// Imprimo el resultado de la media.
		System.out.println("La media es: " + media);
		// Imprimo el resultado de la suma total.
		System.out.println("La suma es: " + suma);
		// Imprimo la cantidad de números (positivos o cero) que se han introducido.
		System.out.println("Los nº positivos introducidos son: " + conteo);

		// Cierro el Scanner.
		reader.close();
	}

}