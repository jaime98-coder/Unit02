package condicionals;

import java.util.Scanner;

public class Ejercicio02 {
	/*
	 * Entrada: num = 10 || Resultado esperado: 10 || Resultado obtenido: 10
	 * Entrada: num = -80 || Resultado esperado: 80 || Resultado obtenido: 80
	 * Entrada: num = 47,5 || Resultado esperado: 47,5 || Resultado obtenido: 47,5
	 * Entrada: num = -47,5 || Resultado esperado: 47,5 || Resultado obtenido: 47,5
	 */
	public static void main(String[] args) {
		// Declaro la variable 'num' para almacenar el número decimal introducido por el
		// usuario.
		double num;
		// Declaro la variable 'valorAbsoluto' para almacenar el resultado, que será el
		// valor absoluto de 'num'.
		double valorAbsoluto;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Solicito y leo de la consola un número decimal al usuario.
		System.out.println("Introduce un número");
		num = reader.nextDouble();

		// Utilizo el operador ternario para calcular el valor absoluto:
		// Condición: Si 'num' es mayor o igual a 0 (es positivo o cero)
		// Si es verdadero: 'valorAbsoluto' toma el valor de 'num' (el propio número).
		// Si es falso (es negativo): 'valorAbsoluto' toma el valor de 'num * -1'
		// (convirtiendo el negativo en positivo).
		valorAbsoluto = num >= 0 ? num : (num * -1);

		// Imprimo en pantalla el resultado, mostrando el valor absoluto calculado.
		System.out.println("El valor absoluto es " + valorAbsoluto);

		// Cierro el Scanner.
		reader.close();
	}

}