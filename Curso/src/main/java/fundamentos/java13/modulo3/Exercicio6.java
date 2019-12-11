package fundamentos.java13.modulo3;

import br.com.softblue.commons.io.Console;

public class Exercicio6 {

	public static void main(String[] args) {

/*
Verifique a validade de uma data e mostre uma mensagem na tela dizendo se a data � v�lida ou 
inv�lida. Deve haver tr�s vari�veis para armazenar esta data: uma para o dia, outra para o m�s 
e outra para o ano. Considere que fevereiro pode ter somente 28 dias. 		
*/
		
		int dia = 1, mes = 1, ano = 1900;
		
		System.out.println("Digite o dia: ");
	    dia = Console.readInt();
	    
	    System.out.println("Digite o m�s: ");
	    mes = Console.readInt();
	    
	    System.out.println("Digite o ano: ");
	    ano = Console.readInt();
	    
	    if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1900 || ano > 2999) {
	    	System.out.println("A data � inv�lida!");
	    } else if (dia > 28 && mes == 2) {
	    	System.out.println("A data � inv�lida");
	    } else if (dia > 30 && mes == 4 || dia > 30 && mes == 6 || dia > 30 && mes == 9 || dia > 30 && mes == 11) {
	    	System.out.println("A data � inv�lida!");
	    } else {
	    	System.out.println("A data � v�lida!");
	    }
	}

}
