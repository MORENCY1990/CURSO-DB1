package tabuada;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        
        System.out.println("Digite um numero para realizar a tabuada.");
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        numero = teclado.nextInt();
        
        for(int i = 1; i<=10; i++) {
            int resul = numero * i;
            System.out.println("Tabuaba do: " + numero);        
            System.out.println(numero + " X " + i + " igual a: " + resul);
            
            
        }
        
        
        
        teclado.close();
    }
}
