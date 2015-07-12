package br.com.logica.de.programacao.estrutura.sequencial;
import java.text.DecimalFormat;
import java.util.Scanner;

/*15. Uma indústria de automóveis quer premiar um de seus funciónarios no final do ano com um carro 0km. 
 * Cada empregado teve direito a um bilhete com um número de seis dígitos. O vencedor será aquele que tiver
 * o bilhete cujo número é a combinação dos dois primeiros prêmios do último concurso do ano da Loteria Federal.
 * A composição do número do bilhete premiado é formada pelos dois últimos dígitos do segunto prêmio.
 * Por exemplo, o número do primeiro prêmio: 18.959 número do segundo prêmio: 04.133, o bilhete ganhador é o
 * de número 1947 (59*33).Faça um programa que receba os valores da Loteria Federal, gere e mostre o número
 * premiado.
 */

public class NumeroPremiado {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("00");
		double primeiroSorteiodoisUltimosDigitos = 0 ; 
		double segundoSorteioDoisUltimosDigitos = 0 ;
		
		System.out.println ("Digite os dois ultimos digitos do 1° sorteio da Loteria Federal");
		primeiroSorteiodoisUltimosDigitos = scanner.nextDouble();
		
		System.out.println ("Digite os dois ultimos digitos do 2° sorteio da Loteria Federal");
		segundoSorteioDoisUltimosDigitos = scanner.nextDouble();
		
		double bilheteSorteado = primeiroSorteiodoisUltimosDigitos * segundoSorteioDoisUltimosDigitos;
		String BilheteSorteadoFormatado = format.format(bilheteSorteado);
		
		System.out.println ("O Bilhete premiado é o de valor " + BilheteSorteadoFormatado);
		
		
	}
	

}
