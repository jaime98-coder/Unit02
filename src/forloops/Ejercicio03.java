package forloops;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Declaro la variable num para almacenar temporalmente cada número
		// que introduce el usuario en cada vuelta del bucle
		int num;
		// Declaro la variable media, que usaremos primero para acumular la suma total.
		// La inicializo a 0. Es 'double' para que la división final pueda
		// guardar decimales.
		double media = 0;
		
		// Creo el Scanner para leer la entrada del teclado
		Scanner reader = new Scanner(System.in);
		
		// Imprimo un mensaje pidiendo al usuario que introduzca los 10 números
		System.out.println("Introduce 10 números para calcular la media");

		// Creo un for con el contador inicializado en 1, y que se repite 10 veces
		// (una por cada número que queremos leer)
		for (int contador = 1; contador <= 10; contador++) {
			
			// Leo el número de la consola y lo guardo en 'num'.
			// Al estar DENTRO del bucle, se ejecuta 10 veces, pidiendo un número nuevo
			// en cada repetición.
			num = reader.nextInt();
			
			// Acumulo el número recién leído ('num') sumándolo a la variable 'media'
			media += num;

		}
		
		// Al terminar el bucle, 'media' contiene la SUMA TOTAL de los 10 números.
		// Divido este total entre 10 para obtener la media real.
		media /= 10;
		
		// Imprimo el resultado final
		System.out.println("La media es:" + media);

		// Cierro el Scanner
		reader.close();
	}

}