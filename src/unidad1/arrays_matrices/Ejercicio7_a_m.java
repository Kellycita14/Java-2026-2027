package unidad1.arrays_matrices;

import java.util.Scanner;

public class Ejercicio7_a_m {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Introduce un número N de personas: ");
        n = teclado.nextInt();
        double[][] personas = new double[n][2];
        double suma_h = 0, suma_m = 0, media_h = 0, media_m = 0;
        int hombres = 0, mujeres = 0;

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona " + (i + 1));
            System.out.print("Género (0 es hombre, 1 es mujer): ");
            personas[i][0] = teclado.nextInt();

            System.out.print("Sueldo: ");
            personas[i][1] = teclado.nextDouble();
        }

        for (int i = 0; i < personas.length; i++) {
            if (personas[i][0] == 0) {
                suma_h += personas[i][1];
                hombres++;
            }
            if (personas[i][0] == 1) {
                suma_m += personas[i][1];
                mujeres++;
            }
        }

        if (hombres > 0) {
            System.out.println("Sueldo medio de hombres: " + suma_h / hombres + "€");
        }

        if (mujeres > 0) {
            System.out.println("Sueldo medio de mujeres: " + suma_m / mujeres + "€");
        }

        if (hombres > 0 && mujeres > 0) {
            media_h = suma_h / hombres;
            media_m = suma_m / mujeres;

            if (media_h != media_m) {
                System.out.println("Existe brecha salarial");
            } else {
                System.out.println("No hay brecha salarial.");
            }
        }
    }
}