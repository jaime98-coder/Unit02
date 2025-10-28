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

		// Declaro la variable 'num' para almacenar el número entero introducido por el
		// usuario.
		int num;
		// Declaro la variable 'unidades' para almacenar el dígito de las unidades.
		int unidades;
		// Declaro la variable 'decenas' para almacenar el dígito de las decenas.
		int decenas;
		// Declaro la variable 'centenas' para almacenar el dígito de las centenas.
		int centenas;
		// Declaro la variable 'miles' para almacenar el dígito de las unidades de
		// millar.
		int miles;
		// Declaro la variable 'esCapicua' para almacenar el resultado (true si lo es,
		// false si no).
		boolean esCapicua;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Solicito al usuario un número para la comprobación.
		System.out.println("Introduce un número para saber si es capicúa");
		// Leo de la consola el número entero.
		num = reader.nextInt();

		// Creo una estructura if para validar que el número esté en el rango 0-9999.
		if (num < 0 || num > 9999) {
			// Si no está en el rango, imprime un mensaje de error.
			System.out.println("Error, el número tiene que estar comprendido entre 0 y 9999");

		} else {
			// Si el número es válido, creo una estructura if-else if-else para comprobar
			// si es capicúa según su número de cifras.

			// Creo el case para números de una cifra (0-9).
			if (num < 10) {
				// Asigno 'true' (un número de una cifra siempre es capicúa).
				esCapicua = true;
				// Imprimo el resultado.
				System.out.println("Es capicua");

				// Creo el case para números de dos cifras (10-99).
			} else if (num < 100) {
				// Calculo las unidades.
				unidades = num % 10;
				// Calculo las decenas. (Nota: esta lógica es incorrecta, debería ser num / 10)
				decenas = num / 100;
				// Compruebo si las unidades son iguales a las decenas.
				esCapicua = unidades == decenas;

				// Creo el case para números de tres cifras (100-999).
			} else if (num < 1000) {
				// Calculo las unidades.
				unidades = num % 10;
				// Calculo las centenas.
				centenas = num / 100;
				// Compruebo si las unidades son iguales a las centenas.
				esCapicua = (unidades == centenas);
			} else {
				// Creo el case para números de cuatro cifras (1000-9999).
				// Calculo las unidades.
				unidades = num % 10;
				// Calculo las decenas.
				decenas = (num / 10) % 10;
				// Calculo las centenas.
				centenas = (num / 100) % 10;
				// Calculo las unidades de millar.
				miles = num / 1000;
				// Compruebo si las unidades son iguales a los millares Y las decenas a las
				// centenas.
				esCapicua = (unidades == miles) && (decenas == centenas);
			}

			// Imprimo el resultado final almacenado en 'esCapicua' usando un operador
			// ternario.
			// (Nota: Esto provocará una doble impresión para números de 1 cifra).
			System.out.println(esCapicua ? "Es capicúa" : "No es capicúa");

			// Cierro el Scanner (solo se cierra si el número introducido es válido).
			reader.close();
		}
	}
}