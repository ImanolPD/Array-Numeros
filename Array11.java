public class Array11 {

    public static void main(String[] args) {
        // Declarar e inicializar el array
        int[] tabla = {3, 6, 5, 77, 14, 10, 23, 35};

        // Contar valores primos
        int primos = 0;

        for (int valor : tabla) {
            if (esPrimo(valor)) {
                primos++;
            }
        }

        // Imprimir el resultado
        System.out.println("Cantidad de números primos: " + primos);
    }

    // Función para verificar si un número es primo
    private static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
