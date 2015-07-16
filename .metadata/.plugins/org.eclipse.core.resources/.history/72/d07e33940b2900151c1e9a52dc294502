package br.com.logica.de.programacao.estrutura.de.decisao;
import java.util.Scanner;

/*21. Faça um programa que leia três variáveis do tipo inteiro (a,b,c), correspondentes 
 * aos lados de um triângulo, calcule e imprima a classificação do triângulo quanto ao
 * ângulos, conforme instruções abaixo.
 * O lado a deve ser o maior dos três lados
 * Se a²=b²+c² é um triângulo retângulo
 * Se a²>b²+c² é um triângulo obtusângulo
 * Se a²<b²+c² é um triângulo acutângulo
 */

public class ClassificacaoTriangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		double a = 0; 
		double b = 0; 
		double c = 0;
		
		System.out.println ("Digite o valor de A");
		a = scanner.nextDouble();
		System.out.println ("Digite o valor de B");
		b = scanner.nextDouble();
		System.out.println ("Digite o valor de C");
		c = scanner.nextDouble();
		a = Math.pow(a, 2); b = Math.pow(b, 2); Math.pow(c, 2);
			
		double calculoRetangulo = b + c;
		
		if (a==calculoRetangulo){
			System.out.println("Classificação através dos calculos é triângulo retângulo,"+"\n"
		+ "Pois o valor de A é igual: "+ calculoRetangulo);
		}if (a>calculoRetangulo){
			System.out.println("Classificação através dos calculos é triângulo obtusângulo"+"\n"
			+	"Pois o valor de A é maior que: "+calculoRetangulo);
		}if (a<calculoRetangulo){
			System.out.println ("Classificação através dos calculos é triângulo acutângulo"+"\n"
			+	"Pois o valor de A é menos que: "+calculoRetangulo);
		}
	
	}
}
