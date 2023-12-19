public class Array10 {

    public static void main(String[] args) {
        // Declarar e inicializar el array
        int[] tabla = {3, 6, 21, 77, 14, 10, 28, 35};

        // Contar valores divisibles entre 7
        int divisiblesEntre7 = 0;

        for (int valor : tabla) {
            if (valor % 7 == 0) {
                divisiblesEntre7++;
            }
        }

        // Imprimir el resultado
        System.out.println("Cantidad de valores divisibles entre 7: " + divisiblesEntre7);
    }
}
