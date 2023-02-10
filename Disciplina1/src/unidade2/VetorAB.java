/* Escreva um programa que leia um vetor A de 50 elementos,
 * construa e imprima outro vetor B da seguinte forma:
 * 
 * - Os elementos de ordem par são correspondentes a (2*A)
 * - Os elementos de ordem impar são correspondentes a (A/2)
 * 
 * */
package unidade2;

import java.util.Scanner;

public class VetorAB {

	public static void main(String[] args) {
	
		int vetorA[] = new int [50];
		int vetorB[] = new int [50];
		
		Scanner scn = new Scanner(System.in);
		
		//Ler os valores para o vetor A
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Informe o "+(i+1)+ " valor : ");
			vetorA[i] = scn.nextInt();
			
			//Armazena os valores para vetor B
			vetorB[i] = (i % 2 == 0 ? vetorA[i] * 2 : vetorA[i] / 2);
			
		}

		for (int i = 0; i < vetorB.length; i++) {
			System.out.printf("VetorB[%d] : %d \n",i, vetorB[i]);
		}
		
		scn.close();
	}
}
