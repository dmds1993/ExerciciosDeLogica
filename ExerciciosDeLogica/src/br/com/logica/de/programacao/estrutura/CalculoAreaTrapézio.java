package br.com.logica.de.programacao.estrutura;
import java.util.Scanner;

public class CalculoAreaTrapézio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double baseMaior, baseMenor,alturaTrapézio;
		baseMaior = 0;
		baseMenor = 0;
		alturaTrapézio = 0;
		
		System.out.println ("Digite a base maior");
		baseMaior = scanner.nextDouble();
		System.out.println ("Digite a base menor");
		baseMenor = scanner.nextDouble();
		System.out.println("Digite a altura");
		alturaTrapézio = scanner.nextDouble();
		
		double area = (baseMaior + baseMenor) / (2) * alturaTrapézio;
		
		System.out.println ("O valor da área é:"+area);
		
	}
}
