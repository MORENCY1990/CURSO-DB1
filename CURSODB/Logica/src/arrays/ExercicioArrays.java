package arrays;

public class ExercicioArrays {
    public static void main(String[] args) {
        /* 
         * Leia uma matriz quadrada e determine a soma da diagonal principal.
        */

        //                      0                   1                 2                 3
        int[][] array = { { 4, 6, 9, 16 }, { 34, 56, 67, 78 }, { 3, 5, 2, 7 }, { 88, 96, 67, 56 } };
        //                  0  1  2   3       0  1  2  3         0  1  2  3      0   1   2   3
        
        
        int soma = 0;
        int colunaAtual = 0;
        
        for (int i = 0; i < array.length; i++) {
            int[] colunas = array[i];
            soma += colunas[colunaAtual];
            colunaAtual++;
        }
        
        System.out.println(soma);
        
        /*
         * Ordene um vetor de 100 números inteiros gerados
         * aleatoriamente. (Pesquisar sobre Bubble Sort)
         * */
        
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int)Math.round(Math.random() * 100);
        }
        for (int i = 0; i < array2.length; i++)
            System.out.print(array2[i] + " ");
        System.out.println();

        // Bubble sort
        for (int i = 0; i < array2.length; i++) {
            for (int i2 = i; i2 < array2.length; i2++) {
                if (array2[i] > array2[i2]) {
                    int aux = array2[i];
                    array2[i] = array2[i2];
                    array2[i2] = aux;
                }
            }
        }
        
        for (int i = 0; i < array2.length; i++) 
            System.out.print(array2[i] + " ");
        System.out.println();
    }
}
