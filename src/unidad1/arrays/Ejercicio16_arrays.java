package unidad1.arrays;

import java.util.Scanner;

public class Ejercicio16_arrays {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String [] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

        int dni;
        System.out.println("Introduce el DNI (sin la letra): ");
        dni = teclado.nextInt();
        int resto = dni % 23;

        System.out.println("El dni completo es: " + dni + letras[resto]);

    }
}