package unidad1.bucles;

import java.util.Scanner;

public class Ejercicio15_bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia1, dia2, hora1, hora2, horas;
        System.out.println("Introduce la primera hora...");
        System.out.print("Día (1-7): ");
        dia1 = teclado.nextInt();
        System.out.print("Hora (0-23): ");
        hora1 = teclado.nextInt();

        System.out.println("Introduce la segunda hora...");
        System.out.print("Día (1-7): ");
        dia2 = teclado.nextInt();
        System.out.print("Hora (0-23): ");
        hora2 = teclado.nextInt();

        if (dia1 < 1 || dia1 > 7 || dia2 < 1 || dia2 > 7 || hora1 < 0 || hora1 > 23 || hora2 < 0 || hora2 > 23){
            System.out.println("Valores incorrectos.");
        }else if (dia2 < dia1 || dia2 == dia1 && hora2 <= hora1){
            System.out.println("La segunda hora debe ser posterior.");
        }else {
            horas = (dia2 - dia1) * 24 + hora2 - hora1;
            System.out.println("Horas transcurridas = " + horas);
        }
    }
}