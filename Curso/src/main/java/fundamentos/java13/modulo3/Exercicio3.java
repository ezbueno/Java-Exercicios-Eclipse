package fundamentos.java13.modulo3;

import br.com.softblue.commons.io.Console;

public class Exercicio3 {

	public static void main(String[] args) {
		
/*
O c�lculo do fatorial de um n�mero (!) segue a seguinte regra: 
0!= 1;
1! = 0! x 1;
2! = 1! x 2;
...
n! = (n - 1)! x n;

Escreva uma aplica��o que efetua o c�lculo do fatorial utilizando a forma iterativa (usando 
estruturas de repeti��o). 
*/
		int n, fat = 1;
		
		
		System.out.println("==============================");
		System.out.println("|F O R M A  I T E R A T I V A|");
		System.out.println("==============================");
		
		System.out.println("Digite um n�mero: ");
		n = Console.readInt();
		
		for (int i = n; i > 0; i--) {
			fat *= i;
			if (fat == 0) {
				fat = 1;
			}
		}
		
		System.out.println(n + "!= " + fat);
		System.out.println();

/*
E outra que efetua o mesmo c�lculo, mas de forma recursiva (o 
m�todo de c�lculo do fatorial chama ele mesmo). 
Para maiores informa��es sobre o fatorial, consulte: http://pt.wikipedia.org/wiki/Factorial. 
 */
	
		int num, fatorial = 1, calcula;
				
		System.out.println("==============================");
		System.out.println("|F O R M A  R E C U R S I V A|");
		System.out.println("==============================");		
		
		System.out.println("Digite um n�mero: ");
		num = Console.readInt();
		calcula = calcularFatorial(num);
		
		System.out.println(num + "!= " + calcula);
		
		
	}
	
	public static int calcularFatorial(int f) {
		if (f == 0) {
			f = 1;
			return 1;
		}
		
		return f * calcularFatorial (f - 1);
	
	}

}
