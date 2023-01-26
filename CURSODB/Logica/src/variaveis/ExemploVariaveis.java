package variaveis;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExemploVariaveis {
    public static void main(String[] args) {
        // Grupo dos inteiros
        long pequeno = 5;
        System.out.println(pequeno);
        int medio = 4000;
        System.out.println(medio);
        long grande = 1000000;
        System.out.println(grande);
        
        // Grupo dos reais
        float fpequeno = (float)5.5;
        System.out.println(fpequeno);
        double dmedio = 4000.50002;
        System.out.println(dmedio);
        BigDecimal dgrande = new BigDecimal("1000000.100000555555");
        System.out.println(dgrande);
        
        // Lógico
        boolean bool = true;
        bool = false;
        System.out.println(bool);
        
        // Grupo dos textos
        char letra = 'Y';
        System.out.println(letra);
        String frase = "Olá mundo";
        System.out.println(frase);
        
        // Grupos das datas
        LocalDate data = LocalDate.now();
        System.out.println(data);
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);
    }
}
