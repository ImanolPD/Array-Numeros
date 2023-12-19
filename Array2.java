public class Array2 {

    public static void main(String[] args) {
        // Declarar e inicializar el array
        int[] tabla = {3, 6, 2, 77, 3, 10, 23, 14, 5, 8};
        // Calcular la mitad del array
        int mitad = tabla.length / 2;
        // Inicializar variables para las sumas de las mitades
        int sumaPrimeraMitad = 0, sumaSegundaMitad = 0;

        // Calcular la suma de la primera mitad
        for (int i = 0; i < mitad; ++i) {
            sumaPrimeraMitad += tabla[i];
        }

        // Calcular la suma de la segunda mitad
        for (int i = mitad; i < tabla.length; ++i) {
            sumaSegundaMitad += tabla[i];
        }

        // Comparar las sumas e imprimir el resultado
        if (sumaPrimeraMitad > sumaSegundaMitad) {
            System.out.println("La suma de la primera mitad es mayor.");
        } else if (sumaPrimeraMitad < sumaSegundaMitad) {
            System.out.println("La suma de la segunda mitad es mayor.");
        } else {
            System.out.println("La suma de ambas mitades es igual.");
        }
    }
}
