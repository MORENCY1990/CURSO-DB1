package conceito;

import conceito.Biscoito;

public class Pessoa { // entidade
    public String nome; //caracteristicas
    public int idade;
    private boolean bocaAberta = false;
    public boolean gostaDeBiscoito = true;

    
    
    //CONJUNTO DE CONSTRUTORES
    public Pessoa() { // construtor explicito (pode estar implicito se não houver outros construtores)
        this("indigente", -1);  //referencia (chamando outro consrutor)
    }
    public Pessoa(String nome) {
        this(nome, -1);
    }

    public Pessoa(String nome, int idade) { // construtor explicito (podeestar implicito)
        this.nome = nome;   // referenciando um atributo de classe com o THIS
        this.idade = idade;
    }
    
    
    
        // LISTA DE MÉTODOS (COMPORTAMENTO)
    public boolean comer(Biscoito biscoito) {  //comportamento
        if (gostaDeBiscoito == true) {
            System.out.println("Aceito, obrigado");
        } else {
            System.out.println("Não, muito obrigado");
        }
        return gostaDeBiscoito;
    }
    
    public boolean falar(String frase) {
        return true;
        
    }
}
