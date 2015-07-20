package br.com.logica.de.programacao.exercicios.extras;

import java.text.DecimalFormat;
import java.util.Scanner;
public class RecebendoHorasComCaracteres {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int hora = 3600;
		int minutos = 60;
		String horasEminutos = ":";
		DecimalFormat df = new DecimalFormat("00.00");
		
		System.out.println ("Digite as horas e o minutos, conforme o exemplo 2:00, converteremos"
				+ " as horas e minutos para segundos");
		horasEminutos = scanner.nextLine();
		
		//horasEminutos = horasEminutos.replaceAll(":", ".");
		
		String[] array = horasEminutos.split(":");
		
		System.out.println ("HORA : " + array[0]);
		System.out.println ("MINUTO :" + array[1]);
		System.out.println ("Segundo :" + array[2]);
		int separandoHoras;
		double convertendoParaFracionario;
		convertendoParaFracionario = Double.parseDouble(horasEminutos);
		
		separandoHoras = (int)convertendoParaFracionario;
		double separandoMinutos = (convertendoParaFracionario-separandoHoras)*100;
		int formatandoMinutos = (int)Math.rint(separandoMinutos);
		
		int segundosEmHoras = separandoHoras * hora;
		int segundosEmMinutos = formatandoMinutos * minutos;
		int segundosTotal = segundosEmHoras + segundosEmMinutos;
	
		System.out.println ("O total de segundos é:"+segundosTotal);
		System.out.println (separandoMinutos);
		System.out.println (formatandoMinutos);
		
	}
	

}
