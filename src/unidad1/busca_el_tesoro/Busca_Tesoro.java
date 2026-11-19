package unidad1.busca_el_tesoro;

import java.util.Random;
import java.util.Scanner;

public class Busca_Tesoro {
    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();
    static final int FILAS = 5, COLUMNAS = 5;
    static final char TESORO = '$';
    static final char TESORO_ENCONTRADO = '€';
    static final char MINA = '!';
    static final char MINA_ENCONTRADA = '*';
    static final char DISPARO = 'X';
    static final char BLANCO = ' ';

    static void main() {
        char jugar;

        do {
            iniciar_partida();
            System.out.println("Quieres jugar otra partida (S/N)?");
            jugar = teclado.nextLine().toUpperCase().charAt(0);
        }while (jugar=='S');
    }

    static void iniciar_partida(){
        char[][] tablero = new char[FILAS][COLUMNAS];
        boolean partidaFinalizada;

        iniciar_tablero(tablero, 3);
        mostrar_tablero(tablero);

        do {
            partidaFinalizada = realizar_jugada(tablero);
            mostrar_tablero(tablero);
        }while (!partidaFinalizada);
    }

    static void iniciar_tablero(char[][] tablero, int num_minas) {
        int filas, columnas;

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = ' ';
            }
        }
        filas = aleatorio.nextInt(0, FILAS);
        columnas = aleatorio.nextInt(0, COLUMNAS);
        tablero[filas][columnas] = TESORO;


        while (num_minas > 0) {
            filas = aleatorio.nextInt(0, FILAS);
            columnas = aleatorio.nextInt(0, COLUMNAS);
            if (tablero[filas][columnas] != BLANCO) {
                tablero[filas][columnas] = MINA;
                num_minas--;
            }
        }
    }

    static void mostrar_tablero(char[][] tablero) {
        int n = tablero.length, m = tablero[0].length;
        if (n == 0) return;

        // 1. Calculamos los dígitos necesarios para filas y columnas
        int anchoFila = String.valueOf(n - 1).length();
        int anchoCol = Math.max(3, String.valueOf(m - 1).length());
        String margenIzq = " ".repeat(anchoFila);
        String barraHoriz = "─".repeat(anchoCol);
        int padIzq = (anchoCol - 1) / 2;
        int padDer = anchoCol - 1 - padIzq;

        // 2. Encabezado de columnas
        System.out.print(margenIzq + " ");
        for (int col = 0; col < m; col++) {
            System.out.printf("%-" + (anchoCol + 1) + "d", col);
        }
        System.out.println();

        // 3. Borde superior (┌───┬───┐)
        System.out.print(margenIzq + "┌");
        for (int col = 0; col < m; col++) {
            System.out.print(barraHoriz + (col < m - 1 ? "┬" : "┐"));
        }
        System.out.println();

        // 4. Filas y separadores intermedios
        for (int fila = 0; fila < n; fila++) {
            System.out.printf("%" + anchoFila + "d│", fila);

            for (int col = 0; col < m; col++) {
                System.out.printf(" ".repeat(padIzq));
                if (tablero[fila][col] == MINA || tablero[fila][col] == TESORO) {
                    System.out.print(BLANCO);
                } else {
                    System.out.print(tablero[fila][col]);
                }
                System.out.print(" ".repeat(padDer) + "│");
            }
            System.out.println();

            if (fila < n - 1) {
                System.out.print(margenIzq + "├");
                for (int col = 0; col < m; col++) {
                    System.out.print(barraHoriz + (col < m - 1 ? "┼" : "┤"));
                }
                System.out.println();
            }
        }

        // 5. Borde inferior (└───┴───┘)
        System.out.print(margenIzq + "└");
        for (int col = 0; col < m; col++) {
            System.out.print(barraHoriz + (col < m - 1 ? "┴" : "┘"));
        }

        System.out.println();
        System.out.println("\nPulsa Intro para continuar....");
        teclado.nextLine();
    }

    static boolean realizar_jugada(char[][] tablero) {
        int fila, columna;

        do {
            System.out.println("¿Dónde quieres excavar?");
            System.out.print("\tFila: ");
            fila = teclado.nextInt();
            teclado.nextLine();
            System.out.print("\tColumna: ");
            columna = teclado.nextInt();
            teclado.nextLine();
        } while (fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS);

        System.out.println();

        return comprobar_jugada(tablero, fila, columna);
    }

    static boolean comprobar_jugada(char[][] tablero, int fila, int columna) {

        if (tablero[fila][columna] == TESORO) {
            System.out.println("¡Enhorabuena! Has ganado");
            tablero[fila][columna] = TESORO_ENCONTRADO;
            return true;
        } else if (tablero[fila][columna] == MINA) {
            System.out.println("¡Lo siento! Has perdido");
            tablero[fila][columna] = MINA_ENCONTRADA;
            return true;
        } else {
            tablero[fila][columna] = DISPARO;
            return false;
        }
    }
}