package unidad1.arrays;

import java.util.Random;

public class Ejercicio15_arrays {
    static void main() {
        Random aleatorios = new Random();
        int [] array = new int[20];

        int pos = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorios.nextInt(101);
        }

        for (int i = 0; i < array.length; i++) {
            int aux;
            if (array[i] % 2 == 0){
                aux = array[i];
                array[i] = array[pos];
                array[pos] = aux;
                pos++;
            }
        }

        boolean barra = false;

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && barra == false){
                System.out.print("| ");
                barra = true;
            }
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}