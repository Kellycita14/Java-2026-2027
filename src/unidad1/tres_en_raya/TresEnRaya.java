package unidad1.tres_en_raya;

import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {
    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();
    static final int TURNO_PERSONA = 1;
    static final int TURNO_PC = 2;

    static void main() {

        char[][] tablero = new char[3][3];
        char ficha_jugador, ficha_ordenador;
        int turno, jugadas = 0;

        boolean partida_finalizada;
        System.out.println("Bienvenido al tres en raya...\n");
        ficha_jugador = elegir_ficha_jugador();
        ficha_ordenador = asignar_ficha_ordenador(ficha_jugador);

        turno = elegir_turno();
        iniciar_tablero(tablero);
        mostrar_tablero(tablero);

        /*jugada_humano(tablero, ficha_jugador);
        mostrar_tablero(tablero);
        jugada_ordenador(tablero, ficha_ordenador);
        mostrar_tablero(tablero);*/

        do {
            if (turno == TURNO_PERSONA) {
                jugada_humano(tablero, ficha_jugador);
            }else {
                jugada_ordenador(tablero, ficha_ordenador);
            }
            mostrar_tablero(tablero);
            jugadas++;
            partida_finalizada = comprobar_victoria(tablero, jugadas, turno);
            turno = (turno == TURNO_PERSONA) ? TURNO_PC : TURNO_PERSONA;
        }while (!partida_finalizada);
    }

    static char elegir_ficha_jugador() {
        char ficha;

        do {
            System.out.println("¿Qué ficha deseas (X - O)?");
            ficha = teclado.nextLine().toUpperCase().charAt(0);
        } while (ficha != 'X' && ficha != 'O');

        return ficha;
    }

    static char asignar_ficha_ordenador(char ficha_jugador) {
        char ficha_ordenador = (ficha_jugador == 'X') ? 'O' : 'X';
        return ficha_ordenador;
    }

    static int elegir_turno() {
        System.out.println("Sorteo de turnos...");
        int eleccion, moneda;
        do {
            System.out.println("Elige cara (1) o cruz (2):");
            eleccion = teclado.nextInt();
            teclado.nextLine();

        } while (eleccion != 1 && eleccion != 2);

        moneda = aleatorio.nextInt(1, 3);

        if (eleccion == moneda) {
            System.out.println("Has acertado. Te toca el primer turno...");
            return TURNO_PERSONA;
        } else {
            System.out.println("No has acertado. Te toca el segundo turno...");
            return TURNO_PC;
        }
    }

    static void mostrar_tablero(char[][] tablero) {
        System.out.println("\nTres en raya");
        System.out.println("   0   1   2");
        System.out.println(" ┌───┬───┬───┐");
        for (int fila = 0; fila < tablero.length; fila++) {
            System.out.print(fila + "|");
            for (int columna = 0; columna < tablero.length; columna++) {
                System.out.print(" " + tablero[fila][columna] + " |");
            }
            System.out.println();
            if (fila < tablero.length - 1) {
                System.out.println(" ├───┼───┼───┤");
            }
        }
        System.out.println(" └───┴───┴───┘");
        System.out.println("\nPulsa Intro para continuar...\n");
        teclado.nextLine();
    }

    static void iniciar_tablero(char[][] tablero) {
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero.length; columna++) {
                tablero[fila][columna] = ' ';
            }
        }
    }

    static void jugada_humano(char[][] tablero, char ficha) {
        int fila, columna;
        System.out.println("Tu turno...");
        do {
            System.out.println("¿Fila?");
            fila = teclado.nextInt();
            teclado.nextLine();
            System.out.println("¿Columna?");
            columna = teclado.nextInt();
            teclado.nextLine();
        } while (fila < 0 || fila > 2 || columna < 0 || columna > 2 || tablero[fila][columna] != ' ');
        tablero[fila][columna] = ficha;
    }

    static void jugada_ordenador(char[][] tablero, char ficha) {
        int fila, columna;

        System.out.println("Turno del ordenador...");
        do {
            fila = aleatorio.nextInt(0, 3);
            columna = aleatorio.nextInt(0, 3);
        } while (tablero[fila][columna] != ' ');
        tablero[fila][columna] = ficha;
    }

    static boolean comprobar_victoria(char[][] tablero, int jugadas, int turno) {
        if ( (tablero[0][0] != ' ' && tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2]) ||
             (tablero[1][0] != ' ' && tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2]) ||
             (tablero[2][0] != ' ' && tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2]) ||
             (tablero[0][0] != ' ' && tablero[0][0] == tablero[1][0] && tablero[0][0] == tablero[2][0]) ||
             (tablero[0][1] != ' ' && tablero[0][1] == tablero[1][1] && tablero[0][1] == tablero[2][1]) ||
             (tablero[0][2] != ' ' && tablero[0][2] == tablero[1][2] && tablero[0][2] == tablero[2][2]) ||
             (tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) ||
             (tablero[0][2] != ' ' && tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0])
        ){
            if (turno == TURNO_PERSONA){
                System.out.println("¡Enhorabuena! Has ganado");
            }else{
                System.out.println("¡Lo siento! Has perdido!");
            }
            return true;
        } else if (jugadas == 9) {
            System.out.println("¡Partida finalizada! Empate.");
            return true;
        }
        return false;
    }
}