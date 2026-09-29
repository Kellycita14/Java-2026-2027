package unidad1.arrays;

import java.util.Random;

public class Ejercicio15_arrays_sin_aux {
    static void main() {

        Random aleatorio = new Random();

        int[] array = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];

        int par = 0;
        int impar = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(101);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                pares[par] = array[i];
                par++;
            } else {
                impares[impar] = array[i];
                impar++;
            }
        }

        for (int i = 0; i < par; i++) {
            array[i] = pares[i];
        }

        for (int i = 0; i < impar; i++) {
            array[par + i] = impares[i];
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}