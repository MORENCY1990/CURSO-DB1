package contaBanco;

public class Cliente {

	public static void main(String[] args) {
		Banco p1 = new Banco();
        p1.setNumConta(1);
        p1.setDono("Cafeasperina");
        p1.abrirConta("CC");
        
        
        /*Banco p2 = new Banco();
        p2.setNumConta(2);
        p2.setDono("Maria Creuza");
        p2.abrirConta("CP");*/
        
       p1.depositar(400);
       // p2.depositar(500);
        
     // p2.sacar(200);
        
       p1.sacar(500);
       // p1.fecharConta();
        
         p1.estadoAtual();
      // p2.estadoAtual();
    }

}
