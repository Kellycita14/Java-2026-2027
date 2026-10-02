package unidad1.arrays_matrices;

public class Ejercicio2_a_m {
    static void main() {
        int[][] matriz = new int[5][5];
        int numero = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = numero;
                numero++;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
