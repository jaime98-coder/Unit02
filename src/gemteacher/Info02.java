package gemteacher;

public class Info02 {

	public static void main(String[] args) {
		// Bucle EXTERNO (i): Controla las filas.
		// Se ejecutará 2 veces (i=0, i=1)
		
		for (int i = 0; i < 2; i++) {
		    
		    System.out.println("Entramos en la Fila " + i);

		    // Bucle INTERNO (j): Controla las columnas.
		    // Se ejecutará 3 veces COMPLETAS por cada vez que 'i' cambie.
		    for (int j = 1; j <= 3; j++) {
		        System.out.print(j + " "); 
		    }
		    
		    // Salto de línea al terminar la fila (cuando acaba el bucle interno)
		    System.out.println(); 
		}

	}

}
