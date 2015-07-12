package br.com.logica.de.programacao.estrutura.sequencial;

import java.util.Scanner;

/*11. Faça um programa uqe tenha como entrada de dados duas notas de um aluno, calcule e apresente a média 
 * ponderada, sabendo que a primeira nota tem peso 2.5 e a segunda nota tem peso 4.5
 * 
 */

public class MediaPonderada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double nota1 = 0;
		double nota2 = 0;

		System.out.println("Digite a primeira nota");
		nota1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota");
		nota2 = scanner.nextDouble();

		double notaPeso1 = (nota1 * 2.5) / 10;
		double notaPeso2 = (nota2 * 4.5) / 10;
		double mediaDoAluno = (notaPeso1 + notaPeso2);

		System.out.println(mediaDoAluno);

	}

}
