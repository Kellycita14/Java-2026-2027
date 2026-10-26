package unidad1.metodos;

import java.util.Random;

public class Ejercicio3_metodos {
    static void main() {
        int [] numeros = new int[11];
        rellenarArray(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Array: [" + i + "] = " + numeros[i]);
        }
    }

    public static void rellenarArray(int[] array){
        Random aleatorios = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorios.nextInt(0, 101);
        }
    }
}
