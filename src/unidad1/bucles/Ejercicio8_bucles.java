package unidad1.bucles;

import java.util.Scanner;

public class Ejercicio8_bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 10 números: ");
        int numero, negativo = 0, positivo = 0;
        for (int i = 1; i <= 10 ; i++) {
            numero = teclado.nextInt();
            if (numero < 0){
                negativo++;
            }else {
                positivo++;
            }
        }
        System.out.println("Hay " + positivo + " números positivos.");
        System.out.println("Hay " + negativo + " números negativos.");
    }
}