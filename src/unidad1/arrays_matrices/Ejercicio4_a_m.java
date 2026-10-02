package unidad1.arrays_matrices;

import java.util.Scanner;

public class Ejercicio4_a_m {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int N, M;
        System.out.println("Introduce un valor para definir el número de filas (N): ");
        N = teclado.nextInt();
        System.out.println("Introduce un valor para definir el número de columnas (M): ");
        M = teclado.nextInt();
        int[][] matriz = new int[N][M];
        int pos = 0, neg = 0, ceros = 0;


        System.out.println("Introduce los valores de la matriz: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matriz[i][j] > 0){
                    pos++;
                }else if (matriz[i][j] < 0){
                    neg++;
                }else {
                    ceros++;
                }
            }
        }

        System.out.println("TOTAL: ");
        System.out.println("Valores mayores que cero: " + pos);
        System.out.println("valores menores que cero: " + neg);
        System.out.println("Valores iguales a cero: " + ceros);

    }
}