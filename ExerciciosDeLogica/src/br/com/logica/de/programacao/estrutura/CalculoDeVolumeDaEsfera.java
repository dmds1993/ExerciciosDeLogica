package br.com.logica.de.programacao.estrutura;
import java.util.Scanner;

public class CalculoDeVolumeDaEsfera {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int raio = 0;
		 
		System.out.println ("Digite um numero inteiro diferente de 0");
		raio = scanner.nextInt();
		
		double volume = (4 / 3) * Math.PI * Math.pow(raio, 3);
		System.out.println (volume);
		
	}
	
}
