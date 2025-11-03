package dowhileloops;

import java.util.Scanner;

public class DiagramEjercicio06 {

	public static void main(String[] args) {

		// --- 1. Definición de Constantes y Variables ---
		final String PIEDRA = "Piedra";
		final String PAPEL = "Papel";
		final String TIJERAS = "Tijeras";

		String jugada1;
		String jugada2;

		// Para guardar la 'S' de "Seguir jugando"
		String respuesta;

		Scanner reader = new Scanner(System.in);

		// --- 2. Bucle principal del juego (se ejecuta al menos una vez) ---
		// Este bucle controla si se juega OTRA partida.
		do {

			// --- 3. Bucle de validación para el Jugador 1 ---
			// Se repite MIENTRAS la jugada1 NO sea válida.
			do {
				System.out.println("Jugador 1: Introduce 'Piedra', 'Papel' o 'Tijeras'");
				jugada1 = reader.next();

				// Damos un aviso si la jugada es incorrecta
				if (!jugada1.equalsIgnoreCase(PIEDRA) && !jugada1.equalsIgnoreCase(PAPEL)
						&& !jugada1.equalsIgnoreCase(TIJERAS)) {
					System.out.println("¡Opción no válida! Inténtalo de nuevo.");
				}

			} while (!jugada1.equalsIgnoreCase(PIEDRA) && !jugada1.equalsIgnoreCase(PAPEL)
					&& !jugada1.equalsIgnoreCase(TIJERAS));

			// --- 4. Bucle de validación para el Jugador 2 ---
			// Se repite MIENTRAS la jugada2 NO sea válida.
			do {
				System.out.println("Jugador 2: Introduce 'Piedra', 'Papel' o 'Tijeras'");
				jugada2 = reader.next();

				if (!jugada2.equalsIgnoreCase(PIEDRA) && !jugada2.equalsIgnoreCase(PAPEL)
						&& !jugada2.equalsIgnoreCase(TIJERAS)) {
					System.out.println("¡Opción no válida! Inténtalo de nuevo.");
				}

			} while (!jugada2.equalsIgnoreCase(PIEDRA) && !jugada2.equalsIgnoreCase(PAPEL)
					&& !jugada2.equalsIgnoreCase(TIJERAS));

			// --- 5. Lógica para determinar el ganador ---
			// En este punto, estamos seguros de que ambas jugadas son válidas.
			System.out.println("--- Resultado ---");
			System.out.println("Jugador 1 eligió: " + jugada1);
			System.out.println("Jugador 2 eligió: " + jugada2);

			// Caso 1: Empate
			if (jugada1.equalsIgnoreCase(jugada2)) {
				System.out.println("¡Empate!");
			}
			// Caso 2: Gana Jugador 1
			else if ((jugada1.equalsIgnoreCase(PAPEL) && jugada2.equalsIgnoreCase(PIEDRA))
					|| (jugada1.equalsIgnoreCase(PIEDRA) && jugada2.equalsIgnoreCase(TIJERAS))
					|| (jugada1.equalsIgnoreCase(TIJERAS) && jugada2.equalsIgnoreCase(PAPEL))) {
				System.out.println("¡Gana el jugador 1!");
			}
			// Caso 3: Gana Jugador 2 (el resto de casos)
			else {
				System.out.println("¡Gana el jugador 2!");
			}

			// --- 6. Preguntar si se quiere seguir jugando ---
			System.out.println("¿Quieren jugar otra partida? (Pulsa 'S' para sí, cualquier otra tecla para no)");
			respuesta = reader.next();

			// El bucle principal se repite solo si la respuesta es "S" (ignorando
			// mayúsculas)
		} while (respuesta.equalsIgnoreCase("S"));

		System.out.println("¡Gracias por jugar! Fin del programa.");
		reader.close();
	}
}