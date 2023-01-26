package estruturaDecisao;

import java.util.Scanner;

public class ExercicioEstruturaDecisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite o preço do produto");
        double precoProduto = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a quantidade do produto");
        int quantidadeProduto = scanner.nextInt();

        double valorTotal = precoProduto * quantidadeProduto;
       
        String mensagem = "Nome do produto: " + nomeProduto + "\nTotal: ";
        if (quantidadeProduto <= 10) {
            System.out.println("<= 10");
            System.out.println(mensagem + valorTotal);
        } else if (quantidadeProduto <= 20) {
            System.out.println("<= 20");
            System.out.println(mensagem + (valorTotal * 0.9));
        } else if (quantidadeProduto <= 50) {
            System.out.println("<= 50");
            System.out.println(mensagem + (valorTotal * 0.8));
        } else {
            System.out.println("> 50");
            System.out.println(mensagem + (valorTotal * 0.75));
        }
    }
}
