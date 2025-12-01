package gemteacher;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioTipoExamen03 {

	public static void main(String[] args) {
		// Variable numPisos para almacenar el nº de pisos de mi hotel
		int numPisos;
		// Variable numHabitaciones para almacenar el nº de habitaciones por planta
		int numHabitaciones;
		// Variable precioPlanta inicializado en 50€ (importe de habitaciones planta 1)
		int precioPlanta = 50;
		// Variable que almacenará las habitaciones pares
		int habitacionesPares = 0;
		// Variable para almacenar la opción elegida por el usuario
		int opcionElegida = 0;
		// Variable para almacenar el total de Habitaciones de mi hotel (teniendo en
		// cuenta todas las plantas)
		int totalHabitaciones = 0;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		// Solicito y leo de la consola el nº de pisos y lo almaceno en numPisos
		System.out.println("Introduce nº de pisos de tu hotel");
		numPisos = sc.nextInt();

		// Solicito y leo de la consola el nº de habitaciones y lo almaceno en
		// numHabitaciones
		System.out.println("Introduce nº de habitaciones de tu hotel");
		numHabitaciones = sc.nextInt();

		// Creo un DO-WHILE que haga un bucle para que el sistema se repita
		// continuamente hasta que el usuario seleccione la opción de salir
		do {
			// Creo un TRY para que si salta una excepción, pueda recogerlo después el CATCH
			try {
				// Imprimo en pantalla el menú con las diferentes opciones, y leo la opcion
				// elegida por el usuario
				System.out.println("\n-------HOTEL BOMBITA-------");
				System.out.println("\nElige una opción");
				System.out.println("1. Visualiza el mapa del hotel");
				System.out.println("2. Calcular ganancias potenciales");
				System.out.println("3. Plan de mantenimiento");
				System.out.println("4. Salir");
				opcionElegida = sc.nextInt();

				// Creo un SWITCH para según la opcion elegida por el usuario, entre en uno de
				// los casos
				switch (opcionElegida) {
				// El Case 1, dibuja un mapa del hotel por plantas y habitaciones
				case 1: {
					System.out.println("---MAPA DEL HOTEL---");
					// El for externo recorre los diferentes pisos hacia abajo, es decir, comenzará
					// a construir desde el piso mas alto (numPisos) hasta el piso 1 (el más abajo),
					// por lo tanto decrementará con el i--, además llevará a cabo los saltos de
					// línea para hacer los pisos del hotel (filas)
					for (int i = numPisos; i >= 1; i--) {
						// El for interno se encarga de ir dibujando cada habitación por las diferentes
						// plantas, este va incrementando
						for (int j = 1; j <= numHabitaciones; j++) {
							System.out.print("[P" + i + " - H" + j + "]");
						}
						// Salto de linea del bucle externo (comentado anteriormente)
						System.out.println();
					}
					// Break para salir del case 1
					break;
				}

				// Case 2 para calcular las ganancias potenciales (si el hotel llena todas las
				// habitaciones de todas las plantas)
				case 2: {
					System.out.println("---GANANCIAS POTENCIALES---");
					// Vuelvo a inicializar las variables de nuevo, para que cada vez que vuelvo a
					// seleccionar la opción 2, no se acumulen los valores en dichas variables
					totalHabitaciones = 0;
					precioPlanta = 50;
					// Creo el bucle externo para ir recorriendo las plantas (filas) (es igual que
					// antes,pero en este caso lo hice de forma creciente) y por cada planta
					// (iteración de este bucle externo, sumarle 25€ más al precio de la habitación
					// (precioPlanta+=25)
					for (int i = 1; i <= numPisos; i++) {
						// Creo el bucle interno para ir recorriendo las diferentes habitaciones e ir
						// sumando y almacenando en totalHabitaciones el precioPlanta (precio por
						// habitación según la planta)
						for (int j = 1; j <= numHabitaciones; j++) {
							totalHabitaciones += precioPlanta;
						}
						precioPlanta += 25;
					}
					// Imprimo mensaje indicando el total de las ganancias si el hotel estuviese
					// lleno al 100%
					System.out.println("Total de las ganancias si estuviese lleno al 100%: " + totalHabitaciones + "€");
					// Break para salir del case 2.
					break;
				}
				// Case 3 para recoger las habitaciones pares del hotel
				case 3: {
					System.out.println("---PLAN DE MANTENIMIENTO---");
					// Vuelvo a inicializar la variable de nuevo, para que cada vez que vuelvo a
					// seleccionar la opción 3, no se acumulen los valores
					habitacionesPares = 0;
					// Creo un bucle for externo e interno igual que antes, para recorrer todas las
					// habitaciones del hotel
					for (int i = 1; i <= numPisos; i++) {
						for (int j = 1; j <= numHabitaciones; j++) {
							// Con el IF calculo el numHabitaciones pares en mi hotel completo sacando si el
							// módulo de 2 == 0, y cada vez que eso ocurra, le sumo uno a la variable
							// habitacionesPares ++
							if (j % 2 == 0) {
								habitacionesPares++;
							}
						}
					}
					// Imprimo el total de habitaciones pares
					System.out.println("Total habitaciones pares: " + habitacionesPares);
					// Break para salir de la opción 3
					break;
				}
				// El case 4 para seleccionarlo si quiero salir del programa
				case 4: {
					System.out.println("---SALIR---");
					System.out.println("Has acabado el programa =)");
					break;
				}
				// El case default por si selecciono una opción que no sea entre 1,2,3 o 4
				default: {
					System.out.println("Selecciona 1, 2, 3 o 4");
				}
				}
				// Creo un catch para completar la estructura TRY, con la Exception adecuada
				// para evitar que ponga algo que no sea un número en el menú, ej: letras
			} catch (InputMismatchException e) {
				System.out.println("ERROR. Introduce un número, por favor");
				// Limpia el buffer para evitar un bucle infinito
				sc.nextLine();
			}
			// final de mi estructura DO-WHILE, donde el while tenga de condición cuando la
			// opción elegida sea diferente de 4 (salir) pues se vuelva a ejecutar el código
			// desde el DO
		} while (opcionElegida != 4);

		// Cierro el Scanner
		sc.close();
	}

}
