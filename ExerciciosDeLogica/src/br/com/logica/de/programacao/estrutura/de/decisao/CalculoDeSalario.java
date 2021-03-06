package br.com.logica.de.programacao.estrutura.de.decisao;
import java.util.Scanner;

import br.com.logica.de.programacao.estrutura.sequencial.ValorPorAno;

/*19.  Fa um programa que receba um inteiro correspondente às horas trabalhadas por um 
 * determinado funcionario, calcule e mostre na tela o seu salário. Para realizar os 
 * cálculos necessários, sabe-se que o funcionário ganha R$35,00 por hora. Sua carga
 * horária semanal é de 44 horas, as horas excedentes são consideradas horas extras
 * e devem sofrer um acréscimo de 40% por hora.
 */

public class CalculoDeSalario {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int horas = 0;
		
		System.out.println ("Digite quantas horas você realizou esta semana.");
		horas = scanner.nextInt();
		
		int valorṔorHora = 35;
		int horasSemanal = 44;
		int horasExtras = horasSemanal - horas;
		double salario = horas * valorṔorHora;
		double valorHorasExtras;
		double valorSalarioComHorasExtras;
		
			if (horas>44){
				valorHorasExtras = valorṔorHora * 40 / 100 + valorṔorHora;
				System.out.println("O valor de horas extras: R$"+valorHorasExtras);
				valorSalarioComHorasExtras = valorHorasExtras + salario;
				System.out.println ("Seu salario com as horas extras: R$"+valorSalarioComHorasExtras);
			}else{
				System.out.println ("Seu salário é: R$"+salario);
			}
	}

}
