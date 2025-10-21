package switchcase;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Declaro la variable 
		int nota;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce una nota entera");
		nota = reader.nextInt();
		switch (nota) {
		case 1,2,3,4 : System.out.println("Insuficiente");
		break;
		case 5: System.out.println("Suficiente");
		break;
		case 6: System.out.println("Bien");
		break;
		case 7,8: System.out.println("Notable");
		break;
		case 9,10: System.out.println("Sobresaliente");
		break;
		default: System.out.println("El valor introducido es incorrecto");
		}
		reader.close();
	}

}
