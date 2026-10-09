package unidad1.arrays_matrices;

import java.util.Scanner;

public class Ejercicio11_a_m {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        boolean acabado = false;
        int fila, columna;
        String[][] tablero = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };

        char jugador = 'X';

        for (int turno = 0; turno < 9; turno++) {
            for (int i = 0; i < 3; i++) {
                System.out.println(
                        tablero[i][0] + " | " +
                                tablero[i][1] + " | " +
                                tablero[i][2]
                );
                if (i < 2) {
                    System.out.println("---------");
                }
            }

            System.out.println("Jugador " + jugador);
            System.out.print("Fila (0-2): ");
            fila = teclado.nextInt();
            System.out.println("Coulmna (0-2): ");
            columna = teclado.nextInt();

            if (tablero[fila][columna] == " ") {
                tablero[fila][columna] = String.valueOf(jugador);
                if (jugador == 'X') {
                    jugador = 'O';
                } else {
                    jugador = 'X';
                }
            } else {
                System.out.println("Casilla ocupada");
            }
        }
    }
}