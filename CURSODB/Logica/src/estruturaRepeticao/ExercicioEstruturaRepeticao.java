package estruturaRepeticao;

import java.util.Scanner;

public class ExercicioEstruturaRepeticao {

    public static void main(String[] args) {
        /* 
         * Altere o exerc�cio 7 para o algoritmo contar a s�rie Fibonacci at�
         * um determinado n�mero. Por exemplo, caso declarado o n�mero
         * 25, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21 
         */
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um n�mero desejado: ");
        int num = input.nextInt();
        
        int n1 = 0;
        int n2 = 1;
        
        System.out.print(n1 + " " + n2 + " ");
        while (true) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (n3 > num) {
                return;
            }
            System.out.print(n3 + " ");
        }
    }
}
