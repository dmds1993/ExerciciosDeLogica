package br.com.logica.de.programacao.estrutura.sequencial;

/*7. Sabendo que o raio de uma circunferência é igual a 3, faça um programa
 * para calcular e exibir o comprimento dessa circunferência e a área do círculo 
 * com base nas seguintes definições: 
 * C = 2ttr  
 * A = ttr²
 * 
 * Observação o tt represente o símbolo de PI.
 */ 

public class CalculoDeComprimento {
	
	public static void main(String[] args) {
		int r = 3; 
		double comprimento = 2* Math.PI * r;
		double area = Math.PI * Math.pow(r, 2);
		
		System.out.println ("O valor do comprimento é:" + comprimento);
		System.out.println("O valor da área é:"+ area);
		
	}

}
