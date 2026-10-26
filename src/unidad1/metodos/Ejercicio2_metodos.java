package unidad1.metodos;

import java.util.Scanner;

public class Ejercicio2_metodos {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int negativo;
        System.out.println("Escribe un número negativo: ");
        negativo = teclado.nextInt();
        mostrarValorAbsoluto(negativo);
    }

    public static void mostrarValorAbsoluto(int numero){
        int absoluto = Math.abs(numero);
        System.out.println("El absoluto del número es: " + absoluto);
    }
}
