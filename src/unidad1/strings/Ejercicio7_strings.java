package unidad1.strings;

import java.util.Scanner;

public class Ejercicio7_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String cadena;

        System.out.println("Introduce una cadena de texto: ");
        cadena = teclado.nextLine().trim();
        String [] palabras = cadena.split(" ");

        System.out.println("Número de palabras: " + palabras.length);

    }
}