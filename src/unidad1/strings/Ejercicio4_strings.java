package unidad1.strings;

import java.util.Scanner;

public class Ejercicio4_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        System.out.println("Introduce una cadena de texto: ");
        cadena = teclado.nextLine().toLowerCase();

        for (int j = 0; j < cadena.length(); j++) {
            switch (cadena.charAt(j)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.println("Nº de aes: " + a);
        System.out.println("Nº de es: " + e);
        System.out.println("Nº de íes: " + i);
        System.out.println("Nº de oes: " + o);
        System.out.println("Nº de ues: " + u);
    }
}