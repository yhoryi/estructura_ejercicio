public class rotaciones {

    public static void main(String[] args) {
        int[] arreglo = {15, 18, 2, 3, 6, 12}; 
        int rotaciones = encontrarNumeroDeRotaciones(arreglo);

        System.out.println("Número de rotaciones: " + rotaciones);
    }

    public static int encontrarNumeroDeRotaciones(int[] arr) {
        int izquierda = 0;
        int derecha = arr.length - 1;
        int n = arr.length;

        while (izquierda <= derecha) {
            if (arr[izquierda] <= arr[derecha]) {
                return izquierda;
            }

            int medio = izquierda + (derecha - izquierda) / 2;
            int siguiente = (medio + 1) % n;
            int anterior = (medio - 1 + n) % n;

            if (arr[medio] <= arr[anterior] && arr[medio] <= arr[siguiente]) {
                return medio;
            }

            if (arr[medio] <= arr[derecha]) {
                derecha = medio - 1;
            }
            else if (arr[medio] >= arr[izquierda]) {
                izquierda = medio + 1;
            }
        }

        return 0; 
    }
}
