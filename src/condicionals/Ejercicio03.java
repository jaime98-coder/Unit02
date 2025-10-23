package condicionals;

import java.util.Scanner;

public class Ejercicio03 {
	/*
	 * Entrada: numDni = 77845898 || Resultado esperado: Y || Resultado obtenido: Y
	 * Entrada: numDni = 20146545 || Resultado esperado: V || Resultado obtenido: V
	 * Entrada: numDni = 999999999 || Resultado esperado: L || Resultado obtenido: L
	 */
	public static void main(String[] args) {
		// Declaro la variable 'numDni' para almacenar la parte numérica del DNI (sin la
		// letra).
		int numDni;
		// Declaro la variable 'letra' para almacenar el resto de la división, que
		// determinará la letra del DNI.
		int letra;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Solicito y leo de la consola el número de DNI al usuario.
		System.out.println("Introduce tu DNI sin letra");
		numDni = reader.nextInt();

		// Calculo el resto de dividir el número del DNI entre 23. Este resto (de 0 a
		// 22) corresponde a una letra específica.
		letra = numDni % 23;

		// Creo un switch expression para determinar e imprimir la letra del DNI
		// basándose en el valor de 'letra'.
		switch (letra) {
		// El case 0 corresponde a la letra T. Se imprime el DNI completo (número +
		// letra).
		case 0 -> {
			System.out.println(numDni + "T");
		}
		// El case 1 corresponde a la letra R.
		case 1 -> {
			System.out.println(numDni + "R");
		}
		// El case 2 corresponde a la letra W.
		case 2 -> {
			System.out.println(numDni + "W");
		}
		// El case 3 corresponde a la letra A.
		case 3 -> {
			System.out.println(numDni + "A");
		}
		// El case 4 corresponde a la letra G.
		case 4 -> {
			System.out.println(numDni + "G");
		}
		// El case 5 corresponde a la letra M.
		case 5 -> {
			System.out.println(numDni + "M");
		}
		// El case 6 corresponde a la letra Y.
		case 6 -> {
			System.out.println(numDni + "Y");
		}
		// El case 7 corresponde a la letra F.
		case 7 -> {
			System.out.println(numDni + "F");
		}
		// El case 8 corresponde a la letra P.
		case 8 -> {
			System.out.println(numDni + "P");
		}
		// El case 9 corresponde a la letra D.
		case 9 -> {
			System.out.println(numDni + "D");
		}
		// El case 10 corresponde a la letra X.
		case 10 -> {
			System.out.println(numDni + "X");
		}
		// El case 11 corresponde a la letra B.
		case 11 -> {
			System.out.println(numDni + "B");
		}
		// El case 12 corresponde a la letra N.
		case 12 -> {
			System.out.println(numDni + "N");
		}
		// El case 13 corresponde a la letra J.
		case 13 -> {
			System.out.println(numDni + "J");
		}
		// El case 14 corresponde a la letra Z.
		case 14 -> {
			System.out.println(numDni + "Z");
		}
		// El case 15 corresponde a la letra S.
		case 15 -> {
			System.out.println(numDni + "S");
		}
		// El case 16 corresponde a la letra Q.
		case 16 -> {
			System.out.println(numDni + "Q");
		}
		// El case 17 corresponde a la letra V.
		case 17 -> {
			System.out.println(numDni + "V");
		}
		// El case 18 corresponde a la letra H.
		case 18 -> {
			System.out.println(numDni + "H");
		}
		// El case 19 corresponde a la letra L.
		case 19 -> {
			System.out.println(numDni + "L");
		}
		// El case 20 corresponde a la letra C.
		case 20 -> {
			System.out.println(numDni + "C");
		}
		// El case 21 corresponde a la letra K.
		case 21 -> {
			System.out.println(numDni + "K");
		}
		// El case default captura cualquier resto que sea inesperado (aunque el resto
		// siempre debe estar entre 0 y 22).
		default -> {
			System.out.println(numDni + "E");
		}
		}
		

		// Cierro el Scanner.
		reader.close();
	}

}