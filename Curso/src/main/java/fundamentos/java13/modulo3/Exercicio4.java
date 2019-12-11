package fundamentos.java13.modulo3;

public class Exercicio4 {

	public static void main(String[] args) {

		
/*
Imprima os 15 primeiros números da série de Fibonacci. A série de Fibonacci é tem os 
seguintes elementos: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro e segundo 
elementos valem 1, e daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado 
ao (n-2)-ésimo elemento (ex: 8 = 5 + 3). 
Para mais informações, consulte: http://pt.wikipedia.org/wiki/Número_de_Fibonacci. 		
 */

		
//		int n1 = -1, n2 = 1, n3;
//		
//		System.out.println("Impressão dos 15 primeiros números da série de Fibonacci");
//		System.out.println();
//		
//		for (int i = 0; i < 15; i++) {
//			n3 = n1 + n2;
//			System.out.print(n3 + " ");
//			n1 = n2;
//			n2 = n3;
//		}
		
		int x, y, cont = 0;
		
		System.out.println("Impressão dos 15 primeiros números da série de Fibonacci");
		
		for (x = 0, y = 1; cont < 15; cont++) {
			System.out.print(x + " ");
			x = x + y;
			y = x - y;
		}
		
		
	}

}
