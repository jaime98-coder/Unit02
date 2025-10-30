package whileloops;

import java.util.Scanner;

public class DiagramEjercicio06 {

	public static void main(String[] args) {
		// Declaro la variable altura para almacenar las alturas introducidas
		double altura;
		// Declaro la variable altura para almacenar las alturas introducidas
		double alturaMax;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce una altura");
		altura = reader.nextDouble();
		alturaMax = altura;
		while (altura != -1) {
			if (altura > alturaMax) {
				alturaMax = altura;
			}
			altura = reader.nextDouble();
		}
		if (alturaMax != -1) {
			System.out.println("La altura máxima es:" + alturaMax);
		} else {
			System.out.println("La altura introducida no es válida");
		}

		reader.close();
	}

}
