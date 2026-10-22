package unidad1.strings;

import java.util.Scanner;

public class Ejercicio10_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int letras = 0;
        int numeros = 0;
        char caracter;

        System.out.println("Introduce una cadena: ");
        cadena = teclado.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if (Character.isLetter(caracter)){
                letras++;
            }else if (Character.isDigit(caracter)){
                numeros++;
            }
        }

        System.out.println("Número de letras: " + letras);
        System.out.println("Número de números: " + numeros);
    }
}