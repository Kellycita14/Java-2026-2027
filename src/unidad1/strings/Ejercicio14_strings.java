package unidad1.strings;

import java.util.Scanner;

public class Ejercicio14_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        String dni, numerico;
        char letra, letra_correcta;
        int numero;

        boolean numeros;
        System.out.println("Introduce el dni: ");
        dni = teclado.nextLine().trim().toUpperCase();

        if (dni.length() != 9) {
            System.out.println("DNI inválido. Debe tener 8 caracteres y una letra.");
        } else {
            numerico = dni.substring(0, 8);
            letra = dni.charAt(8);
            numeros = true;

            for (int i = 0; i < numerico.length(); i++) {
                if (!Character.isDigit(numerico.charAt(i))) {
                    numeros = false;
                }
            }

            if (!numeros || !Character.isLetter(letra)) {
                System.out.println("DNI inválido. Debe tener 8 números y una letra.");
            } else {
                numero = Integer.parseInt(numerico);
                letra_correcta = letras[numero % 23];

                if (letra == letra_correcta) {
                    System.out.println("DNI válido.");
                } else {
                    System.out.println("DNI inválido. La letra correcta del dni es: " + letra_correcta);
                }

            }
        }
    }
}