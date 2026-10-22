package unidad1.strings;

import java.util.Scanner;

public class Ejercicio9_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String cadena, sin_letra;
        char letra;
        int contador1 = 0, contador2 = 0;
        System.out.println("Introduce una cadena de texto: ");
        cadena = teclado.nextLine();

        System.out.println("Introduce una letra: ");
        letra = teclado.nextLine().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra){
                contador1++;
            }
        }

        System.out.println("Veces que aparece (recorriendo): " + contador1);

        sin_letra = cadena.replace(String.valueOf(letra), "");
        contador2 = cadena.length() - sin_letra.length();

        System.out.println("Veces que aparece (con replace): " + contador2);
    }
}