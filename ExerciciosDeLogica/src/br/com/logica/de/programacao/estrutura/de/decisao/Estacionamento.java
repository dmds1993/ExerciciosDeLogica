package br.com.logica.de.programacao.estrutura.de.decisao;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Estacionamento {
	
	int minutos = 60;
	String horasEntrada = ":";
	String horasSaida = ":";
	int totalDeHora;
	int umaHora = 8;
	int duasHoras = 15;
	int tresHoras = 5;
	int totalDehora, totalMinuto;
	double valor;
	public void totalApagar(){
		String[] array = horasEntrada.split(":");
		System.out.println ("HORA : " + array[0]);
		System.out.println ("MINUTO :" + array[1]);
		int horasEntrada = Integer.parseInt(array[0]);
		int minutoEntrada = Integer.parseInt(array[1]);

		String[] array2 = horasSaida.split(":");
		System.out.println ("HORA : " + array[0]);
		System.out.println ("MINUTO :" + array[1]);
		int horaSaida = Integer.parseInt(array[0]);
		int minutosSaida = Integer.parseInt(array[1]);
		
		totalDehora = horasEntrada - horaSaida;
		totalMinuto = minutoEntrada - minutosSaida;
		if(totalDehora == 1){
			valor = umaHora;
		}if (totalDeHora==2){
			valor = duasHoras;
		}if (tresHoras>3){
			valor = totalDeHora * tresHoras;
		}
	}
	
}
