package br.com.logica.de.programacao.estrutura.sequencial;
import java.util.Scanner;

/*13. Para calcular a velocidade (V em m/s) de um automóvel em movimento
 * uniformemente variado (M.U.V), foi fornecida a velocidade inicial (Vo = 10m/s)
 * e a aceleração (a = 3 m/s) do mesmo. Faça um programa que receba um valor em segundos, calcule
 * e imprima a velocidade do automóvel. A fórmula para a resolução do problema é:
 * V = Vo + at
 * çl
 */

public class VelocidadeMedia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double velocidadeInicial = 10;
		double aceleracao = 3;
		double tempo = 0;
		
		
		System.out.println("Tempo em segundos");
		tempo = scanner.nextDouble(); 
		double velocidade = velocidadeInicial + aceleracao * tempo; 
		
		System.out.println ("Sua velocidade:  " + velocidade + "m/s");
	}
}
