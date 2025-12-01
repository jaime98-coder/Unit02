package gemteacher;

// Importamos la excepción específica para errores de tipo (ej: meter letra en vez de número) [cite: 66]
import java.util.InputMismatchException;
// Importamos la clase Scanner para poder leer datos del teclado
import java.util.Scanner;

public class EjercicioTipoExamen01 {

	// Método principal donde arranca la ejecución del programa
	public static void main(String[] args) {
		// Declaración de variables al inicio (Buena Práctica: orden y limpieza)
		int numAlumnos;
		// Usamos double para notas y medias porque pueden tener decimales
		double nota;
		// Inicializamos mediaNotas para evitar errores, aunque se sobrescribirá
		double mediaNotas = 0;
		// Variable acumuladora para sumar todas las notas
		double sumaNotas;
		// Variable para guardar la opción del menú y controlar el bucle principal
		int opcionMenu = 0;
		// String para guardar el mensaje de texto final
		String estadoFinal;
		// Creamos el objeto Scanner llamado 'sc' (Estándar de nomenclatura)
		Scanner sc = new Scanner(System.in);

		// Bucle do-while principal: Se ejecuta al menos una vez para mostrar el menú
		// [cite: 657]
		do {
			// REINICIO CRÍTICO: Ponemos la suma a 0 en cada vuelta del menú para no
			// acumular datos antiguos
			sumaNotas = 0;

			// Bloque try: Vigilamos este código por si el usuario introduce letras en vez
			// de números [cite: 54]
			try {
				// Mostramos las opciones del menú por consola
				System.out.println("1. Comenzar");
				System.out.println("2. Salir");
				// Leemos la opción elegida por el usuario
				opcionMenu = sc.nextInt();

				// Estructura switch para decidir qué hacer según la opción (evita muchos
				// if-else) [cite: 452]
				switch (opcionMenu) {
				case 1:
					System.out.println("Has comenzado el programa");

					// Validación de entrada: Bucle do-while para obligar a poner un número positivo
					// [cite: 656]
					do {
						System.out.println("Introduce el número de alumnos que vas a insertar");
						numAlumnos = sc.nextInt();
						// Feedback al usuario si se equivoca
						if (numAlumnos <= 0) {
							System.out.println("Error: Debe de haber al menos 1 alumno");
						}
						// Se repite MIENTRAS el número sea inválido (menor o igual a 0)
					} while (numAlumnos <= 0);

					// Bucle for: Sabemos cuántas veces iterar (numAlumnos veces) [cite: 693]
					for (int i = 1; i <= numAlumnos; i++) {

						// Validación de rango: Bucle anidado para asegurar nota entre 0 y 10
						do {
							System.out.println("Introduce la nota del alumno " + i);
							nota = sc.nextDouble();
							// Feedback específico si se sale del rango
							if (nota < 0 || nota > 10) {
								System.out.println("Introduce una nota entre 0 y 10, por favor");
							}
							// Se repite MIENTRAS la nota sea inválida (< 0 O > 10)
						} while (nota < 0 || nota > 10);

						// Acumulador: Sumamos la nota válida a nuestro total
						sumaNotas += nota;
					}

					// Cálculo matemático: Suma total dividida por cantidad de alumnos
					mediaNotas = sumaNotas / numAlumnos;

					// Operador Ternario: Forma abreviada de if-else para asignar valor [cite: 401]
					// (condición) ? valor_si_true : valor_si_false
					estadoFinal = (mediaNotas >= 5) ? "APROBADO" : "SUSPENSO";

					// Mostramos los resultados finales por pantalla
					System.out.println("Nota final del curso: " + mediaNotas);
					System.out.println("El resultado final del curso es: " + estadoFinal);

					// Break fundamental para que no siga ejecutando los siguientes casos del switch
					// [cite: 498]
					break;

				case 2:
					System.out.println("Has salido del programa");
					// Aquí no hace falta lógica extra, el bucle principal terminará por la
					// condición del while
					break;

				default:
					// Se ejecuta si el usuario pone un número que no es 1 ni 2 (ej: 5) [cite: 463]
					System.out.println("Por favor, elija 1 o 2");
					break;
				}

				// Captura la excepción si el usuario introduce texto en lugar de un número
				// entero/decimal [cite: 66]
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Debes introducir un número, no letras");
				// LIMPIEZA DE BUFFER: Vital. Consume el "intro" o texto erróneo para evitar
				// bucle infinito
				sc.nextLine();
			}

			// Condición del bucle principal: Se repite MIENTRAS la opción NO sea 2 (Salir)
			// [cite: 613]
		} while (opcionMenu != 2);

		// Cerramos el Scanner para liberar los recursos del sistema [cite: 352]
		sc.close();
	}
}