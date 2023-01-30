package arrays;

public class Arrays {

    public static void main(String[] args) {
        int [][] array = {{4, 6, 9, 16}, {34, 56, 67, 78}, {3, 5, 2, 7}, {88,96,67,56}};
        int soma = 0;
        int colunaAtual = 0;
        
        for(int i = 0; i< array.length;i++) {
            //for(int i2 = 0; i2 < array[i].length;i2++) {
            int [] colunas = array[i];
            soma += colunas[colunaAtual];
            
            colunaAtual++;
                
            }
        System.out.println(soma);
        }
    
    }


