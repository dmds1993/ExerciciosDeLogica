package br.com.logica.de.programacao.estrutura.sequencial;

/*6. Faça um programa que execute e apresente na tela o resultada das seguintes operações:
 * (345 + 879) e ("345 + 879").
 * 
 */

public class SomaEImpressao {

	public static void main(String[] args) {
		int a = 345;
		int b = 879;
		String c = "345 + 879";
		
		int soma = a+b;
		
		System.out.println ("A soma dos valores a:"+a+" + b"+b+"\n"+
		"Resultado:"+soma);
		
		System.out.println ("A soma dos valores c:\n"+
		"Resultado: "+c);
		
		
	}
	
}
