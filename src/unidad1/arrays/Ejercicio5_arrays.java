package unidad1.arrays;

import java.util.Scanner;

public class Ejercicio5_arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int dias = 0;

        System.out.println("Introduce un número del 1 al 7: ");
        dias = teclado.nextInt();

        if (dias >= 1 && dias <= 7) {
            System.out.println("El día es " + diasSemana[dias - 1] + ".");
        } else {
            System.out.println("El número introducido es incorrecto.");
        }
    }
}