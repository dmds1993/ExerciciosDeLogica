package br.com.logica.programacao.data.retroativa;
<<<<<<< HEAD

import java.sql.Date;
||||||| merged common ancestors

=======
>>>>>>> 016822fbc5ab7675467b820c6fb10516963a1fe0
import java.util.Scanner;

public class Data {

	public static void main(String[] args) {
		SeparaData separaData = new SeparaData();		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a data e será impresso a data anterior");
		separaData.data = scanner.nextLine();
		separaData.dataParaInteiro();
		
		
				

	}

}
