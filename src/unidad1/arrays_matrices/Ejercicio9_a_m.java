package unidad1.arrays_matrices;

import java.util.Random;

public class Ejercicio9_a_m {
    static void main() {
        Random aleatorios = new Random();
        String [] pais = {"España", "Rusia", "Japón", "Australia"};
        int [][] alturas = new int[4][10];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, suma = 0;
        int media;
        for (int i = 0; i < pais.length; i++) {
            for (int j = 0; j < alturas[i].length; j++) {
                alturas[i][j] = aleatorios.nextInt(140, 211);
            }
        }

        System.out.printf("%-12s", "");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%4s", "");
        }

        System.out.printf("  %4s%4s%4s%n", "MED", "MIN", "MAX");

        for (int i = 0; i < alturas.length; i++) {
            System.out.printf("%-12s", pais[i] + ": ");
            for (int j = 0; j < alturas[i].length; j++) {
                System.out.printf("%4d", alturas[i][j]);

                if (alturas[i][j] > max){
                    max = alturas[i][j];
                }

                if (alturas[i][j] < min){
                    min = alturas[i][j];
                }
                suma += alturas[i][j];

            }
            media = suma / alturas[i].length;
            System.out.println(" | " + media + " " + min + " " + max);
        }
    }
}