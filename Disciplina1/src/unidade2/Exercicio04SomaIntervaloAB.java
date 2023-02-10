/*
 * Dados dois números inteiros A e B, escreva uma classe Java
para calcular a soma de todos os inteiros existentes entre A e B.
 * */
package unidade2;

import java.util.Scanner;

public class Exercicio04SomaIntervaloAB {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Informe o valor de A: ");
		int numA = scn.nextInt();
		System.out.print("Informe o valor de B: ");
		int numB = scn.nextInt();

		if (numA > numB) {
			System.out.println("A não pode ser maior que B");
			main(null);
		} else {

			int result=0;

			for (int i = (numA +1) ; i < numB; i++) {
				result +=i;
			}

			System.out.printf("Soma do intervalo entre %d e %d = %d",numA,numB,result);

			scn.close();
		}

	}

}
