package diagrams;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int numHoras;
		double tarifa;
		double salarioBruto;
		double salarioNeto;
		double tasas=0;
		String nombre;
		Scanner reader = new Scanner(System.in);
		nombre = reader.nextLine();
		numHoras = reader.nextInt();
		tarifa = reader.nextInt();
		
		if (numHoras<=35) {
			salarioBruto=numHoras*tarifa;
		} else {
			salarioBruto=35*tarifa+(numHoras-35)*tarifa*1.5;
		
		}
		
		if (salarioBruto<=500) {
			salarioNeto=salarioBruto;
		} else if (salarioBruto<=900) {
			tasas = salarioBruto*0.25;
			salarioNeto = salarioBruto-salarioBruto*0.25;
		} else {
			tasas = salarioBruto*0.45;
			salarioNeto = salarioBruto-salarioBruto*0.45;
		}
		System.out.println("Nombre:"+nombre);
		System.out.println("Salaro bruto:"+salarioBruto);
		System.out.println("Tasas"+tasas);
		System.out.println("Salario neto:"+salarioNeto);
		
		reader.close();
	}

}
