package unidad1.metodos;

public class Ejercicio5_metodos {
    static void main() {
        mostrarMayor(14, 12);
    }

    public static void mostrarMayor(int x, int y){
        if (x > y){
            System.out.println("El mayor es: " + x);
        }else if(y > x){
            System.out.println("El mayor es: " + y);
        }else {
            System.out.println("Los dos números son iguales.");
            System.out.println("Números: " + "(" + x + "," + y + ")");
        }
    }
}