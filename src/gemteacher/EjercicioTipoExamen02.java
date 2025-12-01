package gemteacher;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioTipoExamen02 {

	public static void main(String[] args) {
		// Declaracion inicial variables
		// butacasLibres inicializadas en 20 (aforo máximo de la sala)
		int butacasLibres = 20;
		// Caja inicial de 0€
		double caja = 0;
		// Variable para acumular el total de entradas vendidas
		int totalEntradasVendidas = 0;
		// Variable para almacenar la edad para verificar el tipo de entrada
		int edad;
		// Variable tipo double para recoger el precio de la entrada con decimales
		double precioEntrada;
		// Variable tipo int de numEntradas para recoger el número de entradas
		int numEntradas;
		// Variable para sumar el precio de las entradas
		double costeTotalCompra;
		// Variable que se utilizará en el switch para elegir una opcion
		int opcionElegida = 0;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle DO para que cuando termine una opción vuelva a empezar (siempre que no
		// sea 3)
		do {
			// TRY para evitar que meta letras en lugar de números (gracias al Catch de tipo
			// inputMismatchException abajo)
			try {

				// Muestro menú de opciones al usuario y leo la opción elegida con el sc.nextInt
				System.out.println("---TAQUILLA CINE ---");
				System.out.println("\n1. Comprar entrada");
				System.out.println("2. Ver aforo disponible");
				System.out.println("3. Cerrar sistema");
				System.out.println("Elige una de las 3 opciones");
				opcionElegida = sc.nextInt();

				// Creación del Switch para entrar en uno de los casos según la opción elegida
				// por el usuario
				switch (opcionElegida) {

				// Caso 1 - Comprar entrada
				case 1:
					System.out.println("---COMPRAR ENTRADA---");

					// Bucle DO-WHILE para que se repita este código si el usuario introduce edad <0
					do {
						// Solicito al usuario y leo de la consola la edad del espectador
						System.out.println("Introduce la edad del espectador para conocer precio de entrada");
						edad = sc.nextInt();
						// IF para evitar que el usuario introduzca edad, si lo hace, le indico que el
						// dato es incoherente
						if (edad < 0) {
							System.out.println("Dato incoherente, edad negativa, introduce una edad positiva");
						}

					} while (edad < 0);

					// Entrada tipo NIÑO si la edad es menor a 10
					if (edad < 10) {
						precioEntrada = 4.5;
						System.out.println("Entrada tipo: NIÑO (4.50€)");

						// Entrada tipo ADULTO si la edad es mayor o igual a 10 y menor a 65
					} else if (edad >= 10 && edad < 65) {
						precioEntrada = 9;
						System.out.println("Entrada tipo: ADULTO (9.00€)");

						// Entrada tipo JUBILADO por descarte (mayor a 65)
					} else {
						precioEntrada = 6;
						System.out.println("Entrada tipo: JUBILADO (6.00€)");
					}

					// Creación de un bucle DO-WHILE para que se repita (tras una ejecucion del
					// codigo) si el usuario introduce un número de entrada menor o igual a 0
					do {

						// Indico al usuario y leo de la consola cuantas entradas del tipo elegido
						// anteriormente desea comprar
						System.out.println("¿Cuantas entradas de ese tipo deseas comprar?");
						numEntradas = sc.nextInt();

						// IF para darle feedback al usuario si introduce 0 o un nº negativo
						if (numEntradas <= 0) {
							System.out.println("Por favor, introduce mínimo 1 entrada");
						}
					} while (numEntradas <= 0);

					// IF para que si las butacasLibres son mayores al numEntradas que quiere
					// comprar, permita realizar la compra y se almacene en la variable butacas
					// libres el cálculo restando el numEntradas que se han comprado
					if (butacasLibres >= numEntradas) {
						butacasLibres -= numEntradas;

						// Creación de un assert para verificar que la cantidad sea lógica
						// Ayudando a detectar errores lógicos
						assert butacasLibres >= 0 : "ERROR: Aforo negativo detectado";

						// Cálculo del dinero del total de entradas
						costeTotalCompra = numEntradas * precioEntrada;

						// Suma y almacenamiento del coste total de la compra a la caja
						caja += costeTotalCompra;
						// Suma y almacenamiento del num entradas al total entradas vendidas
						totalEntradasVendidas += numEntradas;
						System.out.println("¡Compra realizada con éxito!");

						// Mensaje indicando el coste total de la compra y las butacas disponibles tras
						// la compra
						System.out.println("Coste total: " + costeTotalCompra + "€");
						System.out.println("Quedan " + butacasLibres + " butacas.");
						// ELSE por si las butacas Libres NO SON SUFICIENTES al numEntradas que quiere
						// comprar el usuario, imprima ,mensaje de error y aclaración de solicitado y
						// disponible
					} else {
						System.out.println("ERROR. No hay butacas suficientes");
						System.out.println("Entradas solicitadas: " + numEntradas);
						System.out.println("Butacas disponibles: " + butacasLibres);
					}

					break;

				// Caso 2 para visualizar butacas libres (aforo disponible)
				case 2:
					System.out.println("---AFORO DISPONIBLE---");
					System.out.println("El nº de butacas libres es: " + butacasLibres + "/20");
					break;

				// Caso 3 para finalizar el sistema de compra de entradas
				case 3:
					System.out.println("---CERRANDO SISTEMA---");
					// Mensaje final con la caja recaudada
					System.out.println("Total caja recaudada: " + caja + "€");
					// Mensaje final con nº entradas vendidas
					System.out.println("Total entradas vendidas: " + totalEntradasVendidas);
					// Mensaje final con nº butacas libres
					System.out.println("Nº butacas libres: " + butacasLibres);
					System.out.println("\n¡HASTA PRONTO!");
					break;
				// Caso default por si el usuario no introduce 1, 2 o 3
				default:
					System.out.println("Opción no válida. Pulse 1, 2 o 3");
					break;

				}

				// Creación del catch por si el usuario introduce una letra en vez de un número
			} catch (InputMismatchException e) {
				System.out.println("Error. Introduzca solo números");
				sc.nextLine();
			}

			// Condición del DO-WHILE que actua segun la opción elegida
		} while (opcionElegida != 3);

		// Cierre del Scanner
		sc.close();
	}

}
