package unidad1.arrays_matrices;

import java.util.Scanner;

public class Ejercicio7_a_m {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Introduce un número N de personas: ");
        n = teclado.nextInt();
        double [][] personas = new double[n][2];

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona " + (i + 1));
            System.out.print("Género (0 es hombre, 1 es mujer): ");
            personas[i][0] = teclado.nextInt();

            System.out.print("Sueldo: ");
            personas[i][1] = teclado.nextDouble();
        }
    }
}