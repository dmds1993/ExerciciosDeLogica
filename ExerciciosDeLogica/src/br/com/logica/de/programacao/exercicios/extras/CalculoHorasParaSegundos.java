package br.com.logica.de.programacao.exercicios.extras;
import java.text.DecimalFormat;
import java.util.Scanner;


public class CalculoHorasParaSegundos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat ("00");
		int hora = 3600;
		int minutos = 60;
		int minutosUsuario = 0;
		int horasUsuario = 0;
		
		System.out.println ("Digite as horas ");
		horasUsuario = scanner.nextInt();
		System.out.println ("Digite os minutos");
		minutosUsuario = scanner.nextInt();
		
		int totalDeSegundosHoras = horasUsuario * hora;
		int totalDeSegundosMinutos = minutosUsuario * minutos;
		int segundosTotal = totalDeSegundosHoras + totalDeSegundosMinutos;
		
		System.out.println ("Total de segundos  é: \n"
				+"R:"+ segundosTotal);
		
		
		
	}
	
}