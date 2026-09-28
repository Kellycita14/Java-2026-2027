package unidad1.arrays;

import java.util.Scanner;

public class Ejercicio8_arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int P, Q;
        System.out.println("Introduce un número (P): ");
        P = teclado.nextInt();
        System.out.println("Introduce un número (Q): ");
        Q = teclado.nextInt();

        int[] array = new int[Q - P +1];

        for (int i = 0; i < array.length; i++) {
            array[i] = P + i;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1){
                System.out.print(", ");
            }

        }
    }
}