package previousexams;

import java.util.Scanner;

public class Examexercise02 {

	public static void main(String[] args) {
		int lado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de astericos que tendrá el triángulo invertido");
		lado = sc.nextInt();

		// --- ESTRUCTURA PRINCIPAL ---
		// BUCLE I (FILAS): Controla el "techo" y baja hasta la punta.
		for (int i = 0; i < lado; i++) {

			// BUCLE J (SANGRÍA): Empuja el triángulo a la derecha.
			// A mayor fila (i), más espacios iniciales necesita para centrar la punta.
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// BUCLE K (DIBUJO): Gestiona los asteriscos y el hueco interior.
			// La cantidad de elementos disminuye en cada fila (lado - i).
			for (int k = 0; k < (lado - i); k++) {

				// LÓGICA DEL HUECO (Solo pintamos bordes):
				// i == 0 -> Es la tapa superior (fila 0).
				// k == 0 -> Es el borde izquierdo.
				// k == (...) - 1 -> Es el borde derecho (último elemento de la fila).
				if (i == 0 || k == 0 || k == (lado - i) - 1) {
					System.out.print("* "); // Importante: * + espacio para mantener la forma
				} else {
					System.out.print("  "); // Relleno hueco: doble espacio
				}
			}

			// Salto de línea para pasar a la siguiente fila
			System.out.println();
		}

		sc.close();
	}
}