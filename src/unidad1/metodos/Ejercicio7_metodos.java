package unidad1.metodos;

import java.util.Scanner;

public class Ejercicio7_metodos {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String texto;
        System.out.println("Introduce un texto: ");
        texto = teclado.nextLine();
        String resultado = convertirPrimeraLetraMayuscula(texto);
        System.out.println("Resultado: " + resultado);
    }

    public static String convertirPrimeraLetraMayuscula(String texto){
        String resultado = "", letra;
        for (int i = 0; i < texto.length(); i++) {
            letra = String.valueOf(texto.charAt(i));
            if (i == 0){
                resultado += letra.toUpperCase();
            }else {
                resultado += letra.toLowerCase();
            }
        }
        return resultado;
    }
}