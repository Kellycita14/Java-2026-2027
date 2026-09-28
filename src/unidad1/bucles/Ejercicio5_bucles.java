package unidad1.bucles;

import java.util.Scanner;

public class Ejercicio5_bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int contraseña = 141225;
        int pass;
        int intentos = 0;
        do {
            System.out.println("Introduce la contraseña correcta: ");
            pass = teclado.nextInt();
            if (pass==contraseña){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
            }else {
                System.out.println("Lo siento, esa no es la combinación.");
            }
            intentos++;
        }while (intentos < 4 && pass!=contraseña);
    }
}