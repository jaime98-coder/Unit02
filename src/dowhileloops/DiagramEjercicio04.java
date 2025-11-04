package dowhileloops;

import java.util.Scanner;

public class DiagramEjercicio04 {

	public static void main(String[] args) {
		// Declaro la variable contador, inicializada a 1 para que comience a contar
		// desde 1
		int contador = 1;
		// Declaro la variable num para recoger el valor introducido por el usuario
		int num;
		// Declaro la variable resultado inicializada a 0
		int multiplicacion = 0;

		// Creo el Scanner
		Scanner reader = new Scanner(System.in);

		// Solicito al usuario un número y lo leo de la consola
		System.out.println("Introduce un número para mostrar su tabla de multiplicar");
		num = reader.nextInt();
		
		// Comienzo el bucle con el DO indicando que almacene en la variable resultado
		// el nº introducido por el usuario multiplicado por el valor del contador (1),
		// y así sucesivamente debido al contador++
		do {
			multiplicacion = num * contador;
			System.out.println(num + " x " + contador + " = " + multiplicacion);
			contador++;
			
			// Finalizo la estructura del bucle con el WHILE indicando que se repita el DO
			// siempre que el contador sea menor o igual a 10, para que así imprima la tabla
			// de multiplicar del nº introducido
		} while (contador <= 10);

		// Cierro el Scanner
		reader.close();
	}

}
