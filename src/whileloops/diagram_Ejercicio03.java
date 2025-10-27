package whileloops;

import java.util.Scanner;

public class diagram_Ejercicio03 {

	public static void main(String[] args) {
		int suma = 0;
		int media = 0;
		int conteo = 0;
		int numero;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce un número");
		numero = reader.nextInt();
		while (numero >= 0) {
			suma += numero;
			conteo++;
			System.out.println("Introduce otro número");
			numero = reader.nextInt();

		}
		media = suma / conteo;
		System.out.println("La media es: " + media);
		System.out.println("La suma es: " + suma);
		System.out.println("Los nº positivos introducidos son: " + conteo);

		reader.close();
	}

}
