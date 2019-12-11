package fundamentos.java13.modulo3;

import java.text.DecimalFormat;

import br.com.softblue.commons.io.Console;

public class Exercicio7 {

	public static void main(String[] args) {

/*
 Crie uma aplica��o que possibilita a entrada via console de um conjunto de notas de um aluno. 
Assim que -1 for informado como nota, calcule a m�dia das notas informadas anteriormente e 
mostre na tela. Caso a nota do aluno seja inv�lida, mostre uma mensagem na tela solicitando 
uma nova nota. 
A entrada via console deve ser feita utilizando a classe Console, fornecida junto com os 
c�digos-fonte deste exerc�cio. Copie o arquivo Console.java para dentro do seu projeto e voc� 
poder� utiliz�-la. 
Para ler uma nota do teclado, utilize o seguinte c�digo: 
double nota = Console.readDouble(); 
Ap�s a digita��o da nota seguida de ENTER, o valor digitado ser� armazenado na vari�vel nota. 		
*/
		
		double nota = 0.0, media = 0.0, somaNotas = 0.0;
		int cont = 1;
		
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		while (true) {
			System.out.println("Digite a " + cont + " � nota: ");
			nota = Console.readDouble();
			if (nota == -1) {
				break;
			} else if (nota < 0 || nota > 10) {
				System.out.println("Nota inv�lida! Digite a nota corretamente para prosseguir!");
				nota = 0.0;
				continue;
			} else if (nota >= 0 && nota <= 10) {
				somaNotas += nota;
			} 
			
			cont++;
		}
		
		media = somaNotas / (cont - 1);
		
		System.out.println("A m�dia � = " + df.format(media));	

		
	}

}
