package diagrams;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int hora;
		int min;
		int seg;
		Scanner reader = new Scanner(System.in);
		hora = reader.nextInt();
		min = reader.nextInt();
		seg = reader.nextInt();

		if (seg < 59) {
			seg++;

		} else {
			seg = 0;
		}
		if (min < 59) {
			min++;
		} else {
			min = 0;
		}
		if (hora < 23) {
			hora++;
		} else {
			hora = 0;
		}
		System.out.println(hora+" horas"+min+" minutos"+" y"+seg+" segundos");
		reader.close();
	}

}
