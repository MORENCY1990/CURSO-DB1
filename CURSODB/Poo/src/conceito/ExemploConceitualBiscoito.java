package conceito;

import conceito.Biscoito;
import conceito.Pessoa;

public class ExemploConceitualBiscoito {

    public static void main(String[] args) {
        Pessoa morency = new Pessoa("Morency", 32);
        System.out.println(morency.nome + " tem " + morency.idade + " anos");
        System.out.println("");
        Pessoa renato = new Pessoa("Renato", 55);  //instanciando uma nova pessoa passando 2 parametros ao construtor
        System.out.println(renato.nome + " tem " + renato.idade + " anos");
       Biscoito negresco = new Biscoito();
       Biscoito trakinas = new Biscoito();
       
      boolean comeu = renato.comer(negresco);
      
      System.out.println("Comeu?" + (comeu ? " Sim" : " Não"));
    }

}
