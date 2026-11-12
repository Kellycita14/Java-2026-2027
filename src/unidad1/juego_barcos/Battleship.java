package unidad1.juego_barcos;

import java.util.Random;
import java.util.Scanner;

public class Battleship {
    //Tablero
    static final int FILAS = 10;
    static final int COLUMNAS = 10;

    //Colores
    static final String AZUL = "\u001b[34m";
    static final String AMARILLO = "\u001b[33m";
    static final String ROJO = "\u001b[31m";
    static final String RESET = "\u001B[0m";

    //Simbolos
    static final char AGUA = '~';
    static final char AGUA_TOCADA = '*';
    static final char BARCO_TOCADO = '#';

    //Celda sin barco
    static int NO_HAY_BARCO = -1;

    static final int[] TAMAÑOS = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};

    //Barcos colocados
    static int[][] barcos = new int[FILAS][COLUMNAS];

    //Disparos
    static boolean[][] disparado = new boolean[FILAS][COLUMNAS];

    //Barcos tocados
    static int[] tocados = new int[TAMAÑOS.length];

    //Barcos hundidos
    static int hundidos = 0;

    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();

    static void main() {
        String texto;
        int fila, columna;

        iniciar_tablero();
        colocar_barcos();
        do {
            mostrar_tablero();
            texto = pedir_disparo();

            if (!texto.equals("salir")) {
                fila = texto.charAt(0) - 'A';
                columna = texto.charAt(1) - '0';
                calcular_disparo(fila, columna);
            }
        } while (!texto.equals("salir") && hundidos < TAMAÑOS.length);

        if (hundidos == TAMAÑOS.length) {
            mostrar_tablero();
            System.out.println("¡Enhorabuena! Has hundido toda la flota.");
        } else {
            System.out.println("Has abandonado la partida.");
        }
    }


    static String simbolo(int fila, int columna) {
        String resultado = AZUL + AGUA + RESET;
        if (disparado[fila][columna]) {
            if (barcos[fila][columna] == NO_HAY_BARCO) {
                resultado = AMARILLO + AGUA_TOCADA + RESET;
            } else {
                resultado = ROJO + BARCO_TOCADO + RESET;
            }
        }
        return resultado;
    }

    static void iniciar_tablero() {
        for (int f = 0; f < FILAS; f++) {
            for (int c = 0; c < COLUMNAS; c++) {
                barcos[f][c] = NO_HAY_BARCO;
            }
        }
    }

    static void mostrar_separador() {
        System.out.print("   +");
        for (int c = 0; c < COLUMNAS; c++) {
            System.out.print("---+");
        }
        System.out.println();
    }

    static void mostrar_tablero() {
        System.out.println();
        System.out.print("     ");
        for (int c = 0; c < COLUMNAS; c++) {
            System.out.print(c + "   ");
        }
        System.out.println();
        mostrar_separador();

        for (int f = 0; f < FILAS; f++) {
            System.out.print(" " + (char) ('A' + f) + " |");
            for (int c = 0; c < COLUMNAS; c++) {
                System.out.print(" " + simbolo(f, c) + " |");
            }
            System.out.println();
            mostrar_separador();
        }
    }

    static void colocar_barcos() {
        boolean colocado;
        boolean horizontal;
        int fila, columna;
        for (int pos = 0; pos < TAMAÑOS.length; pos++) {
            colocado = false;
            do {
                fila = aleatorio.nextInt(FILAS);
                columna = aleatorio.nextInt(COLUMNAS);
                horizontal = aleatorio.nextBoolean();

                if (puede_colocarse(fila, columna, TAMAÑOS[pos], horizontal)) {
                    colocar_barco(pos, fila, columna, TAMAÑOS[pos], horizontal);
                    colocado = true;
                }
            } while (!colocado);
        }
    }

    static boolean puede_colocarse(int fila, int columna, int tamaño, boolean horizontal) {
        int fila_fin = fila;
        int columna_fin = columna;
        boolean se_puede = true;

        if (horizontal) {
            columna_fin = columna + tamaño - 1;
        }else {
            fila_fin = fila + tamaño - 1;
        }

        if (fila_fin >= FILAS || columna_fin >= COLUMNAS) {
            se_puede = false;
        }else {
            for (int f = fila - 1; f <= fila_fin + 1 ; f++) {
                for (int c = columna - 1; c <= columna_fin + 1; c++) {
                    if (f >= 0 && f < FILAS && c >= 0 && c < COLUMNAS) {
                        if (barcos[f][c] != NO_HAY_BARCO){
                             se_puede = false;
                        }
                    }
                }
            }
        }
        return se_puede;
    }

    static void colocar_barco(int pos, int fila, int columna, int tamaño, boolean horizontal) {
        for (int i = 0; i < tamaño; i++) {
            if (horizontal){
                barcos[fila][columna + i] = pos;
            }else {
                barcos[fila + i][columna] = pos;
            }
        }
    }

    static String pedir_disparo(){
        String texto;
        boolean valido;

        do {
            System.out.print("¡Dispara! (Indica las coordenadas, 'salir' para abandonar): ");
            texto = teclado.nextLine().trim().toUpperCase();

            if (texto.equalsIgnoreCase("salir")) {
                texto = "salir";
                valido = true;
            }else {
                texto = texto.toUpperCase();
                valido = es_coordenada_valida(texto);
            }
            if (!valido){
                System.out.println();
            }
        }while (!valido);
        return texto;
    }

    static boolean es_coordenada_valida(String texto){
        boolean valida = false;
        char letra, numero;

        if (texto.length() == 2){
            letra =  texto.charAt(0);
            numero = texto.charAt(1);
            if (letra >= 'A' && letra <= 'A' + FILAS && numero >= '0' && numero < '0' + COLUMNAS){
                valida = true;
            }
        }
        return valida;
    }

    static void calcular_disparo(int fila, int columna){
        int pos;

        if (disparado[fila][columna]){
            System.out.println("Posición ya tocada");
        }else {
            disparado[fila][columna] = true;
            pos = barcos[fila][columna];
            if (pos == NO_HAY_BARCO){
                System.out.println(AZUL + "Agua" + RESET);
            }else{
                tocados[pos]++;
                if (tocados[pos] == TAMAÑOS[pos]){
                    hundidos++;
                    System.out.println(ROJO + "Hundidos: " + nombre_barco(TAMAÑOS[pos]) + RESET);
                }else {
                    System.out.println(ROJO + "Tocados: " + nombre_barco(TAMAÑOS[pos]) + RESET);
                }
            }
        }
    }

    static String nombre_barco(int tamaño){
        String nombre = "";

        if (tamaño == 2) {
            nombre = "Fragata";
        }else if (tamaño == 3){
            nombre = "Submarino";
        }else if (tamaño == 4){
            nombre = "Acorazado";
        }else if (tamaño == 5){
            nombre = "Portaaviones";
        }else{
            System.out.println("No existe ese barco");
        }
        return nombre;
    }
}