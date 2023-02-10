/*Escreva uma classe Java para calcular a soma de uma séria
harmônica (n).

* 1+ 1/2 + 1/3 ... + 1/n
*
*/
package unidade2;

import java.util.Scanner;

public class Exercicio02SerieHarmonica {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe um número para calcular a série harmônica: ");
		int num = scn.nextInt();
		double result = 1;
		
		for (int i = 1; i <= num; i++) {
			result = result + (double) 1/i;			
		}

		System.out.println("Resultado do cálculo: "+result);
		scn.close();
	}
}