package unidad1.bucles;

import java.util.Scanner;

public class Ejercicio9_bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int primo = 0;
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0){
                primo++;
            }
        }

        if (primo == 2){
            System.out.println("El número " + numero + " es primo.");
        }else {
            System.out.println("El número " + numero + " no es primo.");
        }
    }
}