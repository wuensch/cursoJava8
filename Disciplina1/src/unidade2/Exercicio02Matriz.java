/*
 * Escreva uma classe Java para criar uma matriz 4x4 de
   números inteiros. Em seguida, inicialize esta matriz e informe
   todos os elementos presentes e quantas vezes o mesmo aparece
   na matriz
 * */

package unidade2;

import java.util.ArrayList;

public class Exercicio02Matriz {

	public static void main(String[] args) {
	
		int matriz[][] = new int[4][4];
	
		//Listas para armazenar os números e seus totais
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		ArrayList<Integer> listaTotais = new ArrayList<Integer>();
		
		int valor;
		int total=0;
		
		//Cria uma matriz 4x4 com valores randômicos e apresenta seus valores
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = i * j;
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
		
		//Percorre a matriz criada
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				//Para cada valor da matriz
				valor = matriz[i][j];
				
				//Percorre a matriz novamente procurando esse elemento
				for (int k = 0; k < matriz.length; k++) {
					for (int l = 0; l < matriz.length; l++) {
						
						//Cada vez que o valor aparecer, totaliza
						if (valor == matriz[k][l]) {
							total++;
						}
					}
				}
				
				//Se o número ainda não foi contabilizado, inclui na lista e apresenta a quantidade
				if (! listaNumeros.contains(valor)) {
					listaNumeros.add(valor);
					listaTotais.add(total);
					System.out.printf("O número %d apareceu %d vezes \n",listaNumeros.get(i), listaTotais.get(i));
				}
				
				total = 0;
			}
		}
	}
}
