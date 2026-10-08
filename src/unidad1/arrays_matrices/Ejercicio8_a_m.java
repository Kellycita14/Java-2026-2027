package unidad1.arrays_matrices;

import java.util.Random;

public class Ejercicio8_a_m {
    static void main() {
        Random aleatorios = new Random();
        int[][] matriz = new int[10][10];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        double media = 0, suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorios.nextInt(200, 301);
            }
        }

        System.out.println("(Matriz)");

        System.out.print("----------------------------------------");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println();

        System.out.println("----------------------------------------");
        System.out.print("Diagonal: (");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i]);
            if (i < matriz.length - 1){
                System.out.print(", ");
            }
            if (matriz[i][i] > max){
                max = matriz[i][i];
            }

            if (matriz[i][i] < min){
                min = matriz[i][i];
            }
            suma += matriz[i][i];
        }
        System.out.println(")");
        media = suma / matriz.length;

        System.out.println();
        System.out.println("TOTAL");
        System.out.println("\t-Mínimo: " + min);
        System.out.println("\t-Máximo: " + min);
        System.out.println("\t-Media: " + media);
    }
}