package estruturaRepeticao;

public class ExemploEstruturaRepeticao {

    public static void main(String[] args) {
        // Estrutura de repetição - While
        int numero = 1;
        while (numero <= 10) { // true
            System.out.println(numero++);
        }
        System.out.println("Fim do fluxo 1");
        
        
        boolean condicao = true;
        while (condicao) {
            System.out.println(condicao);
            condicao = false;
        }
        System.out.println("Fim do fluxo 2");
        
        // Estrutura de repetição - Do While
        int numero2 = 1;
        do {
            System.out.println(numero2++);
        } while (numero2 <= 10);      
        System.out.println("Fim do fluxo 3");
        
        
        boolean condicao2 = true;
        do {
            System.out.println(condicao2);
            condicao2 = false;
        } while (condicao2);
        System.out.println("Fim do fluxo 4");
        
        // Estrutura de repetição - For
        for (double numero3 = 1; numero3 <= 10; numero3 += 0.5) {
            System.out.println(numero3);
        }
        System.out.println("Fim do fluxo 5");
    }
}
