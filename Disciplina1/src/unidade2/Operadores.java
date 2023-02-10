package unidade2;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		//Lê os valores
		System.out.println("Digite o 1 valor: ");
		int numero1 = scn.nextInt();
		System.out.println("Digite o 2 valor: ");
		int numero2 = scn.nextInt();
		
		//Calcula o resultado
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		int divisao = numero1 / numero2;
		
		//Imprime o resultado obtivo
		System.out.println("Soma = "+soma);
		System.out.println("Subtração = "+subtracao);
		System.out.println("Multiplicação = "+multiplicacao);
		System.out.println("Divisão = "+divisao);
		
		scn.close();
	}
}