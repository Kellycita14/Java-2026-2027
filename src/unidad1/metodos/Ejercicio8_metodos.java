package unidad1.metodos;

public class Ejercicio8_metodos {
    static void main() {
        int resultado = calcularMayor(14, 12);
        System.out.println("El mayor es: " + resultado);
    }

    public static int calcularMayor(int x, int y) {
        if (x > y) {
            return x;
        } else if (x < y) {
            return y;
        } else {
            System.out.println("los dos números son iguales.");
            return x;
        }
    }
}