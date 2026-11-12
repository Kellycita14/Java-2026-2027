package unidad1.wordle;

import java.util.Random;
import java.util.Scanner;

public class Wordle {
    static final int MAX_INTENTOS = 6;
    static final int LONGITUD = 5;
    static final int LETRA_GRIS = 0;
    static final int LETRA_AMARILLA = 1;
    static final int LETRA_VERDE = 2;

    //Colores
    static final String GRIS = "\u001b[90m";
    static final String AMARILLO = "\u001b[33m";
    static final String VERDE = "\u001b[32m";
    static final String RESET = "\u001B[0m";

    //Palabras diccionario
    static final String[] diccionario = {
            "RUBIA", "FAROL", "ROSAS", "PERRO", "GATOS", "CASAS", "LIBRO", "MESAS",
            "PLAYA", "NUBES", "VERDE", "SILLA", "COCHE", "TIGRE", "MUNDO", "TRIGO",
            "NOCHE", "CARTA", "PLATO", "JUEGO", "FUEGO", "SALUD", "RELOJ", "LIMON",
            "PIANO", "HOTEL", "VIDEO", "CLASE", "TECLA", "PAPEL"
    };

    static Scanner teclado = new Scanner(System.in);

    static void main() {
        String palabra_secreta = elegir_palabra();
        String[] intentos = new String[MAX_INTENTOS];
        int[][] colores = new int[MAX_INTENTOS][LONGITUD];
        int num_intentos = 0;
        boolean ganar = false;
        String intento;

        do {
            mostrar_tablero(intentos, colores, num_intentos, true);
            intento = pedir_intento(num_intentos + 1);
            intentos[num_intentos] = intento;
            colores[num_intentos] = calculo_poner_colores(intento, palabra_secreta);
            ganar = intento.equals(palabra_secreta);
            num_intentos++;
            System.out.println(palabra_secreta);
        } while (num_intentos < MAX_INTENTOS && !ganar);

        mostrar_tablero(intentos, colores, num_intentos, false);
        if (ganar) {
            System.out.println("¡Enhorabuena! Has ganado.");
        } else {
            System.out.println("¡Has perdiddo! La palabra era: " + palabra_secreta);
        }
    }

    static String elegir_palabra() {
        Random aleatorio = new Random();
        int posicion;
        posicion = aleatorio.nextInt(diccionario.length);
        return diccionario[posicion];
    }

    static String pedir_intento(int numero) {
        String texto;
        boolean valido = false;
        do {
            System.out.println("Intento " + numero + ": ");
            texto = teclado.nextLine().trim().toUpperCase();
            if (texto.length() != LONGITUD) {
                System.out.println("Error. La palabra debe tener " + LONGITUD + " letras.");
            } else if (!solo_letras(texto)) {
                System.out.println("Error. Solo se permiten letras.");
            } else {
                valido = true;
            }
        } while (!valido);
        return texto;
    }

    static boolean solo_letras(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (!Character.isLetter(texto.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static int[] calculo_poner_colores(String intento, String secreta) {
        int[] resultado = new int[LONGITUD];
        boolean[] usada = new boolean[LONGITUD];
        boolean encontrada = false;
        for (int i = 0; i < LONGITUD; i++) {
            if (intento.charAt(i) == secreta.charAt(i)) {
                resultado[i] = LETRA_VERDE;
                usada[i] = true;
                encontrada = true;
            }
        }

        for (int i = 0; i < LONGITUD; i++) {
            if (resultado[i] == LETRA_GRIS) {
                for (int j = 0; j < LONGITUD; j++) {
                    if (!usada[j] && intento.charAt(i) == secreta.charAt(j)) {
                        resultado[i] = LETRA_AMARILLA;
                        usada[j] = true;
                    }
                }
            }
        }
        return resultado;
    }

    static void mostrar_tablero(String[] intentos, int[][] colores, int num_intentos, boolean filas_vacias) {
        System.out.println();
        System.out.println("LA PALABRA DEL DÍA");

        for (int i = 0; i < num_intentos; i++) {
            mostrar_fila(intentos[i], colores[i]);
        }

        if (filas_vacias) {
            for (int fila = num_intentos; fila < MAX_INTENTOS; fila++) {
                for (int i = 0; i < LONGITUD; i++) {
                    System.out.print("_    ");
                }
                System.out.println();
            }
        }
    }

    static void mostrar_fila(String intentos, int[] colores) {
        String color;
        for (int i = 0; i < LONGITUD; i++) {
            color = GRIS;
            if (colores[i] == LETRA_VERDE) {
                color = VERDE;
            } else if (colores[i] == LETRA_AMARILLA) {
                color = AMARILLO;
            }
            System.out.print(color + intentos.charAt(i) + RESET + "    ");
        }
        System.out.println();


        for (int i = 0; i < LONGITUD; i++) {
            color = GRIS;
            if (colores[i] == LETRA_VERDE) {
                color = VERDE;
            } else if (colores[i] == LETRA_AMARILLA) {
                color = AMARILLO;
            }
            System.out.print(color + "-" + RESET + "    ");
        }
        System.out.println();
    }
}