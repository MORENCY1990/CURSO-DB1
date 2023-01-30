package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int usuario;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecione uma opção:");
        System.out.println("");
        System.out.println("1) SOMA, 2)SUBTRAÇÃO, 3)MULTIPLICAÇÃO e 4) DIVISÃO");
        
        usuario = teclado.nextInt();
        System.out.println("");
        
        switch(usuario) {
        case 1:
            System.out.println("Informe o 1º numero:");
            double n1 = teclado.nextInt();
           
           System.out.println("Informe o 2º numero:");
           double n2 = teclado.nextInt();
           
           double result = n1+n2;
           System.out.println("O resultado da soma é: " + result);
           break;
        case 2:
            System.out.println("Informe o 1º numero:");
            double n3 = teclado.nextInt();
           
           System.out.println("Informe o 2º numero:");
           double n4 = teclado.nextInt();
           
           double result1 = n3-n4;
           System.out.println("O resultado da SUBTRAÇÃO é: " + result1);
           break;
        case 3:
            System.out.println("Informe o 1º numero:");
            double n5 = teclado.nextInt();
           
           System.out.println("Informe o 2º numero:");
           double n6 = teclado.nextInt();
           
           double result2 = n5*n6;
           System.out.println("O resultado da soma é: " + result2);
           break;
        case 4:
            System.out.println("Informe o 1º numero:");
            double n7 = teclado.nextInt();
           
           System.out.println("Informe o 2º numero:");
           double n8 = teclado.nextInt();
           
           double result3 = n7 / n8;
           System.out.println("O resultado da soma é: " + result3);
           break;
           default:
               System.out.println("Opção inválida!");
           
        }
        

    }

}
