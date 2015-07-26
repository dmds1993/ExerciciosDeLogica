package br.com.logica.de.programacao.estrutura.de.decisao;

import java.util.Scanner;

public class CompraDeProduto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double quantidade, valor, desconto, valorTotal = 0;
		System.out.println("Digite a quantidade desejada da compra");
		quantidade = scanner.nextInt();
			
		if (quantidade==1 && quantidade <10) {
			valor = quantidade * 75;
			System.out.println("Valor total R$" + valor);
		}
		if (quantidade==11 &&quantidade<=40) {
			valor = quantidade * 75;
			desconto = valor* 10 / 100;
			valorTotal = valor - desconto;
			System.out.println("O valor original R$" +valor+ "\n"
					+ "Valor de desconto R$" +desconto+ "\n" + "Valor total R$"
					+ valorTotal);
		}if (quantidade==41 && quantidade<=100){
			valor = quantidade * 75;
			desconto = valor * 15 / 100;
			valorTotal = valor - desconto;
			System.out.println("O valor original R$"+valor + "\n"
					+ "Valor de desconto R$"+desconto + "\n" + "Valor total R$"
					+ valorTotal);
		}if (quantidade>=101){
			valor = quantidade * 75;
			desconto = valor * 25 / 100;
			valorTotal = valor - desconto;
			System.out.println("O valor original R$"+valor + "\n"
					+ "Valor de desconto R$"+desconto + "\n" + "Valor total R$"
					+ valorTotal);
			}
	}
}

