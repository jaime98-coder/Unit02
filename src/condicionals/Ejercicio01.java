package condicionals;

import java.util.Scanner;

/*
 * Entrada:-1 || Resultado esperado: Error || Resultado obtenido: Error
 * Entrada:10000 || Resultado esperado: Error || Resultado obtenido: Error
 * Entrada:8 || Resultado esperado: Es capicua || Resultado obtenido: Es capicua
 * Entrada:55 || Resultado esperado: Es capicua || Resultado obtenido: Es capicua
 * Entrada:1331 || Resultado esperado: Es capicua || Resultado obtenido: Es capicua
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		// Declaro la variable num para el numero introducido
		int num;
		// Declaro la variable de tipo booleana para poder realizar un if dentro de
		boolean esCapicua;

		// Creo el Scanner
		Scanner reader = new Scanner(System.in);

		// Solicito al usuario y leo de la consola un número para saber si es capicúa
		System.out.println("Introduce un número para saber si es capicúa");
		num = reader.nextInt();

		// Creo un IF en primer lugar para determinar el rango en el que debe de estar
		// para cumplirse los requisitos del ejercicio, y si es erróneo imprimo un
		// mensaje de error
		if (num < 0 && num > 9999) {
			System.out.println("Error, el número tiene que estar comprendido entre 0 y 9999");

			// Con el else if indico que es capicúa cuando es un número de una cifra (<10) e
			// imprimo un mensaje indicando que es capicua
		} else if (num < 10) {
			System.out.println("Es capicua");

			// Con el else if indico que es capicúa cuando es un número de dos cifras (<100)
			// y le asigno a la variable booleana esCapicua cuando la división entre 10 (me
			// indica el número en la primera posición) es igual al módulo de 10 (me indica
			// el número en la última posición, ya que es el resto de la división) y por
			// último con un IF imprimo el mensaje indicando si es capicúa si esCapicua da
			// TRUE, sino, imprimirá "No es capicúa"
		} else if (num < 100) {
			esCapicua = num / 10 == num % 10;
			if (esCapicua) {
				System.out.println("Es capicua");
			} else {
				System.out.println("No es capicua");
			}

			// Con el else if indico que es capicúa cuando es un número de tres cifras
			// (<1000)
			// y le asigno a la variable booleana esCapicua cuando la división entre 100 (me
			// indica el número en la primera posición) es igual al módulo de 10 (me indica
			// el número en la última posición, ya que es el resto de la división) y por
			// último con un IF imprimo el mensaje indicando si es capicúa si esCapicua da
			// TRUE, sino, imprimirá "No es capicúa"
		} else if (num < 1000) {
			esCapicua = num / 100 == num % 10;
			if (esCapicua) {
				System.out.println("Es capicua");
			} else {
				System.out.println("No es capicua");
			}
		} else {

			// Con el else indico por descarte que es capicúa cuando es un número de cuatro
			// cifras y le asigno a la variable booleana esCapicua cuando la división entre
			// 1000
			// me indica el número en la primera posición) es igual al módulo de 10 (me
			// indica
			// el número en la última posición, ya que es el resto de la división).
			// Y para calcular los 2 números de en medio utilizo un operador lógico y
			// realizo el cálculo similar a los casos anteriores pero entre paréntesis para
			// poder calcularlos entre si con el operador relacional ==
			// por último con un IF imprimo el mensaje indicando si es capicúa si esCapicua
			// da TRUE, sino, imprimirá "No es capicúa"
			esCapicua = num / 1000 == num % 10 && ((num / 100) % 10 == (num / 10) % 10);
			if (esCapicua) {
				System.out.println("Es capicua");
			} else {
				System.out.println("No es capicua");
			}

			// Cierro el Scanner
			reader.close();
		}
	}
}
