import java.util.Scanner;

public class Jokenpo {
    public static void main(String[] args) {
        int jogador;
        int computador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("HORA DO JOGO!!!!");
        System.out.println("");
        System.out.println("OPÇÕES");
        System.out.println("1) PEDRA, 2) PAPEL e 3) TESOURA");
        System.out.println("Digite a opção desejada");

        jogador = teclado.nextInt();
        System.out.println("");
        switch (jogador) {
            case 1:
                System.out.println("A escolha foi: PEDRA");
                break;
            case 2:
                System.out.println("A escolha foi: PAPEL");
                break;
            case 3:
                System.out.println("A escolha foi: TESOURA");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        computador = (int) (Math.random() * 3 + 1);
        teclado.close();
        switch (computador) {
            case 1:
                System.out.println("A escolha do computador foi: PEDRA");
                break;
            case 2:
                System.out.println("A escolha do computador foi: PAPEL");
                break;
            case 3:
                System.out.println("A escolha do computador foi: TESOURA");
                break;
        }
        System.out.println("");
        if (jogador == computador) {
            System.out.println("EMPATE");
        } else {
            if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
                    || (jogador == 3 && computador == 2)) {
                System.out.println("JOGADOR VENCEU!!!");
            } else {
                System.out.println("COMPUTADOR VENCEU!");
            }
        }
    }
}
