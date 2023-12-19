public class Array8 {

    public static void main(String[] args) {
        // Declarar e inicializar el array
        int[] tabla = {3, 6, 2, 77, 3, 10, 23, 14};

        // Verificar si la secuencia es la misma al leer de izquierda a derecha y de derecha a izquierda
        boolean esIgual = true;

        for (int i = 0; i < tabla.length / 2; ++i) {
            if (tabla[i] != tabla[tabla.length - 1 - i]) {
                esIgual = false;
                break;
            }
        }

        if (esIgual) {
            System.out.println("La secuencia es la misma al leer de izquierda a derecha y de derecha a izquierda.");
        } else {
            System.out.println("La secuencia no es la misma al leer de izquierda a derecha y de derecha a izquierda.");
        }
    }
}
