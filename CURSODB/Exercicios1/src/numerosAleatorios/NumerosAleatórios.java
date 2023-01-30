package numerosAleatorios;

import java.util.Random;

public class NumerosAleatórios {
    public static void main(String[] args) {

    int quantiaAGerar = 10;

    Random gerador = new Random();
    int[] numerosGerados = new int[quantiaAGerar];{
    
    
    
    for(int iteracao = 0;iteracao<quantiaAGerar;iteracao++)
    {
        numerosGerados[iteracao] = gerador.nextInt(100);
        System.out.print(numerosGerados[iteracao] + "\t");
    }

    int menor = numerosGerados[0];
    int maior = numerosGerados[0];for(
    int indice = 0;indice<numerosGerados.length;indice++)
    {
        if (numerosGerados[indice] > maior)
            maior = numerosGerados[indice];
        if (numerosGerados[indice] < menor)
            menor = numerosGerados[indice];
    }
    System.out.println("Maior: "+maior);System.out.println("Menor: "+menor);
    }
    }
}



