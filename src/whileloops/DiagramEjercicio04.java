package whileloops;

import java.util.Scanner;

public class DiagramEjercicio04 {

	public static void main(String[] args) {
		// Declaro la variable contador para contar los números que va a introducir el
		// usuario
		int contador = 0;
		// Declaro la variable sumaPositivos a 0 para almacenar la suma de los números
		// positivos introducidos
		int sumaPositivos = 0;
		// Declaro la variable sumaNegativos a 0 para almacenar la suma de los números
		// negativos introducidos
		int sumaNegativos = 0;
		// Declaro la variable contNegativos a 0 para almacenar cuantos números
		// negativos ha introducido el usuario
		int contNegativos = 0;
		// Declaro la variable contCeros a 0 para almacenar cuantos 0 (ceros)
		// ha introducido el usuario
		int contCeros = 0;
		// Declaro la variable mediaNegativos para calcular la media de los negativos
		int mediaNegativos;
		// Declaro la variable numero para almacenar los números introducidos por el
		// usuario
		int numero;

		// Creo el Scanner
		Scanner reader = new Scanner(System.in);

		// Creo un bucle while para que el usuario pueda introducir 10 números como
		// máximo.
		while (contador < 10) {
			// Solicito un nº entero y leo de la consola
			System.out.println("Introduce un número entero");
			numero = reader.nextInt();
			// Creo un IF para que cuando sea positivo (>0) se almacene la suma en
			// sumaPositivos
			if (numero > 0) {
				sumaPositivos += numero;
				// Creo un ELSE IF para que cuando sea negativo (<0) se almacene la suma de los
				// negativos, y se cuente los negativos introducidos
			} else if (numero < 0) {
				sumaNegativos += numero;
				contNegativos++;
				// Creo un ELSE para contar los ceros que ha introducido el usuario (por
				// descarte)
			} else {
				contCeros++;
			}
			// Cuento un número para que cada número se sume, para que pueda darse la salida
			// del bucle inicial contador < 10
			contador++;
		}
		// Creo un IF para que cuando no se haya introducido ningún nº negativo, no
		// realice el cálculo de la mediaNegativos, ya que daria error, porque el
		// divisor sería 0, resultando así en un error de cálculo, de lo contrario, se
		// calculará y se imprimirá la media de los negativos junto al mensaje final
		if (contNegativos != 0) {
			mediaNegativos = sumaNegativos / contNegativos;
			System.out.println("La media de los negativos es: " + mediaNegativos);
		}

		// Imprimo el mensaje final con el resultado de la suma de los nº positivos
		// introducidos por el usuario
		System.out.println("La suma de los positivos es: " + sumaPositivos);

		// Imprimo el mensaje final con el resultado los 0 (ceros)
		// introducidos por el usuario
		System.out.println("El número de 0 introducidos es:" + contCeros);

		// Cierro el Scanner
		reader.close();
	}

}
