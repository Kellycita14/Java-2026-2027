package unidad1.arrays;

import java.util.Scanner;

public class Ejercicio3_arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeross;
        int[] numeros = new int[10];

        System.out.print("Introduce 10 números: ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Números al inverso: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
    }
}