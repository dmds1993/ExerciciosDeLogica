package br.com.logica.de.programacao.estrutura.sequencial;

/*5. Dado um número inteiro (1461), faça um programa que calcule o valor 
 * correspondente a anos, considerando o valor de 365,25 para um ano.
 * 
 */

public class ValorPorAno {
	
	public static void main(String[] args) {
		int a = 1461;
		double b = 365.25;
		double valorCorrespondentePorAno=  a/b;
		
		System.out.println ("Valor corresponde por ano é "+"\n"+ 
		"Resultado:"+valorCorrespondentePorAno);
		
	}

}
