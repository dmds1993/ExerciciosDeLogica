package br.com.logica.de.programacao.estrutura.de.decisao;

import java.util.Scanner;

public class RodizioDePlaca {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String numeroDaPlaca = "";
		System.out.println ("Digite o número da  placa");
		numeroDaPlaca = scanner.nextLine();
		String[] array = numeroDaPlaca.split("");
		int numeroDaPlacaConvertido = Integer.parseInt(numeroDaPlaca);
		int quarto = Integer.parseInt(array[3]);
		System.out.println(quarto);
		switch (quarto) {
		case 1: case 2:
			System.out.println("Rodízio na segunda-feira");
			break;
		
		case 3: case 4:
			System.out.println("Rodízio na terça-feira");
			break;
		case 5: case 6:
			System.out.println("Rodízio na quarta-feira");
			break;
		case 7: case 8:
			System.out.println("Rodízio na quinta-feira");
			break;
		case 9: case 0:
			System.out.println("Rodízio na sexta-feira");
			break;

		default:
			break;
		}
	}
	
}
