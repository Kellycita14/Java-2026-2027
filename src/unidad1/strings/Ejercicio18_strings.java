package unidad1.strings;

import java.util.Scanner;

public class Ejercicio18_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String frase;
        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        int posicion1, posicion2, posicion3;
        String cifrado = "";
        char c;

        System.out.println("Introduce un mensaje: ");
        frase = teclado.nextLine().toUpperCase();

        System.out.println("Introduce el desplazamiento con el que quieres cifrar el mensaje: ");
        posicion2 = teclado.nextInt();

        for (int i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);
            if (c == ' '){
                cifrado += ' ';
            }else{
                posicion1 = alfabeto.indexOf(frase.charAt(i));
                posicion3 = (posicion1 + posicion2) % alfabeto.length();

                cifrado += alfabeto.charAt(posicion3);
            }
        }
        System.out.println("Cifrado César: " + cifrado.toLowerCase());
    }
}