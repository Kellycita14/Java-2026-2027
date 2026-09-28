package unidad1.arrays;

public class Ejercicio2_arrays {
    public static void main(String[] args) {
        String [] simbolos = new String[10];
        simbolos[0] = "a";
        simbolos[1] = "x";
        simbolos[4] = "@";
        simbolos[6] = " ";
        simbolos[7] = "+";
        simbolos[8] = "Q";

        for (int i = 0; i < simbolos.length; i++) {
            System.out.println("Numeros[" + i + "]" + " = " + "[" + simbolos[i] + "]");
        }
    }
}