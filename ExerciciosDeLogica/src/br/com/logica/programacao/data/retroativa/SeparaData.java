package br.com.logica.programacao.data.retroativa;

import java.util.Scanner;

public class SeparaData {
	String data = "00/00/00";
	int diaAnterior, mesAnterior, anoAnterior, opcao;

	public void dataParaInteiro() {
		String[] array = data.split("/");
		int dia = Integer.parseInt(array[0]);
		int mes = Integer.parseInt(array[1]);
		int ano = Integer.parseInt(array[2]);
		if (mes == 2 && ano % 4 == 0 && ano%400== 0&& dia<=29) {
			diaAnterior = dia - 1;
			System.out.println("O dia anterior é " + diaAnterior + "/" + mes
					+ "/" + ano + "\n" + "Este é um ano bissexto");
			if (diaAnterior==0){			
			}
		}if (dia==1&&mes==03&&ano%4!=0){
			diaAnterior = 28;
			mesAnterior = 02;
			System.out.println("O dia anterior é " + diaAnterior + "/" + mesAnterior
					+ "/" + ano );
		}
		if (dia == 1 && mes == 1) {
			diaAnterior = 31;
			mesAnterior = 12;
			anoAnterior = ano - 1;
			System.out.println("Dia anterior é " + diaAnterior + "/"
					+ mesAnterior + "/" + anoAnterior);
		}
		if (mes == 1 || mes == 3 | mes == 5 | mes == 7 | mes == 8 | mes == 10
				| mes == 12) {
			if (dia > 31){
				System.out.println("Favor digitar uma data válida");
			}
			diaAnterior = dia - 1;
			if (diaAnterior==0){
			}else{
			System.out.println("O dia anterior é " + diaAnterior + "/" + mes
					+ "/" + ano);
			}
		}
		if (mes == 4 | mes == 6 | mes == 9 | mes == 11) {
			if (dia == 1) {
				diaAnterior = 31;
				mesAnterior = mes - 1;
				System.out.println("O dia anterior é " + diaAnterior + "/"
						+ mesAnterior + "/" + ano);
			}
			
		}if (mes==2&&dia==1){
			diaAnterior = 31;
			mesAnterior = mes - 1;
			System.out.println("O dia anterior é " + diaAnterior + "/"
					+ mesAnterior + "/" + ano);
		}
		if (mes == 3 | mes == 5 | mes == 7 | mes == 8 | mes == 10
				| mes == 12) {
			if (dia == 1&&mes==3&&ano%4==0) {
				diaAnterior = 29;
				mesAnterior = mes - 1;
				System.out.println("O dia anterior é " + diaAnterior + "/" + mesAnterior
						+ "/" + ano + "\n" + "Este é um ano bissexto");
					if (dia==1&&mes!=3){
						diaAnterior = 30;
						mesAnterior = mes - 1;
						System.out.println("O dia anterior é " + diaAnterior + "/"
								+ mesAnterior + "/" + ano);
					}
				
			}
			
		}
	}
}
