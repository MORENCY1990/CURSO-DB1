package estruturaDecisao;

public class ExemploEstruturaDecisao {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 10;
        if (numero1 > numero2) {
            System.out.println(numero1 + " � MAIOR DO QUE " + numero2);
        } else if (numero1 == numero2) {
            System.out.println(numero1 + " � IGUAL A " + numero2);
        } else {
            System.out.println(numero1 + " � MENOR DO QUE " + numero2);
        }

        String nome = "Paulo"; // ==
        switch (nome) {
            case "Jo�o":
                System.out.println("Jo�o");
                break;
            case "Maria":
                System.out.println("Maria");
                break;
            case "Renato":
                System.out.println("Renato");
                break;
            case "Jos�":
                System.out.println("Jos�");
                break;
            default:
                System.out.println("Nome n�o encontrado");
                break;
        }
    }
}
