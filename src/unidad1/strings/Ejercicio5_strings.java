package unidad1.strings;

import java.util.Scanner;

public class Ejercicio5_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        String cadena;
        System.out.println("Introduce una cadena de texto: ");
        cadena = teclado.nextLine();

        StringBuilder sb = new StringBuilder(cadena);
        sb.reverse();

        System.out.println(sb);
    }
}