package unidad1.strings;

import java.util.Scanner;

public class Ejercicio11_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String frase, frase2;
        System.out.println("Introduce una frase: ");
        frase = teclado.nextLine();
        frase2 = frase.replace(" ", "").toLowerCase();
        boolean palindromo = true;

        for (int i = 0; i < frase2.length() / 2; i++) {
            if (frase2.charAt(i) != frase2.charAt(frase2.length() - 1 - i)){
                palindromo = false;
            }
        }

        if (palindromo) {
            System.out.println("La frase '" + frase + "' es un palíndromo.");
        }else{
            System.out.println("La frase '" + frase + "' no es un palíndromo.");
        }
    }
}