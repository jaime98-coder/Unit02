package forloops;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Declaro la variable suma para almacenar el resultado total,
		// inicializándola en 0
		int suma = 0;
		// Declaro la variable numImpares para generar la secuencia de números impares,
		// empezando por el primero (1)
		int numImpares = 1;

		// Creo un for con el contador inicializado en 1, y haciendo que cuente hasta 10
		// ya que queremos sumar los 10 primeros impares
		for (int contador = 1; contador <= 10; contador++) {

			// Sumo el valor actual de 'numImpares' a la variable 'suma'
			suma += numImpares;

			// Actualizo 'numImpares' sumándole 2, para obtener el siguiente
			// número impar para la próxima vuelta del bucle
			numImpares += 2;

		}
		// Imprimo el mensaje final indicando la suma de los 10 primeros impares
		System.out.println("La suma de los 10 primeros impares es:" + suma);

	}

}