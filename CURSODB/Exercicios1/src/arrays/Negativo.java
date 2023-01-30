package arrays;
import java.util.Scanner;
public class Negativo {

    public static void main(String[] args) {
        int numero;
        System.out.println("Informe um numero");
        Scanner teclado = new Scanner(System.in);
        
        numero = teclado.nextInt();
        System.out.println("O numero digitado foi: " + numero);
        
        if(numero < 0) {
            System.out.println("Numero eh negativo");
        }else {
            System.out.println("O numero eh positivo");
        }
            
    }

}


