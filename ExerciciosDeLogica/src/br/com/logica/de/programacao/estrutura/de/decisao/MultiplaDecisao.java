package br.com.logica.de.programacao.estrutura.de.decisao;
import java.util.Scanner;

public class MultiplaDecisao {
	Scanner scanner = new Scanner(System.in);
	int x,y,z,w;
	public void recebeValor(){
		System.out.println ("Digite o valor de x");
		x = scanner.nextInt();
		System.out.println ("Digite o valor de y");
		y = scanner.nextInt();
		System.out.println("Digite o valor de z");
		z = scanner.nextInt();
		System.out.println("Digite o valor de w");
		w = scanner.nextInt();
		if ((w<y)&&(x>z)&&(y+x>z-w)&&(y>3)&&(x<20)&&(z%2)==0&&(x>0)){
			System.out.println("Números válidos");
		}else{
			System.out.println ("Números inválidos");
		}
	}
	 
}
