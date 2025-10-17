package ifelse;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		double x1;
		double x2;
		double discriminante;
		double resultadoEcuacion;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce valor de a");
		a = reader.nextInt();
		System.out.println("Introduce valor de b");
		b = reader.nextInt();
		System.out.println("Introduce valor de c");
		c = reader.nextInt();
		discriminante = Math.pow(b, 2)-4*a*c;
		if (a==0) {
			x1 = (double)-c / b;
			System.out.println("La ecuación tiene solo una solución: "+x1);
		}else if (discriminante>=0) {
			// Si es positivo, y se aplica la fórmula
			x1 = (-b + Math.sqrt(discriminante))/(2*a);
			x2 = (-b - Math.sqrt(discriminante))/(2*a);
			System.out.println("El resultado 1 de la ecuación es: "+x1);
			System.out.println("El resultado 2 de la ecuación es: "+x2);
		} else {
			// Si es negativo, no tiene solución
			System.out.println("La ecuación no tiene solución");
		}
		
		reader.close();
	}

}
