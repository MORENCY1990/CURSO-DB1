package exercicio13;
import java.util.Scanner;
public class Aluno {
	
	public String nome;
	public double n1, n2, n3, n4, n5, media;
	public String status;
	
	
	public void notas() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do aluno:");
		String nome = teclado.next();
		System.out.println("Digite a 1� nota");
		n1 = teclado.nextDouble();
		System.out.println("Digite a 2� nota");
		n2 = teclado.nextDouble();
		System.out.println("Digite a 3� nota");
		n3 = teclado.nextDouble();
		System.out.println("Digite a 4� nota");
		n4 = teclado.nextDouble();
		System.out.println("Digite a 5� nota");
		n5 = teclado.nextDouble();
		
				
		media = (n1+n2+n3+n4+n5) /5;
		System.out.println("Sua m�dia �: " + media);
		System.out.println("");
	
	}
	
	public void status() {
		if(media > 6) {
			System.out.println("Aluno aprovado!");
		}else if(media > 4 && media <=6) {
			System.out.println("Aluno precisa de verifica��o Suplementar");
		}else {
			System.out.println("Aluno reprovado");
		}
		
	}
	
	
}
