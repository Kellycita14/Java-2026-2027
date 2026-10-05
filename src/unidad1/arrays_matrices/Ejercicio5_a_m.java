package unidad1.arrays_matrices;

import java.util.Scanner;

public class Ejercicio5_a_m {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 20 números: ");
        int [][] matriz = new int[4][5];
        int suma_fila, suma_columna, suma_total = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            suma_fila = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
                suma_fila+= matriz[i][j];
            }
            System.out.println("| Σ fila " + i + " = " + suma_fila);
            suma_total += suma_fila;
        }

        System.out.println("....................................");

        for (int j = 0; j < 5; j++) {
            suma_columna = 0;
            for (int i = 0; i < 4; i++) {
                suma_columna += matriz[i][j];
            }
            System.out.print(suma_columna + "\t");
        }
        System.out.println("| TOTAL = " + suma_total);
    }
}