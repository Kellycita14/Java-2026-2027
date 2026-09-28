package unidad1.bucles;

import java.util.Scanner;

public class Ejercicio13_bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, suma = 0, cantidad = 0;
        double media;

        do {
            System.out.println("Introduce números: ");
            numero = teclado.nextInt();

            suma += numero;
            cantidad++;

            media = (double) suma / cantidad;
            media = Math.round(media * 100) / 100.0;
        } while (suma <= 10000);

        System.out.println("La suma es: " + suma);
        System.out.println("Cantidad de números: " + cantidad);
        System.out.println("La media es: " + media);

    }
}