package condicionals;

import java.util.Scanner;

/*
 * Entrada: distancia = 500 && diasEstancia = 5 || Resultado esperado: No tienes descuento || Resultado obtenido: No tienes descuento 
 * Entrada: distancia = 100 && diasEstancia = 10 || Resultado esperado: No tienes descuento || Resultado obtenido: No tienes descuento 
 * Entrada: distancia = 900 && diasEstancia = 8 || Resultado esperado: Si tienes descuento || Resultado obtenido: Si tienes descuento 
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		// Declaro la variable 'distancia' para almacenar la distancia a recorrer en
		// kilómetros (puede ser decimal).
		double distancia;
		// Declaro la variable 'diasEstancia' para almacenar la cantidad de días de
		// estancia.
		int diasEstancia;
		// Declaro una constante 'PRECIO' para el coste por kilómetro (2.5 euros).
		final double PRECIO = 2.5;
		// Declaro la variable 'precioBillete' para almacenar el coste final del
		// billete, aplicando o no el descuento.
		double precioBillete;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Solicito y leo de la consola la distancia que se va a recorrer.
		System.out.println("Introduce la distancia que vas a recorrer en kilómetros");
		distancia = reader.nextDouble();

		// Solicito y leo de la consola el número de días que durará la estancia.
		System.out.println("Introduce cuantos días vas a estar en el destino");
		diasEstancia = reader.nextInt();

		// Calculo el precio base del billete (sin descuento) multiplicando la distancia
		// por el precio por kilómetro.
		precioBillete = distancia * PRECIO;

		// Creo un condicional if-else para verificar si se cumplen los requisitos del
		// descuento:
		// Se requiere que los días de estancia sean estrictamente MAYORES a 7
		// (díasEstancia > 7)
		// Y que la distancia sea estrictamente MAYOR a 800 km (distancia > 800).
		if (diasEstancia > 7 && distancia > 800) {
			// Si se cumplen ambas condiciones, se aplica un descuento del 30%
			// (multiplicando por 0.7 el precio base).
			precioBillete = precioBillete * 0.7;
			// Imprimo en pantalla que el usuario tiene derecho al descuento.
			System.out.println("Tienes un descuento del 30%");
		}
		// Si no se cumple alguna de las condiciones (o ninguna), se ejecuta el else.
		else {
			// Imprimo en pantalla que el usuario no tiene descuento.
			System.out.println("No tienes descuento");
		}

		// Imprimo en pantalla el precio final del billete (con o sin descuento
		// aplicado).
		System.out.println("El precio de tu billete es de: " + precioBillete);

		// Cierro el Scanner.
		reader.close();
	}

}