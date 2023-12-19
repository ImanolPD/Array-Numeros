import java.util.Arrays;
import java.util.Random;

public class Array9 {

    public static void main(String[] args) {
        // Declarar e inicializar el array
        int[] tabla = new int[8];

        // Crear un objeto Random para generar valores aleatorios
        Random rand = new Random();

        // Generar valores aleatorios sin repetición
        for (int i = 0; i < tabla.length; ++i) {
            int valorAleatorio;
            do {
                valorAleatorio = rand.nextInt(40);  // Números de 0 a 39
            } while (contiene(tabla, valorAleatorio));

            tabla[i] = valorAleatorio;
        }

        // Imprimir el array con los valores aleatorios
        System.out.println("Valores aleatorios sin repetición: " + Arrays.toString(tabla));
    }

    // Función para verificar si un valor ya existe en el array
    private static boolean contiene(int[] array, int valor) {
        for (int elemento : array) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;
    }
}
