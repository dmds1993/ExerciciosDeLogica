package br.com.logica.de.programacao.estrutura.de.decisao;

import java.util.Scanner;

public class CoordenadaDeUmPontoP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x,y;
		System.out.println("Digite o valor de X");
		x = scanner.nextInt();
		System.out.println("Digite o valor de y");
		y = scanner.nextInt();
		
		if (x>0&&y>0){
			System.out.println ("Valores são do primeiro quadrante");
		}if (x<0&&y>0){
			System.out.println("Pertence ao segundo quadrante");
		}if (x<0&&y<0){
			System.out.println ("Pertence ao terceiro quadrante");
		}if (x>0&&y<0){
			System.out.println("Pertence ao quarto quadrante");
		}if(x!=0&&y==0){
			System.out.println ("Pertence ao eixo X");
		}if (x==0&&y!=0){
			System.out.println("Pertence ao eixo y");
		}if (x==0&&y==0){
			System.out.println("Pertence a origem dos Eixos");
		}
	}
	
}
