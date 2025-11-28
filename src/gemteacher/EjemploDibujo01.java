package gemteacher;

import java.util.Scanner;

public class EjemploDibujo01 {

	public static void main(String[] args) {
		int lado;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el nº de * que tendrá cada lado del triángulo rectángulo");
		lado=sc.nextInt();
		for (int i=1; i<=lado; i++) {
			for (int j=i; j<=lado; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Fin del programa");
		sc.close();
	}

}
