package br.com.logica.de.programacao.estrutura.sequencial;

/*3. Faça um programa que calcule e exiba na tela a média de quato números inteiros,
 * a saber : 35, 42, 87, 11.
 * 
 */

public class MediaNumerosInteiros {

	public static void main(String[] args) {
		int a,b,c,d;
		double media;
		a = 35;	
		b = 42;
		c = 87;
		d = 11;
		media = (a + b + c + d) / 4;
		
		System.out.println ("A média dos numeros:"+a+","+b+","+c+","
		+d+","+"é igual a:\n" + media);
		
		
		
	}
}
