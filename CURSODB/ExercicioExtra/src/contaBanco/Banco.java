package contaBanco;

import java.util.Scanner;
public class Banco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private float chequeEspecial;

   
   
    
   
    public void estadoAtual(){
        System.out.println("-------------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Cheque Especial: " + this.getChequeEspecial());
        System.out.println("Status: " + this.getStatus());
    }
    
    
    public void abrirConta(String t){
       this.setTipo(t);
       this.setStatus(true);
        if (t=="CC") {
            this.setSaldo(50);
            this.setChequeEspecial(500);
            System.out.println("Bonificação de R$50,00 pela abertura de Conta Corrente.");
            
        } else if(t=="CP"){
            this.setSaldo(150);
            System.out.println("Bonificação de R$150,00 pela abertura de Conta Poupança.");
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo()>0) {
            System.out.println("Retire o saldo!");
            
        } else if(this.getSaldo()<0){
            System.out.println("Conta com débitos, favor regularizar antes de encerra sua conta");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Conta inesistente!");
        }
        
    }
    
    public void sacar(float v){
        if (this.getStatus()) {
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
            } else if (this.tipo == "CC"){
            
                System.out.println("Saque não autorizado");
                System.out.println("Deseja usar o chegue especial?");
                System.out.println("Digite uma opção: 1) SIM e 2) NÃO");
                Scanner tecaldo = new Scanner(System.in);
                int opcao = tecaldo.nextInt();
                switch(opcao){
                    case 1:
                        System.out.println("Tentaremos sacar do seu cheque especial.");
                        if(this.getChequeEspecial() < v){
                            System.out.println("Saldo insuficiente");
                            
                        }else{
                            this.setChequeEspecial((this.getChequeEspecial() -v));
                        }
                        System.out.println("Saque efetuado com sucesso.");
                        break;
                    case 2:
                        System.out.println("Encerrando operação.");
                        break;
                        
                }
                if(this.tipo == "CP"){
            this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
                     
            }
        } else{ 
                System.out.println("Impossível sacar"); 
        }
              
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
            
        } else if(this.getTipo()=="CP") {
            v=20;
        } if(this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga");
        }else{
            System.out.println("Impossível pagar uma conta fechada!");
        }
        
    }
    
    
    
    public Banco(){
       this.setSaldo(0);
       this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
        if(tipo == "CC"){
            this.saldo = saldo;
        }else {
            this.saldo = saldo;
        }
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
     public float getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
   

}
