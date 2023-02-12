/*
 * 1) Escrever uma classe Java para realizar as seguintes operações:
 * • A) Criar a String nome (“O Curso de Java”) e a String * avaliacao (“é ótimo!”);
 * • B) Imprimir em uma única linha: “O Curso de Java é ótimo!”
 * • C) Extrair apenas a palavra “Java” fazendo uso do método substring(...).
 * 
 * */
package unidade3;

public class Exercicio01Strings {

	public static void main(String[] args) {
		
		String nome = "O curso de Java";
		String avaliacao = "é ótimo!";
		
		System.out.printf("%s %s \n",nome,avaliacao);
		
		System.out.println(nome.substring(11));

	}
	
}