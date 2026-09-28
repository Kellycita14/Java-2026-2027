package unidad1.bucles;

import java.util.Scanner;

public class Ejercicio7_bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int positivos = 0;
        double total = 0;

        do {
            System.out.println("Introduce un número: ");
            numero = teclado.nextInt();
            if (numero >= 0) {
                positivos++;
                total += numero;
            }
        } while (numero >= 0);

        System.out.println("La media es de: " + positivos + " números positivos.");
    }
}