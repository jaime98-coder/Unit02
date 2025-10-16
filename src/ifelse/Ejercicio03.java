package ifelse;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		final double X=(-b+-(Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
		double resultadoEcuacion;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce valor de a");
		a = reader.nextInt();
		System.out.println("Introduce valor de b");
		b = reader.nextInt();
		System.out.println("Introduce valor de c");
		c = reader.nextInt();
		resultadoEcuacion=a*Math.pow(X, 2)+b*X+c;
		System.out.println("El valor de la ecuación de segundo grado es"+resultadoEcuacion);
		reader.close();
	}

}
