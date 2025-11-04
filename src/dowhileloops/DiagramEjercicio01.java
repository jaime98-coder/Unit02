package dowhileloops;

import java.util.Scanner;

public class DiagramEjercicio01 {

	public static void main(String[] args) {
		// Declaro la variable numero inicializada en 1 para que comience desde 1 (tal y
		// como indica el enunciado)
		int num = 1;

		// Creo el Scanner
		Scanner reader = new Scanner(System.in);

		// Creo el bucle comenzando con DO para que imprima el num y cuente de 1 en 1
		// con num++
		do {
			System.out.println(num);
			num++;
			// Completo el bucle con el WHILE el cual hará que el bucle se repita siempre
			// que sea menor o igual a 20 la variable num
		} while (num <= 20);
		
		// Imprimo mensaje final tras imprimir los 20 primero nº naturales.
		System.out.println("Esos son los 20 primeros números naturales");
		
		// Cierro el Scanner
		reader.close();
	}

}
