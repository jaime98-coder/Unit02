package forloops;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int nota;
		int numSuspensos=0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce 5 notas");
		for (int contador=1; contador<=5; contador++) {
			nota=reader.nextInt();
			if (nota<5) {
				numSuspensos++;
			}
				
		}
		if (numSuspensos==0) {
			System.out.println("No hay ningun suspenso");
		}
		System.out.println("Si, hay "+numSuspensos+" suspenso(s)");
		reader.close();

	}

}
