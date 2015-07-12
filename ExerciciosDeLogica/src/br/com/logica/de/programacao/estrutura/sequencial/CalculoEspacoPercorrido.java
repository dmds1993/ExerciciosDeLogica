package br.com.logica.de.programacao.estrutura.sequencial;
import java.text.DecimalFormat;
import java.util.Scanner;

/*14. Faça um programa que receba como dados de entrada os valores da posição inicial (So),
 * da velocidade inicial (Vo) e da aceleração (a) de um automóvel em M.U.V após 60 segundos
 * da partida e calcule a sua posição. Ao final, apresente o resultado na tela. Para a solução
 * do problema utilize a seguinte fórmula.
 * 
 * S = So + Vot + a/2t²
 */


public class CalculoEspacoPercorrido {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.00");
		double posicaoInicial = 0;
		double velocidadeInicial = 0;
		double aceleracao = 0;
		double tempo = 60;
		
		System.out.println ("Digite a sua posicão inicial");
		posicaoInicial = scanner.nextDouble();
		System.out.println ("Digite a sua velocidade inicial");
		velocidadeInicial = scanner.nextDouble();
		System.out.println ("Digite a sua aceleração");
		aceleracao = scanner.nextDouble();
		
		double posicaoFinal = posicaoInicial + velocidadeInicial * tempo + (aceleracao/2) * Math.pow(tempo, 2);
		String posicaoFinalFormatada = fmt.format(posicaoFinal);
		System.out.println ("Sua posição final é: "+ posicaoFinalFormatada+"Km/h");
		
	}
	
}
