public class Array5 {

    public static void main(String[] args) {
        // Declarar e inicializar el array
        int[] tabla = new int[10];

        // Calcular y asignar el factorial en cada posición
        for (int i = 0; i < tabla.length; ++i) {
            tabla[i] = factorial(i);
        }

        // Imprimir el array con los factoriales
        for (int valor : tabla) {
            System.out.print(valor + " ");
        }
    }

    // Función para calcular el factorial de un número
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
