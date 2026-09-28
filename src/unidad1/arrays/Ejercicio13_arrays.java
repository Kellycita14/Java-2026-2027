package unidad1.arrays;

import java.util.Scanner;

public class Ejercicio13_arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v, n, incremento;
        System.out.println("Introduce un valor inicial: ");
        v = teclado.nextInt();

        System.out.println("Introduce el incremento: ");
        incremento = teclado.nextInt();

        System.out.println("Introduce la cantidad de valores: ");
        n = teclado.nextInt();

        int [] array = new int[n];

        array[0] = v;

        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + incremento;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1){
                System.out.print(", ");
            }
        }
    }
}