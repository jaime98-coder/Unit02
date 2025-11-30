package previousexams;

import java.util.Scanner;

public class Examexercise02 {

	public static void main(String[] args) {
		int lado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de astericos que tendrá el triángulo invertido");
		lado = sc.nextInt();
		// i controla el techo, todo lo que ocurra aqui dentro sucede en la fila (i)
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (lado - i); k++) {
				if (i == 0 || k == 0 || k == (lado - i) - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}

			System.out.println();
		}

		sc.close();

	}

}
