package br.com.logica.de.programacao.estrutura.sequencial;

/*16. Faça um programa que receba um número inteiro referente a um valor em segundos, 
 * calcule e mostre o valor correspondente em horas, minutos e segundos.
 * Exemplo:Entrada = 18459 - Saída = 5 horas, 7 minutos e 39 segundos.  
 * 
 */

import java.util.Scanner;

public class ConvertendoSegundosParaHoras {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int segundos = 0;
		int minuto = 60;
		int umaHora = minuto * 60;
		System.out.println ("Digite os seguntos para saber as horas");
		segundos = scanner.nextInt();
	
		
		System.out.println (horasConvertidas);
	}

}
