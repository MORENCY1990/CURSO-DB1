package exercicio14;

import java.util.Scanner;

public class Time {
	 
	public int segundos;
	public int minutos;
	public int horas;
	
	
	public void leituraConver() {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Infomre a quantidade de segundos para conversão:");
		segundos = teclado.nextInt();
	}
	
	public void minutos() {
		minutos = segundos / 60 % 60;
		
	
	}
	public void horas () {
		horas = segundos /60 /60;
	}
	
	public void segundos() {
		segundos = segundos % 60 % 60;
	}
	
	public void resul() {
		System.out.println(horas + "h"+ minutos + "min" + segundos +"seg.");
	}
}
