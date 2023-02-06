package interfaces;

public class RH implements Funcionario, Pessoa {
    // Cumprindo com o contrato de Pessoa (porque Funcionario tem Pessoa "emendado")
    @Override
    public void cumprimentar() {
        System.out.println(this.getClass().getSimpleName() + " diz: Bommmm diaaaaaa!");
    }
    
    // Cumprindo com o contrato de Funcionario
    @Override
    public void cumprirCargaHoraria() {
        System.out.println(this.getClass().getSimpleName() + " não cumpriu muito bem sua carga horária, pois ela é mais flexível");
    }
    // Cumprindo com o contrato de Funcionario
    @Override
    public void calcularSalario() {
        System.out.println(this.getClass().getSimpleName() + " recebe 50% fixo e 50% variável por pessoas captadas");
    }
}
