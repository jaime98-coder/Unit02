package generalloops;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
       
        // --- DECLARACIÓN DE VARIABLES ---

        // Variable para guardar el número de referencia (el mayor encontrado hasta el momento)
        int ultimoValido;
        
        // Variable para guardar el número que introduce el usuario en cada vuelta
        int num;
        
        // Contador para saber cuántos números se han introducido en total
        int totalNumeros;
        
        // Contador para saber cuántos números han sido menores que el anterior (fallos)
        int fallos;
        
        // Declaramos la variable Scanner
        Scanner reader;

        // --- INICIALIZACIÓN ---
        
        // Inicializamos el Scanner
        reader = new Scanner(System.in);

        // Inicializamos los contadores a 0
        totalNumeros = 0;
        fallos = 0;

        // --- LÓGICA DEL PROGRAMA ---

        // Pedimos el número inicial para establecer la referencia
        System.out.print("Dime un número inicial: ");
        
        // Leemos el primer número (el inicial)
        ultimoValido = reader.nextInt();

        // Comprobamos si el número inicial es 0
        if (ultimoValido == 0) {
            // Si el inicial es 0, terminamos y mostramos 0
            System.out.println("Fin del programa");
            System.out.println("Total de números introducidos: 0");
            
        } else {
            // Si no es 0, contamos este primer número inicial
            totalNumeros = totalNumeros + 1;

            // --- LECTURA ANTICIPADA ---
            // Leemos el primer "num" de la secuencia ANTES del bucle
            // para que el while pueda evaluar si es 0 o no desde el principio.
            System.out.print("Dime un número: ");
            num = reader.nextInt();

            // El bucle se ejecutará mientras el número leído NO sea 0
            while (num != 0) {
                
                // Si ha entrado aquí, es que el número no es 0, así que lo contamos
                totalNumeros = totalNumeros + 1;

                // Comprobamos si el número actual es mayor que el último válido
                if (num > ultimoValido) {
                    // Si es mayor, actualizamos la referencia
                    ultimoValido = num;
                } else {
                    // Si es menor o igual, mostramos mensaje de error
                    System.out.println("Fallo es menor.");
                    // Y sumamos 1 al contador de fallos
                    fallos = fallos + 1;
                }

                // --- ACTUALIZACIÓN DE LA VARIABLE DE CONTROL ---
                // Volvemos a pedir un número justo al final del bucle.
                // Esto permite que la condición (num != 0) se evalúe de nuevo al subir.
                System.out.print("Dime un número: ");
                num = reader.nextInt();
            }

            // Cuando el usuario escribe 0, el while termina naturalmente y llegamos aquí
            System.out.println("Total de números introducidos: " + totalNumeros);
            System.out.println("Números fallados: " + fallos);
        }

        // Cerramos el scanner
        reader.close();
    }
}