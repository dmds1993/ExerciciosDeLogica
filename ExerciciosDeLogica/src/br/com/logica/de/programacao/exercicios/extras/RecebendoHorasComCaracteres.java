package br.com.logica.de.programacao.exercicios.extras;
import java.text.DecimalFormat;
import java.util.Scanner;
public class RecebendoHorasComCaracteres {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("00");
		int hora = 3600;
		int minutos = 60;
		String horasEminutos = ":";
		
		System.out.println ("Digite as horas e o minutos, conforme o exemplo 2:00, converteremos"
				+ " as horas e minutos para segundos");
		horasEminutos = scanner.nextLine();
		
		horasEminutos = horasEminutos.replaceAll(":", ".");
		
		
		int separandoHoras;
		double convertendoParaFracionario;
		convertendoParaFracionario = Double.parseDouble(horasEminutos);
		separandoHoras = (int)convertendoParaFracionario;
		double separandoMinutos = (convertendoParaFracionario-separandoHoras) * 100;
		int convertendoParaSegundos = (int)separandoMinutos;
		
		System.out.println (convertendoParaSegundos);
	}
	

}
