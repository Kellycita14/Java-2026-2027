package unidad1.arrays;

import java.util.Scanner;

public class Ejercicio7_arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N, M;
        System.out.println("Introduce un número (N): ");
        N = teclado.nextInt();
        System.out.println("Introduce un número (M): ");
        M = teclado.nextInt();

        int[] array = new int[N];
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = M;
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }
}