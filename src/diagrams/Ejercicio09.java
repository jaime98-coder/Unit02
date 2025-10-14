package diagrams;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		int calificacion;
		Scanner reader = new Scanner(System.in);
		calificacion = reader.nextInt();
		if (calificacion >= 0 && calificacion < 3) {
			System.out.println("Tu nota es " + calificacion + ". Muy deficiente");
		} else if (calificacion >= 3 && calificacion < 5) {
			System.out.println("Tu nota es " + calificacion + ". Insuficiente");
		} else if (calificacion >= 5 && calificacion < 7) {
			System.out.println("Tu nota es " + calificacion + ". Bien");
		} else if (calificacion >= 7 && calificacion < 9) {
			System.out.println("Tu nota es " + calificacion + ". Notable");
		} else if (calificacion >= 9 && calificacion <= 10) {
			System.out.println("Tu nota es " + calificacion + ". Sobresaliente");
		} else {
			System.out.println("La nota debe ser un valor entre 0 y 10");

		}

		reader.close();
	}

}
