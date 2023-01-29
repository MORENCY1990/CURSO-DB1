package exercicio15;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Numeros n1 = new Numeros();
		Numeros n2 = new Numeros();
		
		int opcao;

		System.out.println("Digite o 1� numero:");

		n1.setNumero(teclado.nextFloat());

		System.out.println("Digite o 2� numero:");

		n2.setNumero(teclado.nextFloat());

		System.out.println("Selecione uma op��o!");
		System.out.println("1) SOMA, 2) SUBTRA��O, 3) MULTIPLICA��O, 4)DIVIS�O e 5) POTENCIA��O");
		opcao = teclado.nextInt();
		teclado.close();
		switch (opcao) {
		case 1:
			System.out.println("Resultado da SOMA �: " + somar(n1.getNumero(), n2.getNumero()));
			break;
		case 2:
			System.out.println("Resultado da SUBTRA��O �: " + subtrair(n1.getNumero(), n2.getNumero()));
			break;
		case 3:
			System.out.println("Resultado da MULTIPLICA��O �: " + multi(n1.getNumero(), n2.getNumero()));
			break;
		case 4:
			System.out.println("Resultado da DIVIS�O �: " + dividir(n1.getNumero(), n2.getNumero()));
			break;
		case 5:
			System.out.println("Resultado da POTENCIA��O �: " + potencia(n1.getNumero(), n2.getNumero()));
			break;
		default:

		}

	}

	public static double somar(float n1, float n2) {
		return (n1 + n2);

	}

	public static double subtrair(float n1, float n2) {
		return (n1 - n2);
	}

	public static double multi(float n1, float n2) {
		return (n1 * n2);
	}

	public static double dividir(float n1, float n2) {
		if (n2 == 0) {

			System.out.println("IMPOSSIVEL DIVIDIR POR ZERO!");
			System.exit(0);
		}
		return (n1 / n2);
	}

	public static double potencia(float n1, float n2) {
		float a;
		a = (float) Math.pow(n1, n2);
		return a;
	}
	
}
