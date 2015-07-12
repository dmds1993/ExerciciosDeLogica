package br.com.logica.de.programacao.estrutura.sequencial;

import java.util.Scanner;

/*12. Faça um programa que leia a idade de uma pessoa em ano, calcule e  mostre a idade correspondente ao
 * total de dias vividos por essa pessoa, considerando que todos os meses são de 30 dias.
 */

public class PassarIdadeParaDias {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int idade = 0;

		System.out.println("Digite a sua idade");
		idade = scanner.nextInt();
		double diasVividos = (idade * 12) * 30;

		System.out.println("Total de dias vividos é:" + diasVividos);

	}

}
