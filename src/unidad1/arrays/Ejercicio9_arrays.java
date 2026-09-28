package unidad1.arrays;

import java.util.Random;

public class Ejercicio9_arrays {
    public static void main(String[] args) {
        Random aleatorios = new Random();
        int [] numeros = new int[20];
        int [] cuadrados = new int[20];
        int [] cubos = new int[20];


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorios.nextInt(0, 100);
            cuadrados[i] = (int) Math.pow(numeros[i],2);
            cubos[i] = (int) Math.pow(numeros[i], 3);


            System.out.println("Array: " + numeros[i]);
            System.out.println("Cuadrados: " + cuadrados[i]);
            System.out.println("Cubos: " + cubos[i]);
            System.out.println("--------------------");
        }

    }
}