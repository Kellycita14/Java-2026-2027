package unidad1.arrays;

import java.util.Scanner;

public class Ejercicio4_arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int positivos = 0, negativos = 0;
        int[] array = new int[10];

        System.out.println("Introduce 20 números: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = teclado.nextInt();
            if (array[i] > 0) {
                positivos = positivos + array[i];
            } else if (array[i] < 0) {
                negativos = negativos + array[i];
            }
        }
        System.out.println("Suma de los números positivos: (" + positivos + ")");
        System.out.println("Suma de los números negativos: (" + negativos + ")");
    }
}