package unidad1.strings;

import java.util.Scanner;

public class Ejercicio15_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce una cadena de caracteres: ");
        cadena = teclado.nextLine().trim();
        int palabras = 0;

        if (!cadena.isEmpty()){
            palabras = cadena.split(" ").length;
        }
        System.out.println("Total palabras: " + palabras);
    }
}