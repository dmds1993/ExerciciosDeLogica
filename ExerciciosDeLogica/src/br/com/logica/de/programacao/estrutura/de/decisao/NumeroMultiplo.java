package br.com.logica.de.programacao.estrutura.de.decisao;

/*17. Faça um programa que receba um numero inteiro qualquer
 * e verifique se é multiplo de 10.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class NumeroMultiplo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("00"); 
		int multiplo = 10;
		int numeroUsuario = 0;
		
		System.out.println ("Digite um numero para saber se o mesmo é multiplo de 10");
		numeroUsuario = scanner.nextInt();
		
		if (numeroUsuario%multiplo==0){
			System.out.println("Número inserido é multiplo por 10");
		}else{
			System.out.println ("Número inserido não é multiplo de 10");
		}
		
	}
}
