package br.com.logica.de.programacao.estrutura;

import java.util.Scanner;

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