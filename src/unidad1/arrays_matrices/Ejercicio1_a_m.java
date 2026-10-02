package unidad1.arrays_matrices;

public class Ejercicio1_a_m {
    static void main() {
        int [][] matriz = new int[3][6];

        matriz[0][0] = 0;
        matriz[0][1] = 30;
        matriz[0][2] = 2;
        matriz[0][5] = 5;
        matriz[1][0] = 75;
        matriz[1][4] = 0;
        matriz[2][2] = -2;
        matriz[2][3] = 9;
        matriz[2][5] = 11;


        System.out.print("\t");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print("\tColumna " + i + "\t|");
        }
        System.out.println();
        System.out.println(".....................................................................................................");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Fila " + i + "\t|\t");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t\t|\t\t");
            }
            System.out.println();
        }

    }
}