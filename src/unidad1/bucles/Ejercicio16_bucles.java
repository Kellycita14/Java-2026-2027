package unidad1.bucles;

import java.util.Scanner;

public class Ejercicio16_bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, divisores;
        System.out.println("Introduce un número positivo: ");
        numero = teclado.nextInt();
        for (int i = numero; i < numero + 5; i++) {
            divisores = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                System.out.println(i + " es primo.");
            } else {
                System.out.println(i + " no es primo.");
            }
        }
    }
}