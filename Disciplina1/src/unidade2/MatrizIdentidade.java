/*
 * Construa uma matriz Identidade I=3 (apenas os valores
 * diagonais são = 1, os demais são 0).
 * 
 * | 1 0 0 |
 * | 0 1 0 |
 * | 0 0 1 |
 * 
 * */

package unidade2;

public class MatrizIdentidade {

	public static void main(String[] args) {

		int matrizId[][] = new int[3][3];
		
		//Cria e imprime matriz identidade
		for (int i = 0; i < matrizId.length; i++) {
			for (int j = 0; j < matrizId.length; j++) {
				matrizId[i][j] = (i==j ? 1 : 0);
				System.out.print(matrizId[i][j]);
			}
			System.out.println("");
		}
	}
}