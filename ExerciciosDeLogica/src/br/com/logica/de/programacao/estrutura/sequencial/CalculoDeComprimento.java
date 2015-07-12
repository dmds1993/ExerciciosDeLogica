package br.com.logica.de.programacao.estrutura;

public class CalculoDeComprimento {
	
	public static void main(String[] args) {
		int r = 3; 
		double comprimento = 2* Math.PI * r;
		double area = Math.PI * Math.pow(r, 2);
		
		System.out.println ("O valor do comprimento é:" + comprimento);
		System.out.println("O valor da área é:"+ area);
		
	}

}
