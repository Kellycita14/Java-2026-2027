package unidad1.strings;

import java.util.Scanner;

public class Ejercicio2_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String cadena, cadena2;

        System.out.println("Introduce una cadena de texto: ");
        cadena = teclado.nextLine();

        System.out.println("Introduce otra cadena de texto: ");
        cadena2 = teclado.nextLine();

        if (cadena.equalsIgnoreCase(cadena2)){
            System.out.println("Son iguales, sin diferenciar entre mayúsculas o minúsculas.");
        }else {
            System.out.println("Son distintas");
        }
    }
}