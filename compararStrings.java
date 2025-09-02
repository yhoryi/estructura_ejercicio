public class compararStrings {

    public static void compararStrings(String str1, String str2) {
       
        boolean mismaLongitud = str1.length() == str2.length();
        int longitudMinima = Math.min(str1.length(), str2.length());
        int coincidencias = 0;

        for (int i = 0; i < longitudMinima; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                coincidencias++;
            }
        }

        double porcentajeSimilitud = (longitudMinima > 0)
                ? ((double) coincidencias / longitudMinima) * 100
                : 0;

        System.out.println("¿Tienen la misma longitud? " + (mismaLongitud ? "Sí" : "No"));
        System.out.printf("Similitud de caracteres en la misma posición: %.2f%%\n", porcentajeSimilitud);
    }

    public static void main(String[] args) {
        String cadena1 = "gato";
        String cadena2 = "gata";

        compararStrings(cadena1, cadena2);
    }
}
