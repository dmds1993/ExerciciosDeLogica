package br.com.logica.de.programacao.estrutura.de.decisao;
import java.util.Scanner;

public class ExecutaEstacionamento {

	public static void main(String[] args) {
		Estacionamento estacionamento = new Estacionamento();
		Scanner scanner = new Scanner(System.in);
		System.out.println ("Digite a hora de entrada");
		estacionamento.horaEntrada = scanner.nextLine();
		System.out.println ("Digite a hora de saida");
		estacionamento.horaSaida = scanner.nextLine();
	}
}
