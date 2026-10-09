package unidad1.arrays_matrices;

import java.util.Scanner;

public class Ejercicio12_a_m {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int mina_f = (int) (Math.random() * 3);
        int mina_c = (int) (Math.random() * 3);

        int tesoro_f = (int) (Math.random() * 3);
        int tesoro_c = (int) (Math.random() * 3);
        int fila, columna, movimientos = 0;
        boolean acabada = false;


        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][0] + " | " + matriz[i][1] + " | " + matriz[i][2]);
            if (i < 2){
                System.out.println("----------");
            }
        }

        System.out.println();
        do {
            System.out.println("Fila (0-2): ");
            fila = teclado.nextInt();
            System.out.println("Columna (0-2): ");
            columna = teclado.nextInt();
            movimientos++;

            if (fila == mina_f && columna == mina_c) {
                System.out.println("¡Ups! Lo siento. Has encontrado la mina. Ha perdido.");
                acabada = true;
            } else if (fila == tesoro_f && columna == tesoro_c) {
                System.out.println("Enhorabuena has encontrado el tesoro.");
                acabada = true;
            } else {
                System.out.println("No hay nada");
            }
        } while (movimientos < 5 && !acabada);


        if (!acabada) {
            System.out.println("Has perdido. No te quedan movimientos.");
        }
    }
}