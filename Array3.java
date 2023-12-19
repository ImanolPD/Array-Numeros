public class Array3 {

    public static void main(String[] args) {
        // Declarar e inicializar el array
        int[] tabla = {3, 6, 2, 77, 3, 10, 23, 14};
        // Inicializar variable para verificar si todos los elementos son diferentes
        boolean todosDiferentes = true;

        // Verificar si hay elementos iguales en el array
        for (int i = 0; i < tabla.length - 1; ++i) {
            for (int j = i + 1; j < tabla.length; ++j) {
                if (tabla[i] == tabla[j]) {
                    // Si se encuentra un par de elementos iguales, actualizar la variable
                    todosDiferentes = false;
                    break;  // Salir del bucle interno
                }
            }
            if (!todosDiferentes) {
                break;  // Salir del bucle externo si ya se encontraron elementos iguales
            }
        }

        // Imprimir el resultado
        if (todosDiferentes) {
            System.out.println("Todos los elementos son diferentes.");
        } else {
            System.out.println("No todos los elementos son diferentes.");
        }
    }
}
