package fundamentos.java13.modulo3;

public class Exercicio2_3 {

	
	public static void main(String[] args) {
		

/*		
3. Come�ando em 0, imprima os n�meros seguintes, enquanto a soma dos n�meros j� 
impressos for menor que 100. 
*/
		
		int num = 0, soma = 0;
		
		while (num < 100) {
			soma += num;
			if (soma < 100) {
				System.out.println(num);
			} else {
				break;
			}
			num++;
		}
		
	}
	
}
