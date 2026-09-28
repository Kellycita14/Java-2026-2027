package unidad1.arrays;

public class Ejercicio10_arrays {
    public static void main(String[] args) {
        int [] array = new int[100];
        int [] array2 = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = array[99 - i];
        }

        System.out.println("Array 1: " );
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ " + array[i] + " ]");
        }
        System.out.println();
        System.out.println("Array 2: " );
        for (int i = 0; i < array2.length; i++) {
            System.out.print("[ " + array2[i] + " ]");
        }
    }
}