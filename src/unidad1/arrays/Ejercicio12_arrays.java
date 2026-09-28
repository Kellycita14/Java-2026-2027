package unidad1.arrays;

import java.util.Scanner;

public class Ejercicio12_arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        double [] temperatura = new double[12];
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Indica la temperatura media de " + meses[i] + ": ");
            temperatura[i] = teclado.nextDouble();
        }

        for (int i = 0; i < temperatura.length; i++) {
            System.out.print(meses[i] + ": ");
            for (int j = 0; j < temperatura[i]; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}