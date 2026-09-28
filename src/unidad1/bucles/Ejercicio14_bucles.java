package unidad1.bucles;

import java.util.Scanner;

public class Ejercicio14_bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero, suma = 0, cantidad = 0;
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0){
                System.out.println(i);
                suma = suma + i;
                cantidad++;
            }
        }

        System.out.println("Suma: " + suma);
        System.out.println("Cantidad: " + cantidad);
    }
}