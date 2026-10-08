package unidad1.arrays_matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10_a_m {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorios = new Random();
        int[] mesas = new int[10];
        int grupo, mesa;

        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = aleatorios.nextInt(0, 5);
        }

        System.out.println("-Restaurante La Mia Mamma-");
        System.out.print("Mesas libres: ");
        for (int i = 0; i < mesas.length; i++) {
            System.out.print(mesas[i] + " ");
        }

        System.out.println();

        do {
            System.out.println("¿Cuántos son? (Introduzca -1 para salir): ");
            grupo = teclado.nextInt();

            if (grupo == -1) {
                System.out.println("Gracias. Hasta pronto.");
            } else {
                if (grupo > 4 || grupo < 0) {
                    System.out.println("Lo siento, no admitiomos grupos de " + grupo + ", haga grupos de 4 personas como máximo e intente de nuevo");
                } else {
                    mesa = -1;

                    for (int i = 0; i < mesas.length; i++) {
                        if (mesas[i] == 0 && mesa == -1) {
                            mesa = i;
                        }
                    }

                    if (mesa != -1) {
                        mesas[mesa] = mesas[mesa] + grupo;
                    } else {
                        System.out.println("Lo siento, no hay sitio para " + grupo + " personas.");
                    }
                    System.out.println("---------------------------------------------------");
                    System.out.println("Mesa nº   |\t1 |\t2 |\t3 |\t4 |\t5 |\t6 |\t7 |\t8 |\t9 |\t10 ");
                    System.out.println("---------------------------------------------------");
                    System.out.print("Ocupación |\t");

                    for (int i = 0; i < mesas.length; i++) {
                        System.out.print(mesas[i]);
                        if (i < mesas.length - 1) {
                            System.out.print(" |\t");
                        }

                    }
                    System.out.println();
                    System.out.println("---------------------------------------------------");
                }
            }
        } while (grupo != -1);
    }
}