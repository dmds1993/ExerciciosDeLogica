package br.com.logica.de.programacao.estrutura.de.decisao;
import java.util.Comparator;
import java.util.Scanner;

/*22. Faça um programa que receba três valores diferentes e apresente-os em ordem
 * decrescente. Observação: não deverão ser aceitos valores iguais.
 */

public class RecebeValores {
	Scanner scanner = new Scanner(System.in);

	int a = 0;
	int b = 0;
	int c = 0;

	public void mostra() {
		System.out.println("Digite o valor A.");
		a = scanner.nextInt();
		System.out.println("Digite o valor B.");
		b = scanner.nextInt();
		System.out.println("Digite o valor C.");
		c = scanner.nextInt();
		if (b==a){
			System.out.println("O valor B é igual ao valor de A, favor digitar um número diferente");
			b = scanner.nextInt();
		}if (c==a){
			System.out.println ("O valor de C é igual ao valor de A, favor digitar um número diferente");
			c = scanner.nextInt();
		}if (c==b){
			System.out.println ("O valor de C é igual ao valor de B, favor digitar um número diferente");
		}
	}
	public void imprimeEmDecrescente(){
		if (a>b&&a>c&&b>c){
			System.out.println ("Numeros"+c+","+b+","+a);
		}if (a<b&&a<c&&c<b){
			System.out.println("Números"+a+","+b+","+c);
		}if (b>a&&a<c&&b>c){
			System.out.println ("Números"+a+","+c+","+b);
		}if (c>a&&c>b&&b<a){
			System.out.println("Números"+b+","+a+","+c);
		}
	}
}
