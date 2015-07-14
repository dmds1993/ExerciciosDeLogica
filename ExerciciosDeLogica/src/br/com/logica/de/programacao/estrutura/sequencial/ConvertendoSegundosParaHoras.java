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
		double minutos = 60;
		double horas = 3600;
		System.out.println ("Digite os seguntos para saber as horas");
		segundos = scanner.nextInt();
	
		double horasConvertidas = (segundos / horas);
		int inteiroHoras;
		double restoHoras, multiplicandoPraTerOsMinutos, restoSegundos;
		inteiroHoras = (int) (horasConvertidas); 
		//Aqui é pego apenas as horas.
		
		restoHoras = horasConvertidas - inteiroHoras;
		multiplicandoPraTerOsMinutos = restoHoras * 60; 
		//Aqui é convertido o resto para minutos.
		
		int inteiroDosMinutos;
		inteiroDosMinutos = (int) (multiplicandoPraTerOsMinutos);
		//Aqui é retirado o resto da divisão para ter apenas os minutos.
		
		int inteiroSegundos;
		inteiroSegundos = (int) (multiplicandoPraTerOsMinutos);
		restoSegundos = multiplicandoPraTerOsMinutos - inteiroSegundos;
		//Aqui é retirado o resto da divisão dos minutos
		double convertendoSegundos;
		convertendoSegundos = restoSegundos * 60;
		//Aqui se converte para segundos
		int segundosConvertidos;
		segundosConvertidos = (int) (convertendoSegundos);
		//Aqui é retirado os resto da divisão mantendo apenas os segundos.
		
		System.out.println (inteiroHoras+"h"+":"+inteiroDosMinutos+"m:"+segundosConvertidos+"s");
		// Aqui foi formatado para a impressão de 00h: 00m: 00s:
		
		
	}

}
