package unidad1.metodos;

import java.util.Random;

public class Ejercicio11_metodos {
    static void main() {
        int [] array = new int[10];
        rellenarArray(array);
        int mayor = buscarMayor(array);

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }

        System.out.println("El mayor número del array es: " + mayor);
    }

    public static int buscarMayor(int [] array){
        int mayor = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if (array[i] > mayor){
                mayor = array[i];
            }
        }
        return mayor;
    }

    public static void rellenarArray(int [] array){
        Random aleatorios = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorios.nextInt(0, 101);
        }
    }
}