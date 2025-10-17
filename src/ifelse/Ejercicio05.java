package ifelse;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Declaro las variables para que el jugador1 pueda elegir piedra papel o
		// tijeras
		String jugador1;
		// Declaro las variables para que el jugador1 pueda elegir piedra papel o
		// tijeras
		String jugador2;
		
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Solicito tanto al jugador 1 como al jugador 2 que elija piedra papel o
		// tijeras
		// y leo de la consola lo que ha introducido
		System.out.println("Jugador 1 elige piedra papel o tijeras");
		jugador1 = reader.next();
		System.out.println("Jugador 2 elige piedra papel o tijeras");
		jugador2 = reader.next();
		// Creo un IF para indicar las posibles combinaciones entre posibles jugadas
		// tanto del jugador 1 como del jugador 2, imprimiendo así un mensaje indicando
		// quien ha ganado o quien ha empatado
		if (jugador1.equalsIgnoreCase(PAPEL) && jugador2.equalsIgnoreCase(PIEDRA)) {
			System.out.println("Gana el jugador 1");
		} else if (jugador1.equalsIgnoreCase(PIEDRA) && jugador2.equalsIgnoreCase(TIJERAS)) {
			System.out.println("Gana el jugador 1");
		} else if (jugador1.equalsIgnoreCase(TIJERAS) && jugador2.equalsIgnoreCase(PAPEL)) {
			System.out.println("Gana el jugador 1");
		} else if (jugador1.equalsIgnoreCase(PIEDRA) && jugador2.equalsIgnoreCase(PIEDRA)) {
			System.out.println("¡Empate! "+PIEDRA+" y "+PIEDRA);
		} else if (jugador1.equalsIgnoreCase(PAPEL) && jugador2.equalsIgnoreCase(PAPEL)) {
			System.out.println("¡Empate! "+PAPEL+" y "+PAPEL);
		} else if (jugador1.equalsIgnoreCase(TIJERAS) && jugador2.equalsIgnoreCase(TIJERAS)) {
			System.out.println("¡Empate! "+TIJERAS+" y "+TIJERAS);
		} else {
			System.out.println("Gana el jugador 2");
		}
		reader.close();
	}

}
