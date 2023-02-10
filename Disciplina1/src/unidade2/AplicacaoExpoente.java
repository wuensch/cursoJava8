/*Escreva um programa para gerar a seguinte série abaixo
 * para os 50 primeiros termos
 * 
 * E(x) = (x¹/1) + (x²/2) + (x³/3) + ...
 * 
 * */

package unidade2;

import java.util.Scanner;

public class AplicacaoExpoente {

	public static void main(String[] args) {
		
		double e = 0;
		double x;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe o valor de X: ");
		x = scn.nextDouble();
		
		for (int i = 1; i <= 50; i++) {
			e += Math.pow(x, i);
		}
		
		System.out.printf("O valor de e(x)= %.2f",e);
		scn.close();
	}

}
