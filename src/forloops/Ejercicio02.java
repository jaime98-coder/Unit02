package forloops;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int contMult3 = 0;
		int num;
		int contador;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num = reader.nextInt();
		for (contador = 1; contador <= num; contador++) {
			if (contador % 3 == 0) {
				contMult3++;
			}
		}
		System.out.println("Hay "+contMult3+" múltiplos de 3");
		reader.close();

	}

}
