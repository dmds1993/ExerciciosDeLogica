package br.com.logica.de.programacao.estrutura.sequencial;

/*6. Faça um programa que calcule e exiba na tela a soma e o produto de dois numeros reais,
 * a saber: 91,37 e 7,351
 */

public class SomaEmultiplicacao {
	
	
	public static void main(String[] args) {
		double a = 91.37;
		double b = 7.351;
		double soma = a + b;
		double multiplicacao = a * b;
		
		System.out.println ("Soma dos valores a:"+a+"e b:"+b+"\n"
		+"Resultado:"+soma);
		
		System.out.println ("A multiplicação dos valores a:"+a+ " b:"+b+"\n"+
		"Resultado:" + multiplicacao);
	}

}
