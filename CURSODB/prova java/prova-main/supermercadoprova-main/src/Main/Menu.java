package Main;

import Utils.Inputs;

public class Menu {

    public static void controleMenu(){
        
        Estoque.inicializaEstoque();
        do{
            mostraMenu();
        }while(switchCase());
    }
        //FOI INCLUSO O METODO DE CALCULAR TROCO NO MENU
    //INCLUSO TAMBÉM O METODO DE LIMPAR CARRINHO
    public static void mostraMenu(){
        System.out.println("------------MENU------------");
        System.out.println("1 - MOSTRAR CATALOGO");
        System.out.println("2 - ADICIONAR ITEM AO CARRINHO");
        System.out.println("3 - VER PEDIDO");
        System.out.println("4 - CALCULAR TROCO");
        System.out.println("5 - LIMPAR CARRINHO");

        System.out.println("0 - ENCERRAR");
    }

    public static boolean switchCase(){
        System.out.println("ESCOLHA UMA OPÇÃO: ");

        switch (Inputs.inputInt()){
            case 1:
                Estoque.imprimeCatalagoDoEstoque();
                return true;
            case 2:
                Pedido.adicionaItem();
                return true;
            case 3:
                Pedido.imprimePedido();
                return true;
            case 4:
                Pedido.calculaTroco();
                return true;
            case 5:
                Pedido.limparCarrinho();
                return true;
            case 0:
                System.out.println("OPERAÇÃO ENCERRADA"); //INSERIDO PARA COMUNICAR QUE A OPERAÇÃO FOI ENCERRADA
                return false;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
                return true;
        }
    }


}
