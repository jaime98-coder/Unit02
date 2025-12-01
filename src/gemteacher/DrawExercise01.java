package gemteacher;

import java.util.Scanner;

public class DrawExercise01 {

	public static void main(String[] args) {

		// 1. Declaración e inicialización
		int lado;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número para la altura (mitad del rombo):");
		lado = sc.nextInt();

		// 2. PARTE SUPERIOR (Pirámide normal)
		// Recorremos desde la punta (0) hasta la cintura (lado - 1)
		for (int i = 0; i < lado; i++) {

			// Bucle de Sangría: Empuja el dibujo a la derecha.
			// Decrece conforme bajamos (más ancho abajo, menos margen).
			for (int j = 0; j < (lado - i - 1); j++) {
				System.out.print(" ");
			}

			// Bucle de Dibujo: Pinta los asteriscos.
			// Crece conforme bajamos (i aumenta).
			for (int k = 0; k < (i + 1); k++) {

				// Filtro Hueco: Solo pintamos si es el primer asterisco (k==0)
				// o el último de esta fila (k==i).
				if (k == 0 || k == i) {
					System.out.print("* "); // Asterisco + espacio para mantener proporción
				} else {
					System.out.print("  "); // Dos espacios para rellenar el hueco
				}
			}

			// Salto de línea al terminar la fila actual
			System.out.println();
		}

		// 3. PARTE INFERIOR (Pirámide invertida)
		// IMPORTANTE: 'i' empieza en 'lado - 2' para NO repetir la fila del medio.
		// El bucle va hacia atrás (i--) hasta llegar a la punta (0).
		for (int i = lado - 2; i >= 0; i--) {

			// Bucle de Sangría: Al disminuir 'i', los espacios aumentan solos.
			for (int j = 0; j < (lado - i - 1); j++) {
				System.out.print(" ");
			}

			// Bucle de Dibujo: Al disminuir 'i', el ancho se reduce solo.
			for (int k = 0; k < (i + 1); k++) {

				// Misma lógica de bordes que arriba
				if (k == 0 || k == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		// 4. Cerramos recursos
		sc.close();
	}
}