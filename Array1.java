public class Array1 {

    public static void main(String[] args) {
        // Declarar e inicializar el array
        int[] tabla = {3, 6, 2, 77, 3, 10, 23, 14};
        // Inicializar contador para contar ocurrencias del valor 3
        int contador = 0;

        // Recorrer el array
        for (int i = 0; i < tabla.length; ++i) {
            // Verificar si el elemento actual es igual a 3
            if (tabla[i] == 3) {
                // Incrementar el contador
                contador++;
            }
        }

        // Imprimir el resultado
        System.out.println("Cantidad de valores 3 en el array: " + contador);
    }
}
