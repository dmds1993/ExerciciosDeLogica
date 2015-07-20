package br.com.logica.programacao.data.retroativa;
import java.util.Scanner;

public class Data {

	public static void main(String[] args) {
		SeparaData separaData = new SeparaData();		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a data");
		separaData.data = scanner.nextLine();
		separaData.dataParaInteiro();
		
		
		
				

	}

}
