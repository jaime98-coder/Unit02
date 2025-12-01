package gemteacher;

import java.util.Scanner;

// El usuario debe introducir números enteros para ir sumándolos.
// El programa se detendrá cuando el usuario introduzca el número 0.
// Al final, mostrar la suma total.

public class Info01 {

	public static void main(String[] args) {
		int num;
		int suma=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al programa =)");
		System.out.println("Si deseas salir en cualquier momento pulsa '0'");
		System.out.println("\nIntroduce un nº entero para sumarlos");
		num = sc.nextInt();
		while (num!=0) {
			suma = suma+num;
			System.out.println("Introduce otro número");
			num =sc.nextInt();
		}
		System.out.println("La suma de todos los números introducidos es: "+suma);
		System.out.println("\nFin del programa =)");
		sc.close();
	}

}
