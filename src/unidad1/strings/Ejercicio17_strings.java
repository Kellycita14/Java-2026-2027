package unidad1.strings;

import java.util.Scanner;

public class Ejercicio17_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String cadena, no_hay = "";
        char letra;

        String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
        System.out.println("Introduce un texto: ");
        cadena = teclado.nextLine().toLowerCase();

        for (int i = 0; i < alfabeto.length(); i++) {
            letra = alfabeto.charAt(i);
            if (cadena.indexOf(letra) == -1){
                no_hay += letra + " ";
            }
        }

        if (no_hay.isEmpty()){
            System.out.println("Están todas las letras del alfabeto.");
        }else {
            System.out.println("Letras que no han aparecido: " + no_hay.trim());
        }
    }
}