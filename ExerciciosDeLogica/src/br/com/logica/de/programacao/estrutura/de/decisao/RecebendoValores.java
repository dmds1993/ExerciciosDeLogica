package br.com.logica.de.programacao.estrutura.de.decisao;
import java.util.Scanner;

/*22. Faça um programa que receba três valores diferentes e apresente-os em ordem
 * decrescente. Observação: não deverão ser aceitos valores iguais.
 */

public class RecebendoValores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		a =0; b =0; c=0;
		System.out.println ("Digite o valor A.");
		a = scanner.nextInt();
		System.out.println ("Digite o valor B.");
		b = scanner.nextInt();
		System.out.println ("Digite o valor B.");
		c = scanner.nextInt();
		int operacao = 0;
		switch (operacao) {
		case 1:
			b = a;
			System.out.println ("O valor de B é igual a A, favor inserir o valor de B novamente");
			b = scanner.nextInt();
			break;
			
		case 2:
			c = a;
			System.out.println("O valor de C é igual ao valor de A, favor inserir o valor de C novamente:");
			c = scanner.nextInt();
			break;
		case 3:
			c = b;
			System.out.println("O valor de C é igual ao valor de B, favor inserir o valor de C novamente");
			c = scanner.nextInt();
			break;
			
		default:
			
		}
		int operacao2 = 0;
		switch (operacao2) {
		case 1:
			
			break;

		default:
			break;
		}
		
	}
	
}
