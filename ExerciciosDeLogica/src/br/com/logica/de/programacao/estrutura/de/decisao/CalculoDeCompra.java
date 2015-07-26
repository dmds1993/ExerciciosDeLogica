package br.com.logica.de.programacao.estrutura.de.decisao;

import java.util.Scanner;

public class CalculoDeCompra {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int quantidade,valor,desconto;
		int valorPorPeca=100;
		System.out.println ("Digite a quantidade de compra");
		quantidade = scanner.nextInt();
		
		if (quantidade<=1000) {
			valor = quantidade * 100;
			System.out.println("Valor total R$" + valor);
		}
		if (quantidade==1001 && quantidade<=5000){
			valor = quantidade * 90;
			desconto = valorPorPeca * quantidade - valor;
			System.out.println("O valor total da compra R$"+valor + "\n"
					+ "Valor de desconto R$"+desconto);
		}if (quantidade==5001&&quantidade<10000){
			valor = quantidade * 82;
			desconto = valorPorPeca * quantidade - valor;
			System.out.println("O valor total da compra R$"+valor + "\n"
					+ "Valor de desconto R$"+desconto);
			}if (quantidade==10001 && quantidade<=50000){
				valor = quantidade * 75;
				desconto = valorPorPeca * quantidade - valor;
				System.out.println("O valor total da compra R$"+valor + "\n"
						+ "Valor de desconto R$"+desconto);
			}if (quantidade>50001){
				valor = quantidade * 70;
				desconto = valorPorPeca * quantidade - valor;
				System.out.println("O valor total R$"+valor + "\n"
						+ "Valor de desconto R$"+desconto);
	}
	}
}
