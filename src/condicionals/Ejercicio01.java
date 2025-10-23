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

		int num;
		int unidades;
		int decenas;
		int centenas;
		int miles;
		boolean esCapicua;

		// Creo el Scanner
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce un número para saber si es capicúa");
		num = reader.nextInt();

		if (num < 0 || num > 9999) {
			System.out.println("Error, el número tiene que estar comprendido entre 0 y 9999");

		} else {
			if (num < 10) {

				esCapicua = true;
				System.out.println("Es capicua");

			} else if (num < 100) {
				unidades = num % 10;
				decenas = num / 100;
				esCapicua = unidades == decenas;

			} else if (num < 1000) {
				unidades = num % 10;
				centenas = num / 100;
				esCapicua = (unidades == centenas);
			} else {
				unidades = num % 10;
				decenas = (num / 10) % 10;
				centenas = (num / 100) % 10;
				miles = num / 1000;
				esCapicua = (unidades == miles) && (decenas == centenas);
			}

			// Imprimimos si el número es capicúa o no
			System.out.println(esCapicua ? "Es capicúa" : "No es capicúa");
			// Cierro el Scanner
			reader.close();
		}
	}
}
