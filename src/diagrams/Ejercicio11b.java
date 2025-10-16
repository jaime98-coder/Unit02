package diagrams;

import java.util.Scanner;

public class Ejercicio11b {

    public static void main(String[] args) {
        int numHoras;
        double tarifaHoras;
        double salarioBruto;
        double salarioNeto;
        double tasas = 0;
        double exceso;
        double impuestoSegundoTramo;
        double excesoTercerTramo;
        double impuestoTercerTramo;
        String nombre;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del empleado");
        nombre = reader.nextLine();
        System.out.println("Introduce el número de horas trabajadas");
        numHoras = reader.nextInt();
        System.out.println("Introduce la tarifa (cobro por hora)");
        tarifaHoras = reader.nextDouble();

        // Cálculo del salario bruto (correcto)
        if (numHoras <= 35) {
            salarioBruto = numHoras * tarifaHoras;
        } else {
            salarioBruto = 35 * tarifaHoras + (numHoras - 35) * tarifaHoras * 1.5;
        }

        
        if (salarioBruto <= 500) {
            // Primer tramo: libre de impuestos
            tasas = 0;
            salarioNeto = salarioBruto;
        } else if (salarioBruto <= 900) {
            // Segundo tramo: solo el exceso sobre 500 paga 25%
            exceso = salarioBruto - 500;
            tasas = exceso * 0.25;
            salarioNeto = salarioBruto - tasas;
        } else {
            // Tercer tramo: 
            // - Primeros 500€: libres (0%)
            // - Siguientes 400€: 25% 
            // - Resto: 45%
            impuestoSegundoTramo = 400 * 0.25;        // 100€ de impuestos
            excesoTercerTramo = salarioBruto - 900;   // Lo que pasa de 900€
            impuestoTercerTramo = excesoTercerTramo * 0.45;
            
            tasas = impuestoSegundoTramo + impuestoTercerTramo;
            salarioNeto = salarioBruto - tasas;
        }
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Tasas: " + tasas);
        System.out.println("Salario neto: " + salarioNeto);

        reader.close();
    }
}