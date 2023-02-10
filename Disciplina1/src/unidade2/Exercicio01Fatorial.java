/*
 * Escrever uma classe Java para calcular o fatorial de um dado número N.
 * */
package unidade2;

import java.util.Scanner;

public class Exercicio01Fatorial {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int numero = scn.nextInt();
		int fatorial = 1;
		
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		} 
		
		System.out.printf("Fatorial de %d = %d",numero, fatorial);
		
		scn.close();

	}

}
