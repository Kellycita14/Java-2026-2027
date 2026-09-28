package unidad1.arrays;

import java.util.Scanner;

public class Ejercicio6_arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] array = new int[10];
        int maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;
        System.out.println("Introduce 10 números: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = teclado.nextInt();
            if (array[i] > maximo){
                maximo = array[i];
            }

            if (array[i] < minimo){
                minimo = array[i];
            }
        }
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
    }
}