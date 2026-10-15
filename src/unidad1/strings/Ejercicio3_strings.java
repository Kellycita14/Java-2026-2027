package unidad1.strings;

import java.util.Scanner;

public class Ejercicio3_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String nombre, apellido1, apellido2, codigo;

        System.out.println("Introduce el nombre: ");
        nombre = teclado.nextLine();

        System.out.println("Introduce el primer apellido: ");
        apellido1 = teclado.nextLine();

        System.out.println("Introduce el segundo apellido: ");
        apellido2 = teclado.nextLine();

        codigo = nombre.substring(0, 3).toUpperCase() + apellido1.substring(0, 3).toUpperCase() + apellido2.substring(0, 3).toUpperCase();

        System.out.println(codigo);
    }
}