package arrays;

public class ExemploArrays {
    public static void main(String[] args) {
        // Array de uma dimensão (Vetor)
        int[] vetor = { 14, 17, 25 };
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        // Array de duas dimensões (Matriz)
        int[][] matriz = { { 100, 50, 70 }, { 24, -8, 35 }, { 9, 90, 999 } };
        for (int i = 0; i < matriz.length; i++) {
            for (int i2 = 0; i2 < matriz[i].length; i2++) {
                System.out.println(matriz[i][i2]);
            }
        }

        // Array 3D
        int[][][] array = { { { 0, 1 }, { 3, 6 }, { 7, 16 } }, { { 9, 18 }, { 8, 87 }, { 85, 75 } }, { { 12, 22 }, { 13, 33 }, { 44, 88 } } };
        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
            for (int i2 = 0; i2 < array[i].length; i2++) {
                System.out.println("-- " + i2);
                for (int i3 = 0; i3 < array[i][i2].length; i3++) {
                    System.out.println("---- " + array[i][i2][i3]);
                }
            }
        }
    }
}
