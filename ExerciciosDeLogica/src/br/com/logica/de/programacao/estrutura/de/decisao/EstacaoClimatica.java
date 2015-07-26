package br.com.logica.de.programacao.estrutura.de.decisao;

import java.util.Scanner;

public class EstacaoClimatica {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mes;

		System.out
				.println("Digite o mês, e será impresso e qual estação ele se encontra do  ano");
		mes = scanner.nextLine();
		mes = mes.toLowerCase();

		if (mes.equals("setembro") | mes.equals("outubro")
				| mes.equals("novembro")) {
			System.out.println("Primavera");
		}
		if (mes.equals("dezembro") | mes.equals("janeiro")
				| mes.equals("fevereiro")) {
			System.out.println("Verão");
		}
		if (mes.equals("marco") | mes.equals("abril") | mes.equals("maio")) {
			System.out.println("Outono");
		}
		if (mes.equals("junho") | mes.equals("julho") | mes.equals("agosto")) {
			System.out.println("Inverno");
		}

	}

}
