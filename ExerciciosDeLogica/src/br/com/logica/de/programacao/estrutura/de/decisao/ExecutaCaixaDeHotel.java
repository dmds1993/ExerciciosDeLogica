package br.com.logica.de.programacao.estrutura.de.decisao;
import java.util.Scanner;


public class ExecutaCaixaDeHotel {
	
	public static void main(String[] args) {
		CaixaDeHotel caixaDeHotel = new CaixaDeHotel();
		Scanner scanner = new Scanner(System.in);
		System.out.println ("Digite a quantidade de dias");
		caixaDeHotel.dias = scanner.nextInt();
		caixaDeHotel.calculoDeDias();
		
		
	}

}
