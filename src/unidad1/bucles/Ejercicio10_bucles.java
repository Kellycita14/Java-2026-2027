package unidad1.bucles;

import java.util.Scanner;

public class Ejercicio10_bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, suma = 0;

        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();
        if (numero >= 0) {
            for (int i = 1; i <= 100; i++) {
                suma = suma + numero + i;
            }
            System.out.println("La suma es: " + suma);
        } else {
            System.out.println("El número no es válido, se necesita un número positivo.");
        }
    }
}