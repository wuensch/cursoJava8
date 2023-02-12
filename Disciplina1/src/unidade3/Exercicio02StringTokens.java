/*
 * Escreva uma classe Java para ler uma String e dividi-la em tokens,
 * aplicando-se algum tipo de caractere ou caracteres como um delimitador.
 * Por exemplo, o texto “02/20/67” poderia ser dividido em três tokens – 02, 20 e 67 – usando o caracter de
 * barra (“/”) como delimitador.
 * 
 * */
package unidade3;

public class Exercicio02StringTokens {

	public static void main(String[] args) {
		
		String textoPrincipal = "O curso de java é muito bom.";
		String delimitador = " ";
		
		String palavras[] = textoPrincipal.split(delimitador);
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		
	}

}
