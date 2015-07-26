package br.com.logica.de.programacao.estrutura.de.decisao;

import java.util.Scanner;

public class ValorDeX {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double y,f,x,g,h = 0;
		
		System.out.println("Digite o valor de X");
		x = scanner.nextDouble();
	
		double hx = Math.pow(x, 2)-16;
		if (hx>=0){
			f = h;
			System.out.println("valor de f="+f);
		}else{
			f = 1;
			System.out.println ("valor de f="+f);
		}if (f == 0){
			g = Math.pow(x, 2)+16;
		}else{
			g=0;
			System.out.println ("valor de g="+g);
		}
		y = f + g;
		System.out.println("Resultado de y="+y);
	}

}
