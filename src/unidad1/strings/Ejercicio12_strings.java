package unidad1.strings;

import java.util.Scanner;

public class Ejercicio12_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String palabra1, palabra2, letra;
        boolean anagrama;

        System.out.println("Introduce la primera palabra: ");
        palabra1 = teclado.nextLine().replace(" ", "").toLowerCase();
        System.out.println("Introduce la segunda palabra: ");
        palabra2 = teclado.nextLine().replace(" ", "").toLowerCase();

        anagrama = palabra1.length() == palabra2.length();

        for (int i = 0; i < palabra1.length(); i++) {
            letra = String.valueOf(palabra1.charAt(i));

            if (!palabra2.contains(letra)){
                anagrama = false;
            }
        }

        if (anagrama){
            System.out.println("Las palabras son anagramas.");
        }else {
            System.out.println("Las palabras no son anagramas.");
        }
    }
}