package br.com.logica.de.programacao.estrutura.de.decisao;
import java.util.Scanner;
/*23. Muitas pessoas acham que de quatro em quatro anos temos um ano bissexto, mas as regras
 * para determinar se um ano é bissexto ou não são: o número deve ser divisível por 4 e não
 * divisível por 100, exceto para os divisíveis por 400, que também são bissextos.Faça um 
 * programa que, utilizando as regras descritas, verifique se um ano fornecido ao computador 
 * é ou não bissexto.
 * 
 */


public class VerificarAnoBissexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ano;
		System.out
				.println("Digite um ano e será mostrado se ele é bissexto ou não");
		ano = scanner.nextInt();
		if (ano % 4 == 0) {
			System.out.println("Ano é bissexto");
		} else {
			System.out.println("O ano digitado não é bissexto");
		}

	}
}
