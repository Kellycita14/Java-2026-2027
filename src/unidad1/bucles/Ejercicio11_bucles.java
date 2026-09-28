package unidad1.bucles;

import java.util.Scanner;

public class Ejercicio11_bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int impares = 0, suma_imp = 0 , total = 0, mayor = Integer.MIN_VALUE;
        double media;

        do {
            System.out.println("Introduce un número: ");
            numero = teclado.nextInt();

            if (numero >= 0) {
                total++;
                if (numero % 2 == 0) {
                    if (numero > mayor) {
                        mayor = numero;
                    }
                } else {
                    impares++;
                    suma_imp = suma_imp + numero;
                }
            }
        } while (numero >= 0);

        if (impares > 0){
             media = (double) suma_imp / impares;
            System.out.println("La media de impares es: " + media);
        }
        System.out.println("Se han introducido: " + total + " números.");
        System.out.println("El mayor de los pares es: " + mayor);
    }
}