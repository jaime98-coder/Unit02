package whileloops;

import java.util.Scanner;

public class DiagramEjercicio05 {
	public static void main(String[] args) {
		// Declaro la variable sumaEdad y la inicializo a 0 para establecer un valor
		// origen
		int sumaEdad = 0;
		// Declaro la variable numAlumno y la inicializo a 0 para establecer un valor
		// origen
		int numAlumno = 0;
		// Declaro la variable numMayorEdad y la inicializo a 0 para establecer un valor
		// origen
		int numMayorEdad = 0;
		// Declaro la variable mediaEdad para calcular la media de las edades
		// introducidas
		double mediaEdad;
		// Declaro la variable edad para almacenar los valores introducidos por el
		// usuario
		int edad;

		// Creo el Scanner
		Scanner reader = new Scanner(System.in);

		// Solicito una edad al usuario y la leo de la consola
		System.out.println("Introduce una edad");
		edad = reader.nextInt();

		// Creo el bucle WHILE para que siempre que la edad sea positiva ejecute el
		// código que contiene
		while (edad >= 0) {
			// Almaceno en sumaEdad la suma de las edades introducidas
			sumaEdad += edad;
			// Almaceno en numAlumno un conteo de las edades introducidas por el usuario
			// (siendo el nº de alumnos que hay)
			numAlumno++;
			// Creo un IF para establecer cuando la edad sea mayor de 18 (mayor de edad) y
			// ejecutar un conteo de los alumnos mayores de edad
			if (edad >= 18) {
				numMayorEdad++;
			}

			// Solicito al usuario que introduzca otra edad y la leo de la consola
			System.out.println("Introduce otra edad");
			edad = reader.nextInt();
		}
		// Calculo la media de las edades y casteo el cálculo para que la media pueda contener decimales
		mediaEdad = (double) sumaEdad / numAlumno;
		
		// Imprimo el mensaje final de la suma de las edades
		System.out.println("La suma de las edades es:" + sumaEdad);
		// Imprimo el mensaje final de la media de las edades
		System.out.println("La media de las edades es:" + mediaEdad);
		// Imprimo el mensaje final del nº de alumnos introducidos
		System.out.println("Número de alumnos introducidos:" + numAlumno);
		// Imprimo el mensaje final del nº de alumnos mayores de edad
		System.out.println("Número de alumnos mayores de edad:" + numMayorEdad);

		// Cierro el Scanner
		reader.close();
	}
}
