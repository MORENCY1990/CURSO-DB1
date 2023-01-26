package aleatorios;

import java.util.Random;
import java.util.Scanner;

public class ExercicioAleatorios {

    public static void main(String[] args) {
        double aleatorio1 = Math.random();
        System.out.println(aleatorio1);
        double temporario1 = aleatorio1 * 10;
        System.out.println(temporario1);
        long resultado1 = Math.round(temporario1);
        System.out.println(resultado1);
        
        Random sorteador = new Random();
        int aleatorio2 = sorteador.nextInt(10);
        System.out.println(aleatorio2);
    }
}
