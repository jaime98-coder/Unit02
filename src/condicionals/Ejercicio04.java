package condicionals;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Declaro la variable 'resultadoSumaUsuario' para almacenar la respuesta de la
		// suma introducida por el usuario.
		int resultadoSumaUsuario;
		// Declaro la variable 'num1' para almacenar el primer número aleatorio.
		int num1;
		// Declaro la variable 'num2' para almacenar el segundo número aleatorio.
		int num2;
		// Declaro la variable 'resultadoFinal' para almacenar la suma correcta de los
		// dos números aleatorios.
		int resultadoFinal;

		// Creo un objeto Random para generar números aleatorios.
		Random aleatorio = new Random();
		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Genero el primer número aleatorio entre 0 (incluido) y 100 (excluido).
		num1 = aleatorio.nextInt(0, 100);
		// Genero el segundo número aleatorio entre 0 (incluido) y 100 (excluido).
		num2 = aleatorio.nextInt(0, 100);

		// Calculo y almaceno la suma correcta de los dos números en 'resultadoFinal'.
		resultadoFinal = num1 + num2;

		// Imprimo en pantalla el primer número aleatorio.
		System.out.println(num1);
		// Imprimo en pantalla el segundo número aleatorio.
		System.out.println(num2);

		// Solicito y leo de la consola el resultado de la suma que el usuario cree que
		// es correcto.
		System.out.println("Introduce el resultado de la suma de los 2 números aleatorios");
		resultadoSumaUsuario = reader.nextInt();

		// Creo un condicional if-else para comparar la respuesta del usuario con el
		// resultado correcto.
		// Si la respuesta del usuario es IGUAL al resultado final, se cumple la
		// condición.
		if (resultadoSumaUsuario == resultadoFinal) {
			// Imprimo en pantalla que el resultado es correcto, mostrando la respuesta del
			// usuario.
			System.out.println("¡HAS ACERTADO!" + " - Resultado: " + resultadoSumaUsuario);
		}
		// Si la respuesta del usuario es diferente, se ejecuta el else.
		else {
			// Imprimo en pantalla que el resultado es incorrecto, mostrando el resultado
			// final correcto.
			System.out.println("¡MEEEEC, INCORRECTO!." + " - Resultado: " + resultadoFinal);
		}

		// Cierro el Scanner.
		reader.close();
	}

}