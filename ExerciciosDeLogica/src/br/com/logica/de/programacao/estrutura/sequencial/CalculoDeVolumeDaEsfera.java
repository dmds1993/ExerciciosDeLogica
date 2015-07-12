package br.com.logica.de.programacao.estrutura.sequencial;
import java.util.Scanner;

/*8. Elaborar um programa que solicite ao usuário um inteiro (raio de uma esfera) e exiba o volume
 * dessa esfera com base na seguinte definição:
 * V = 4/3 * ttr³
 * 
 * Observação o tt representa o símbolo de PI.
 */

public class CalculoDeVolumeDaEsfera {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int raio = 0;
		 
		System.out.println ("Digite um numero inteiro diferente de 0");
		raio = scanner.nextInt();
		
		double volume = (4 / 3) * Math.PI * Math.pow(raio, 3);
		System.out.println (volume);
		
	}
	
}
