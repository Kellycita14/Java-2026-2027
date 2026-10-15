package unidad1.strings;

import java.util.Scanner;

public class Ejercicio6_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        char letra;
        int contador = 0;

        System.out.println("Introduce una cadena de texto: ");
        cadena = teclado.nextLine().toLowerCase();
        System.out.println("Introduce una letra: ");
        letra = Character.toLowerCase(teclado.nextLine().charAt(0));

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra){
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces.");
    }
}