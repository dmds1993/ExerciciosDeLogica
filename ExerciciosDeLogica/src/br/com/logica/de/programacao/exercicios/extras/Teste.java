package br.com.logica.de.programacao.exercicios.extras;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.Bidi;

public class Teste {
	
	


	public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("0.1");
        BigDecimal bigDecimal2 = new BigDecimal("0.2");
        BigDecimal bigResultado = new BigDecimal("0.3");
        System.out.println(bigDecimal.add(bigDecimal2));
         
        if (bigDecimal.add(bigDecimal2).compareTo(bigResultado)==0){
        	System.out.println ("Igual");
        }else{
        	System.out.println ("Diferente");
        }
        
    }
	
}