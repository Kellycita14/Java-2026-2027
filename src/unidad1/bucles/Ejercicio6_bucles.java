package unidad1.bucles;

import java.util.Scanner;

public class Ejercicio6_bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resultado;
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();
        System.out.println("Tabla del " + numero + ": ");
        for (int i = 1; i <= 10; i++) {
            resultado = i * numero;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}