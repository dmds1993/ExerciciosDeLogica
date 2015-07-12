package br.com.logica.de.programacao.estrutura.sequencial;

/*1. Faça um programa que escreve na primeira linha da tela seu nome completo, segunda linha seu endereço,
 * na terceira linha o cep e o bairro em que vc mora.
 * 
 */

public class NomeEendereco {

	public static void main(String[] args) {
		String nomeCompleto = "Daniel D M S";
		String endereco = "Avenida Morumbi";
		String cep = "05864-370";
		String bairro = "Jardim Maria Virginia";
		
		
		System.out.println ("Nome completo: "+nomeCompleto+"\nEndereço:"+
		endereco+"\ncep: "+cep+"\nBairro: "+bairro);
	}
}
