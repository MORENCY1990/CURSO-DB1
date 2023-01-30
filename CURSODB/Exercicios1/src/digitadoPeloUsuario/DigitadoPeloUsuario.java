package digitadoPeloUsuario;
import java.util.Scanner;
public class DigitadoPeloUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número1");
        while(scanner.nextInt() !=10) {
            System.out.println("Esperando 10");
        }

    }

}
