public class Array7 {

    public static void main(String[] args) {
        // Declarar e inicializar el array
        int[] tabla = {3, 6, 2, 77, 3, 10, 23, 14};

        // Inicializar contadores para pares e impares
        int pares = 0, impares = 0;

        // Contar pares e impares en el array
        for (int valor : tabla) {
            if (valor % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Imprimir el resultado
        if (pares > impares) {
            System.out.println("Hay más pares.");
        } else if (pares < impares) {
            System.out.println("Hay más impares.");
        } else {
            System.out.println("Hay la misma cantidad de pares e impares.");
        }
    }
}
