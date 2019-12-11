package fundamentos.java13.modulo3;

import br.com.softblue.commons.io.Console;

public class Exercicio5 {

	public static void main(String[] args) {

/*
 Escreva um programa que imprime na saída os valores assumidos por x. Esta variável x deve 
iniciar com algum valor escolhido por você. Se x for par, x deve receber o valor dele mesmo 
somado com 5. Já se x for ímpar, x deve receber o valor dele multiplicado por 2. O programa 
termina assim que x for maior que 1000. 
Por exemplo, para x = 10, a saída deve ser: 15, 30, 35, 70, 75, 150, 155, 310, 315, 630, 635, 
1270. 
Crie este programa primeiro usando a estrutura de controle if-else e depois usando a 
estrutura de controle switch.		
 */
		
		int x, y, resto;
		
		System.out.println("Digite um número: ");
		x = Console.readInt();
		
		for (int i = x, cont = 0; x < 1000; cont++ ) {
			if (x % 2 == 0) {
				x += 5;
				System.out.print(x + " ");
			} else {
				x *= 2;
				System.out.print(x + " ");
			}
		}
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Digite um número: ");
		y = Console.readInt();	
		
		
		for (int i = y, cont = 0; y < 1000; cont++) {
			resto = y % 2;
			
			switch (resto) {
			case 0:
				y += 5;
				System.out.print(y + " ");
				break;
			default:
				y *= 2;
				System.out.print(y + " ");
				break;
			}
		}

	}

}
