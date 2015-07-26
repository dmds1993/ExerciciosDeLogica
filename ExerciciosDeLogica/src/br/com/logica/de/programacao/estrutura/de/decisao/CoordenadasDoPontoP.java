package br.com.logica.de.programacao.estrutura.de.decisao;

import java.util.Scanner;

public class CoordenadasDoPontoP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x,y;
		System.out.println ("Digite o valor de X");
		x =scanner.nextInt();
		System.out.println ("Digite o valor de Y");
		y=scanner.nextInt();
		if (x>0&&y<0){
			System.out.println ("Primeiro quadrante");
		}else{
			System.out.println ("Quarto quadrante");
		}
		if (y>0){
			System.out.println ("Segundo quadrante");
		}else{
			System.out.println("Terceiro quadrante");
		}
	}
	
}
