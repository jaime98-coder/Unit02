package diagrams;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Declaro la variable 'hora' para almacenar la hora introducida.
		int hora;
		// Declaro la variable 'min' para almacenar los minutos introducidos.
		int min;
		// Declaro la variable 'seg' para almacenar los segundos introducidos.
		int seg;

		// Creo el Scanner para leer la entrada del usuario.
		Scanner reader = new Scanner(System.in);

		// Solicito y leo de la consola la hora.
		System.out.println("Introduce horas");
		hora = reader.nextInt();

		// Solicito y leo de la consola los minutos.
		System.out.println("Introduce minutos");
		min = reader.nextInt();

		// Solicito y leo de la consola los segundos.
		System.out.println("Introduce segundos");
		seg = reader.nextInt();

		// Creo una estructura if-else anidada para calcular la hora un segundo después.
		if (seg < 59) {
			// Si los segundos son menores que 59, simplemente los incremento.
			seg++;

		} else {
			// Si los segundos son 59, los reinicio a 0.
			seg = 0;
			// Y compruebo los minutos.
			if (min < 59) {
				// Si los minutos son menores que 59, los incremento.
				min++;
			} else {
				// Si los minutos son 59, los reinicio a 0.
				min = 0;
				// Y compruebo la hora.
				if (hora < 23) {
					// Si la hora es menor que 23, la incremento.
					hora++;
				} else {
					// Si la hora es 23, la reinicio a 0 (medianoche).
					hora = 0;
				}
			}
		}

		// Imprimo la nueva hora calculada (un segundo después).
		System.out.println(hora + " horas " + min + " minutos" + " y " + seg + " segundos");

		// Cierro el Scanner.
		reader.close();

	}
}