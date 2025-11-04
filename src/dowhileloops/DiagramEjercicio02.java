package dowhileloops;


public class DiagramEjercicio02 {

	public static void main(String[] args) {
		// Declaro la variable num inicializada a 1, para que comience a verificar los nº pares desde el 1.
		int num=1;
		
		
		// Creo el bucle primero con DO para establecer que es lo que debe hacer en bucle cuando se cumpla condición posterior.
		do {
			// Creo un IF para comprobar cuando el nº es par (que el módulo de 0)
			if (num%2==0) {
				// Imprimo la variable num
				System.out.println(num);
			}
			// Sumo 1 con num++ para ir comprobando todos los números
			num++;
			// Establezco la condición con el WHILE para que siempre que se cumpla que el num sea menor o igual a 200, se repita el DO
		} while (num<=200);
		
		// Cierro el Scanner
	}

}
