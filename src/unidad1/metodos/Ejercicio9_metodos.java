package unidad1.metodos;

public class Ejercicio9_metodos {
    static void main() {
        String dni = formarDni(44498047, 'h');
        System.out.println("DNI: " + dni);
    }

    public static String formarDni(int parteNumerica, char letra){
        int numero = parteNumerica;
        char letra_dni = Character.toUpperCase(letra);
        String dni_completo = numero + "-" + letra_dni;
        return dni_completo;
    }
}