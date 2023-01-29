package exercicio15;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Numeros n1 = new Numeros();
		Numeros n2 = new Numeros();
		
		int opcao;

		System.out.println("Digite o 1º numero:");

		n1.setNumero(teclado.nextFloat());

		System.out.println("Digite o 2º numero:");

		n2.setNumero(teclado.nextFloat());

		System.out.println("Selecione uma opção!");
		System.out.println("1) SOMA, 2) SUBTRAÇÃO, 3) MULTIPLICAÇÃO, 4)DIVISÃO e 5) POTENCIAÇÃO");
		opcao = teclado.nextInt();
		teclado.close();
		switch (opcao) {
		case 1:
			System.out.println("Resultado da SOMA É: " + somar(n1.getNumero(), n2.getNumero()));
			break;
		case 2:
			System.out.println("Resultado da SUBTRAÇÃO É: " + subtrair(n1.getNumero(), n2.getNumero()));
			break;
		case 3:
			System.out.println("Resultado da MULTIPLICAÇÃO É: " + multi(n1.getNumero(), n2.getNumero()));
			break;
		case 4:
			System.out.println("Resultado da DIVISÃO É: " + dividir(n1.getNumero(), n2.getNumero()));
			break;
		case 5:
			System.out.println("Resultado da POTENCIAÇÃO É: " + potencia(n1.getNumero(), n2.getNumero()));
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
