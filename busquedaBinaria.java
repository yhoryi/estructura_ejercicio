public class busquedaBinaria {
    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        
        int objetivo = 13; 

        int resultado = busquedaBinaria(arreglo, objetivo);

        if (resultado == -1) {
            System.out.println("El número " + objetivo + " no se encuentra en el arreglo.");
        } else {
            System.out.println("El número " + objetivo + " se encuentra en la posición: " + resultado);
        }
    }

    public static int busquedaBinaria(int[] arr, int objetivo) {
        int izquierda = 0;
        int derecha = arr.length - 1;

        System.out.println("Iniciando búsqueda binaria...");

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            System.out.println("Izquierda: " + izquierda + ", Derecha: " + derecha + ", Medio: " + medio);
            System.out.println("Comparando " + objetivo + " con " + arr[medio]);

            if (arr[medio] == objetivo) {
                return medio; 
            }

            if (objetivo < arr[medio]) {
                derecha = medio - 1;
            }             else {
                izquierda = medio + 1;
            }
        }

        return -1; 
    }
}
