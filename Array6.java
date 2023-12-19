public class Array6 {

    public static void main(String[] args) {
        // Declarar e inicializar el array
        int[] tabla = new int[20];

        // Calcular y asignar la secuencia Fibonacci en cada posición
        for (int i = 0; i < tabla.length; ++i) {
            tabla[i] = fibonacci(i);
        }

        // Imprimir el array con la secuencia Fibonacci
        for (int valor : tabla) {
            System.out.print(valor + " ");
        }
    }

    // Función para calcular la secuencia Fibonacci de un número
    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
