package br.com.logica.de.programacao.exercicios.extras;
import javax.swing.JOptionPane;
public class Soma {

	public static void main(String[] args) {
		String number1, number2;
		int number3,number4,soma;
		number1 = JOptionPane.showInputDialog("Digite o primeiro valor");
		number2 = JOptionPane.showInputDialog("Digite o segundo valor");
		number3 = Integer.parseInt(number1);
		number4 = Integer.parseInt(number2);
		soma = number3 + number4;
		JOptionPane.showMessageDialog(null, "Soma = "+ soma );
		System.exit(soma);
	}
	
}
