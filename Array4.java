public class Array4 {

    public static void main(String[] args) {
        // Declarar e inicializar el array
        int[] tabla = {3, 6, 2, 77, 3, 10, 23, 14};

        // Guardar el último elemento en una variable temporal
        int temp = tabla[tabla.length - 1];

        // Desplazar los elementos a la derecha
        for (int i = tabla.length - 1; i > 0; --i) {
            tabla[i] = tabla[i - 1];
        }

        // Colocar el elemento temporal en la primera posición
        tabla[0] = temp;

        // Imprimir el array rotado
        for (int valor : tabla) {
            System.out.print(valor + " ");
        }
    }
}
