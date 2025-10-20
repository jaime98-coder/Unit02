package switchcase;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int dia;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 7 para saber que día de la semana es");
		dia = reader.nextInt();
		switch (dia) {
		case 1-> System.out.println("Lunes");
		case 2-> System.out.println("Martes");
		case 3-> System.out.println("Miercoles");
		case 4-> System.out.println("Jueves");
		case 5-> System.out.println("Viernes");
		case 6-> System.out.println("Sábado");
		case 7-> System.out.println("Domingo");
		default-> System.out.println("El valor introducido es incorrecto");
		}
		reader.close();
	}

}
