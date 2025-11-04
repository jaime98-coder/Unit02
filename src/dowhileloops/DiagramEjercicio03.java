package dowhileloops;

import java.util.Scanner;

public class DiagramEjercicio03 {

	public static void main(String[] args) {
		// Declaro la variable suma, inicializada a 0
		int suma = 0;
		// Declaro la variable contador, inicializada a 1 para que comience a contar
		// desde 1
		int contador = 1;
		// Declaro la variable num para recoger el valor introducido por el usuario
		int num;

		// Creo el Scanner
		Scanner reader = new Scanner(System.in);

		// Solicito un número al usuario y leo de la consola el valor introducido.
		System.out.println("Introduce un número");
		num = reader.nextInt();

		// Comienzo el bucle con DO indicando que la variable suma, se sume al número
		// del contador para sumarle 1.
		do {
			suma += contador;
			// Le sumo 1 al contador, para que así cuando se ejecute el bucle de nuevo, se
			// le sume el nº siguiente al anterior.
			contador++;
			// Continuo el bucle con WHILE estableciendo la condición de que siempre que el
			// contador sea menor o igual al número, para que pare de sumar cuando llegue al
			// valor introducido
		} while (contador <= num);

		// Imprimo el mensaje final indicando la suma correlativa de los números
		System.out.println("La suma correlativa de los números es: " + suma);

		// Cierro el Scanner
		reader.close();
	}

}
