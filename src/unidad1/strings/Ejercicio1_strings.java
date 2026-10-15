package unidad1.strings;

import java.util.Scanner;

public class Ejercicio1_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce una cadena de texto: ");
        cadena = teclado.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }
}