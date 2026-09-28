package unidad1.arrays;

public class Ejercicio1_arrays {
    public static void main(String[] args) {
        int [] numeros = new int[12];
        numeros[0] = 39;
        numeros[1] = -2;
        numeros [4] = 0;
        numeros[6] = 14;
        numeros[8] = 5;
        numeros[9] = 120;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numeros[" + i + "]" + " = " + "[" + numeros[i] + "]");
        }
    }
}