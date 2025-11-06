package dowhileloops;

import java.util.Scanner;

public class DiagramEjercicio07 {

	public static void main(String[] args) {
		double num1;
		double num2;
		double resultado = 0;
		String codigoOperacion = "";
		String respuesta;

		Scanner reader = new Scanner(System.in);

		do {
			// Mover las entradas DENTRO del bucle para poder repetir con nuevos datos
			System.out.println("--- NUEVA OPERACIÓN ---");
			System.out.println("Introduzca número 1");
			num1 = reader.nextDouble();
			System.out.println("Introduzca número 2");
			num2 = reader.nextDouble();

			System.out.println("Elije una operación de la A a la E");
			System.out.println("A. SUMAR LOS NÚMEROS");
			System.out.println("B. RESTAR LOS NÚMEROS");
			System.out.println("C. MULTIPLICAR LOS NÚMEROS");
			System.out.println("D. DIVIDIR LOS NÚMEROS");
			System.out.println("E. SALIR");

			// .toUpperCase() ayuda a que acepte 'a' minúscula también
			codigoOperacion = reader.next().toUpperCase();

			switch (codigoOperacion) {
			case "A":
				resultado = num1 + num2;
				System.out.println("Suma = " + resultado);
				break;
			case "B":
				resultado = num1 - num2;
				System.out.println("Resta = " + resultado);
				break;
			case "C":
				resultado = num1 * num2;
				System.out.println("Multiplicación = " + resultado);
				break;
			case "D":
				if (num2 != 0) {
					resultado = num1 / num2;
					System.out.println("División = " + resultado);
				} else {
					System.out.println("No se puede dividir por 0");
				}
				break;
			case "E":

				System.out.println("Operación cancelada, programa finalizado");
				break;
			default:
				System.out.println("Opción no válida. Por favor, elija A, B, C, D o E");
				break;
			}

//			System.out.println("\nPulsa la letra E para SALIR, o cualquier otra tecla para CONTINUAR");
//			respuesta = reader.next();

			// El bucle continúa MIENTRAS la respuesta NO (!) sea "E" (ignorando
			// mayúsculas/minúsculas)
		} while (!codigoOperacion.equalsIgnoreCase("E"));

		System.out.println("Programa finalizado.");
		reader.close();
	}
}