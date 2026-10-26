package unidad1.metodos;

public class Ejercicio6_metodos {
    static void main() {
        mostrarDNI(44498047, 'h');
    }

    public static void mostrarDNI(int parteNumerica, char letra) {
        char mayuscula = Character.toUpperCase(letra);
        System.out.println("DNI: " + parteNumerica + "-" + mayuscula);
    }
}