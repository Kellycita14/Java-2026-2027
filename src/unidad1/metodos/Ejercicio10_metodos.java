package unidad1.metodos;

public class Ejercicio10_metodos {
    static void main() {
        boolean resultado = sonDiferentes(14, 12, 25);
        System.out.println("¿Son diferentes? " + resultado);
    }

    public static boolean sonDiferentes(int x, int y, int z) {
        return x != y && x != z && y != z;
    }
}