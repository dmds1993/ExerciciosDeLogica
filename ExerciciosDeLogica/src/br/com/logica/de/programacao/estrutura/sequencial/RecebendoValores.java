package br.com.logica.de.programacao.estrutura.sequencial;
import java.util.Scanner;

/*8. Elaborar um programa que solicite ao usuário dois inteiros e os exiba em ordem inversa à entrada.
 * 
 */

public class RecebendoValores {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a,b;
	
		System.out.println ("Digite um valor inteiro");
		a = scanner.nextInt();
		System.out.println ("Digite um segundo valor inteiro");
		b= scanner.nextInt();
		
		System.out.println ("O segundo valor digitado:"+b+"\n"
				+ "O primeiro valor digitado:"+a);
		
		
	}

}
