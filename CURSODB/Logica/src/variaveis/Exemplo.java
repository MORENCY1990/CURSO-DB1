package variaveis;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exemplo {
    public static void main(String[] args) {
        // Grupo dos inteiros
        short pequeno = 5;
        System.out.println(pequeno);

        int medio = 4000;
        System.out.println(medio);

        long grande = 10000000;
        System.out.println(grande);
        
        //Grupo dos REAIS
        
        float fpequeno = 5.5f;
        System.out.println(fpequeno);
        
        double dmedio = 4000.5002;
        System.out.println(dmedio);
        
       BigDecimal dgrande = new BigDecimal("100000000000.100000555555555555");
       System.out.println(dgrande);
       
       //LOGICO
       
       boolean bool = true;
       bool = false;
       System.out.println(bool);
       
       //GRUPO DOS TEXTOS
       
       char letra = 'y';
       System.out.println(letra);
       
       String frase = "Olá mundo!!!!";
       System.out.println(frase);
       
       // DATA
       
       LocalDate data = LocalDate.now();
       System.out.println(data);
       
       LocalDateTime dataHora = LocalDateTime.now();
       System.out.println(dataHora);
        
        
    }
}
