package br.com.logica.de.programacao.estrutura.de.decisao;

import java.util.Scanner;

public class CalculoDeProduto {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int codigo,a,b,total;
		System.out.println ("Digite o valor de A");
		a = scanner.nextInt();
		System.out.println ("Digite o valor de B");
		b = scanner.nextInt();
		System.out.println("Digite um código");
		codigo = scanner.nextInt();
		switch (codigo) {
		case 1:
			total = (a-b)*(a-b);
			System.out.println ("Valor é:"+total);
			break;
		case 2:
			total = (a+b)*(a+b);
			System.out.println ("Valor é:"+total);
			break;
		case 3:
			total = (a*a)*(b*b);
			System.out.println ("Valor é:"+total);
			break;
		case 4:
			total = (a*a)*(b*b);
			System.out.println ("Valor é:"+total);
			break;
		case 5:
			total = (a-b)*(a+b);
			System.out.println ("Valor é:"+total);
			break;

		default:
			System.out.println ("Código inválido");
			break;
		}
		
	}

}
