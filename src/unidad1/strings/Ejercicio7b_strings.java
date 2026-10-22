package unidad1.strings;
import java.util.Scanner;

public class Ejercicio7b_strings {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;

        System.out.println("Introduce una cadena de texto: ");
        cadena = teclado.nextLine().trim();

        int palabras1 = 0;
        if (!cadena.isEmpty()) {
            palabras1 = 1;
            for (int i = 1; i < cadena.length(); i++) {
                if (cadena.charAt(i) != ' ' && cadena.charAt(i - 1) == ' ') {
                    palabras1++;
                }
            }
        }
        System.out.println("Palabras (recorriendo caracteres): " + palabras1);
    }
}
