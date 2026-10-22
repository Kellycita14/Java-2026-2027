package unidad1.strings;

import java.util.Scanner;

public class Ejercicio8_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String cadena, resultado = "";

        System.out.println("Introduce una cadena de texto: ");
        cadena = teclado.nextLine();

        String[] palabras = cadena.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].isEmpty()) {
                resultado += palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1) + " ";
            }
        }
        System.out.println(resultado.trim());
    }
}