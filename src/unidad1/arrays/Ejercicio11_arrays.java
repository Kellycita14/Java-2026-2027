package unidad1.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11_arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorios = new Random();

        int [] array = new int[100];
        int numero1, numero2;

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorios.nextInt(21);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Introduce un valor: ");
        numero1 = teclado.nextInt();
        System.out.println("Introduce otro valor: ");
        numero2 = teclado.nextInt();

        System.out.println("Array cambiado: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero1){
                array[i] = numero2;
                System.out.print("\" " + array[i] + " \" ");
            }else {
                System.out.print(array[i] + " ");
            }
        }
    }
}