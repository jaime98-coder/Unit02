package dowhileloops;

import java.util.Scanner;

public class DiagramEjercicio03 {

	public static void main(String[] args) {
		int suma=0;
		int contador=1;
		int num;
		Scanner reader = new Scanner (System.in);
		System.out.println("Introduce un número");
		num=reader.nextInt();
		do {
			suma+=contador;
			contador++;
			
		} while (contador<=num);
		System.out.println("La suma correlativa de los números es: "+suma);
				
		reader.close();
	}

}
