package unidad1.bucles;

public class Ejercicio12_bucles {
    public static void main(String[] args) {
        int divisores;
        System.out.println("Números primos del 2 al 100: ");
        for (int numero = 2; numero <= 100; numero++) {
            divisores = 0;
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores++;
                }
            }
            if (divisores == 2 ||numero == 100) {
                System.out.println(numero);
            }
        }
    }
}