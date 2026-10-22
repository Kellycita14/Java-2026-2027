package unidad1.strings;

import java.util.Scanner;

public class Ejercicio13_strings {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String nombre, apellido1, apellido2, nombre_completo;

        System.out.println("Introduce el nombre: ");
        nombre = teclado.nextLine().trim();

        System.out.println("Introduce el primer apellido: ");
        apellido1 = teclado.nextLine().trim();

        System.out.println("Introduce el segundo apellido: ");
        apellido2 = teclado.nextLine().trim();

        nombre = Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1).toLowerCase();
        apellido1 = Character.toUpperCase(apellido1.charAt(0)) + apellido1.substring(1).toLowerCase();
        apellido2 = Character.toUpperCase(apellido2.charAt(0)) + apellido2.substring(1).toLowerCase();


        nombre_completo = nombre + " " + apellido1 + " " + apellido2;

        System.out.println("Nombre completo: " + nombre_completo);
    }
}