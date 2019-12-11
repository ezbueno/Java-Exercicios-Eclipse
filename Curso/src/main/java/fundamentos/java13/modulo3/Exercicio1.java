package fundamentos.java13.modulo3;

public class Exercicio1 {

	public static void main(String[] args) {
		
/*
Um aluno tirou notas 8.5, 7.5 e 6.0 em provas que tinham peso 3, 2 e 5, respectivamente. 
Escreva um programa que imprima a média do aluno.
*/
		
		double n1 = 8.5;
		double n2 = 7.5;
		double n3 = 6.0;
		
		double peso1 = 3;
		double peso2 = 2;
		double peso3 = 5;
		
		double parcial1 = n1 * 3;
		double parcial2 = n1 * 2;
		double parcial3 = n1 * 5;
		
		double media = (parcial1 + parcial2 + parcial3) / (peso1 + peso2 + peso3);
		
		System.out.println("A média do aluno é = " + media);

	}

}
