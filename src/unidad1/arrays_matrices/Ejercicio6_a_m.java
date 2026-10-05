package unidad1.arrays_matrices;

import java.util.Scanner;

public class Ejercicio6_a_m {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, suma;
        double [][] notas = new double[2][3];
        double media;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas del alumno " + (i + 1) + ": ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Asignatura " + (j + 1) + ": ");
                notas[i][j] = teclado.nextDouble();
            }
        }

        for (int i = 0; i < notas.length; i++) {
            suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > max) {
                    max = notas[i][j];
                }

                if (notas[i][j] < min) {
                    min = notas[i][j];
                }

                suma += notas[i][j];
            }

            media = suma / notas[i].length;

            System.out.println("\tAlumno " + (i + 1));
            System.out.println("\t\t -Nota mínima: " + min);
            System.out.println("\t\t -Nota máxima: " + max);
            System.out.println("\t\t -Nota media: " + media);
        }
    }
}