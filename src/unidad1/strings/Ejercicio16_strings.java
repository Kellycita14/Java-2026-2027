package unidad1.strings;

import java.util.Scanner;

public class Ejercicio16_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String cadena, palabra_larga = "";
        System.out.println("Introduce una cadena de caracteres:");
        cadena = teclado.nextLine().trim();
        String [] palabras = cadena.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > palabra_larga.length()){
                palabra_larga = palabras[i];
            }
        }
        System.out.println("Palabra más larga: " + palabra_larga);
        System.out.println("Número de caracteres de la palabra más larga: " + palabra_larga.length());
    }
}