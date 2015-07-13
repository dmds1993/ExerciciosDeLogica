package br.com.logica.de.programacao.estrutura.de.decisao;

import java.util.Scanner;


/*18. Faça um programa que receba uma constante armazenado a um dado caracter que 
 * representa uma senha de acesso a um sistema. O programa deverá ler um dado caractere
 * correspondente a uma senha e compará-la com o valor da constante. Se a senha estiver correta
 * imprimir "Acesso liberado", caso contrário, "Acesso negado".
 */

public class ConfirmacaoDeAcesso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String senha = "daniel";
		String recebendoSenha = "";
		System.out.println ("Digite a senha");
		recebendoSenha = scanner.nextLine();
		
		if (recebendoSenha.equals(senha)){
			System.out.println("Acesso liberado");
		}else{
			System.out.println ("Acesso negado");
		}
		
	}
}
