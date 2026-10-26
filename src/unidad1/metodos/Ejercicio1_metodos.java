package unidad1.metodos;

import java.util.Scanner;

public class Ejercicio1_metodos {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String texto;
        System.out.println("Introduce un texto: ");
        texto = teclado.nextLine();
        mostrarTextoMayusculas(texto);

    }

    public static void mostrarTextoMayusculas(String texto) {
        texto.toUpperCase();
        System.out.println("El texto es: " + texto);
    }
}