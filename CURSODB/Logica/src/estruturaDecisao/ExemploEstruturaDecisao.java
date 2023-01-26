package estruturaDecisao;

public class ExemploEstruturaDecisao {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 10;
        if (numero1 > numero2) {
            System.out.println(numero1 + " É MAIOR DO QUE " + numero2);
        } else if (numero1 == numero2) {
            System.out.println(numero1 + " É IGUAL A " + numero2);
        } else {
            System.out.println(numero1 + " É MENOR DO QUE " + numero2);
        }

        String nome = "Paulo"; // ==
        switch (nome) {
            case "João":
                System.out.println("João");
                break;
            case "Maria":
                System.out.println("Maria");
                break;
            case "Renato":
                System.out.println("Renato");
                break;
            case "José":
                System.out.println("José");
                break;
            default:
                System.out.println("Nome não encontrado");
                break;
        }
    }
}
