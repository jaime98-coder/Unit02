package gemteacher;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioTipoExamen01B {

    public static void main(String[] args) {
        
        // 1. Declaración de variables al inicio (Buena práctica: orden y claridad)
        // Inicializamos el Scanner. Lo llamamos 'sc' por convención.
        Scanner sc = new Scanner(System.in);
        
        // Variable booleana para controlar el bucle del menú sin usar 'break' abruptos.
        boolean salir = false;
        
        // Variables para la lógica del programa
        int opcionMenu = 0;
        int cantidadAlumnos = 0;
        double notaActual = 0.0;
        double sumaNotas = 0.0;
        double media = 0.0;
        String resultadoFinal = "";
        
        // Variable booleana para validar la entrada de datos correcta dentro del try-catch
        boolean datoValido = false;

        // Comienzo del bucle principal del menú (Do-While es ideal para menús) 
        do {
            // Reiniciamos el control de validez para cada iteración del menú
            datoValido = false;

            // Bloque Try-Catch para capturar errores de entrada (letras en vez de números) 
            try {
                // Mostrar opciones
                System.out.println("\n--- GESTIÓN DE CALIFICACIONES ---");
                System.out.println("1. Introducir notas y calcular media");
                System.out.println("2. Salir");
                System.out.print("Seleccione una opción: ");

                // Lectura de la opción
                opcionMenu = sc.nextInt();

                // Estructura Switch para el control de flujo [cite: 452]
                switch (opcionMenu) {
                    case 1:
                        // Lógica para introducir notas
                        System.out.println("¿Cuántos alumnos vas a evaluar?");
                        cantidadAlumnos = sc.nextInt();

                        // Aserción: Verificamos que la cantidad sea lógica (si se activan con -ea) [cite: 112]
                        // Esto ayuda a detectar errores lógicos durante el desarrollo
                        assert cantidadAlumnos > 0 : "La cantidad de alumnos debe ser positiva";

                        // Reiniciamos la suma para el nuevo cálculo
                        sumaNotas = 0.0;

                        // Bucle For controlado por contador para pedir cada nota 
                        for (int i = 1; i <= cantidadAlumnos; i++) {
                            
                            // Bucle While para validación de rango (0-10) 
                            // Inicializamos la nota a un valor inválido para entrar al bucle
                            notaActual = -1; 
                            
                            while (notaActual < 0 || notaActual > 10) {
                                System.out.print("Introduce la nota del alumno " + i + " (0-10): ");
                                notaActual = sc.nextDouble();

                                // Condicional simple para dar feedback si falla [cite: 281]
                                if (notaActual < 0 || notaActual > 10) {
                                    System.out.println("Error: La nota debe estar entre 0 y 10.");
                                }
                            }
                            
                            // Acumulamos la nota
                            sumaNotas = sumaNotas + notaActual;
                        }

                        // Cálculo matemático
                        media = sumaNotas / cantidadAlumnos;

                        // Uso de Operador Ternario para decidir el mensaje 
                        resultadoFinal = (media >= 5) ? "APROBADO" : "SUSPENSO";

                        System.out.println("La media de la clase es: " + media);
                        System.out.println("El resultado global es: " + resultadoFinal);
                        break;

                    case 2:
                        // Modificamos la bandera (flag) para salir ordenadamente en la condición del while
                        System.out.println("Cerrando aplicación. ¡Hasta pronto!");
                        salir = true;
                        break;

                    default:
                        System.out.println("Opción no reconocida. Intente de nuevo.");
                }

                // Marcamos el dato como válido para no saltar al catch
                datoValido = true;

            } catch (InputMismatchException e) {
                // Captura del error si el usuario introduce texto en lugar de número [cite: 66]
                System.out.println("ERROR CRÍTICO: Has introducido un valor no numérico.");
                
                // Importante: Limpiar el buffer del Scanner para evitar bucle infinito de error
                sc.nextLine(); 
            }

        // La condición de salida está explicita aquí, evitando el uso de break; para cortar el flujo [cite: 663]
        } while (!salir);

        // Cerrar siempre el Scanner al final para liberar recursos [cite: 352]
        sc.close();
    }
}