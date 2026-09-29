package unidad1.arrays;

public class Ejercicio14_arrays {
    static void main(String[] args) {
        int [] enteros = new int[55];
        int posicion = 0;

        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <= i ; j++) {
                enteros[posicion] = i;
                posicion++;
            }
        }

        for (int i = 0; i < enteros.length; i++) {
            System.out.print(enteros[i] + " ");
        }
    }
}