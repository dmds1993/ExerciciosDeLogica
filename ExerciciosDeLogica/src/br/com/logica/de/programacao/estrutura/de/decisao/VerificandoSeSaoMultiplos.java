package br.com.logica.de.programacao.estrutura.de.decisao;
import java.util.Scanner;

/*20. Faça um programa que receba dois numeros inteiros quaisquer e verifique
 * se o primeiro é múltiplo do segundo.
 */


public class VerificandoSeSaoMultiplos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		System.out.println ("Digite o primeiro número");
		numero1 = scanner.nextInt();
		System.out.println ("Digite o segundo número");
		numero2 = scanner.nextInt();
		
		if (numero1%numero2==0){
			System.out.println ("Os números digitados são múltilplos");
		}else{
			System.out.println ("Os números digitados não são múltiplos");
		}
		
	}
	
}
