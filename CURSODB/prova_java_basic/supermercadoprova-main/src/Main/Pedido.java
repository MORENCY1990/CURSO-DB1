package Main;

import Utils.Inputs;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Pedido {

    private static ArrayList<Item> listaDeItens = new ArrayList();
    private static double valorTotalDoPedido = 0;

    public static void calculaValorTotal() {
        double subTotal = 0;
        for (Item item : listaDeItens) {
            subTotal += item.getValorDoItem();
        }
        valorTotalDoPedido = subTotal;
    }

    public static boolean adicionaItemNaLista(Produto produto, int quantidade) {
      //CRIADO O "IF" PARA VERIFICAR SE POSSUI QUANTIDADE EM ESTOQUE E DITO "NOT" ESTOQUE.TEMOUNAO
        if (!Estoque.temEstoqueOuNao(produto, quantidade)) {
            System.out.println("Não tem quantidade o suficiente de " + produto.getNome()); 
            
            return false;
        }
        for (Item item : listaDeItens) {
            if (item.getProduto().getNome().equalsIgnoreCase(produto.getNome())) {

                Estoque.darBaixaEmEstoque(item.getProduto().getId(), quantidade);
                item.setQuantidade(item.getQuantidade() + quantidade);
                item.defineValorTotal();
                System.out.println("Foi adicionada a quantidade ao item já existente.");
                return false;
            }
        }
        listaDeItens.add(new Item(produto, quantidade));
        Estoque.darBaixaEmEstoque(produto.getId(), quantidade);
        System.out.println("Foi adicionado o produto na lista de compras.");
        return true;
    }

    public static void imprimePedido() {
        System.out.println("                              NOTA FISCAL");
        System.out.printf("ID       |NOME            |PRECO UN           |QUANTIDADE   |PRECO ITEM \n");
        for (Item item : listaDeItens) {
            System.out.printf("%-8d | %-14s | R$%-15.2f | %-10d  | R$%.2f\n", item.getProduto().getId(),
                    item.getProduto().getNome(), item.getProduto().getPreco(), item.getQuantidade(),
                    item.getValorDoItem());
        }
        imprimeValorTotal();
    }

    private static void imprimeValorTotal() {
        System.out.println();
        System.out.printf("Total: R$%.2f", valorTotalDoPedido);
        System.out.println("________________________________________________________________________");
        System.out.println();
        System.out.println();
    }

    public static void adicionaItem() {
        String nome = recebeNomeDoTeclado();
        int quantidade = recebeQuantidadeDoTeclado();
        Produto produto = Estoque.encontraProduto(nome);
        if (produto != null) {
            adicionaItemNaLista(produto, quantidade);
            calculaValorTotal();
        } else {
            System.out.println("Produto nao encontrado");
        }

    }

    public static String recebeNomeDoTeclado() {
        System.out.print("Digite o nome: ");
        return Inputs.inputString();
    }

    public static int recebeQuantidadeDoTeclado() {
        System.out.print("Digite a quantidade: ");
        return Inputs.inputInt();
    }

    public static void limparCarrinho() {
        listaDeItens.clear();
        valorTotalDoPedido = 0;
    }

    public static ArrayList<Item> getListaDeItens() {
        return listaDeItens;
    }

    public void setListaDeItens(ArrayList<Item> listaDeItens) {
        Pedido.listaDeItens = listaDeItens;
    }

    public double getValorTotalDoPedido() {
        return valorTotalDoPedido;
    }

    public void setValorTotalDoPedido(double valorTotalDoPedido) {
        Pedido.valorTotalDoPedido = valorTotalDoPedido;
    }

    
        //CRIADO O METODO "CALCULA TROCO" QUE TAMBÉM RECEBE O VALOR PAGO E DENTRO DO MESMO JA INCLUSO O CALCULO DE MENOR QUANTIDADE DE NOTAS E MOEDAS PARA O TROCO
    public static void calculaTroco() {
        Scanner ler = new Scanner(System.in);

        double conta = valorTotalDoPedido;

        System.out.println("Digite o valor a ser pago: ");
        double valorPago = ler.nextDouble();
        DecimalFormat formatador = new DecimalFormat("###,##0.00");
        
        if(valorPago < conta){ // ADICIONADO CONDIÇÃO PARA NÃO APRESENTAR O CALCULO DE NOTAS.
            System.out.println("Compra negada");
            System.out.println(" ");
        }else
        {
            int nota[] = { 100, 50, 20, 10, 5, 2, 1 };
            int centavos[] = { 50, 25, 10, 5, 1 };

            String result;
            double troco;
            int i, vlr, ct;

            troco = valorPago - conta;
            result = "\nTroco = R$" + formatador.format(troco) + "\n\n";

            
            vlr = (int) troco;
            i = 0;
            while (vlr != 0) {
                ct = vlr / nota[i]; 
                if (ct != 0) {
                    result = result + (ct + " nota(s) de R$" + nota[i] + "\n");
                    vlr = vlr % nota[i]; 
                }
                i = i + 1; 
            }

            result = result + "\n";

            
            vlr = (int) Math.round((troco - (int) troco) * 100);
            i = 0;
            while (vlr != 0) {
                ct = vlr / centavos[i]; 
                if (ct != 0) {
                     
                    result = result + (ct + " moeda(s) de " + centavos[i] +
                            " centavo(s)\n");
                    vlr = vlr % centavos[i]; 
                }
                i = i + 1; 
            } 
                System.out.println(result);
            
        }

        if (conta < valorPago) {
            double troco = valorPago - conta;
           limparCarrinho(); //ADICIONADO O LIMPARCARRINHO TODA VEZ QUE O PAGAMENTO FOR FEITO
            System.out.println(("\nPagamento realizado, sobram R$:" + formatador.format(valorPago - conta) + "\n"));

        } else {
            System.out.println("Pagamento insuficiente falta R$:" +  formatador.format(conta - valorPago) + "\n");
        }

    }
}
