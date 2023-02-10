/*Escreva um programa para gerar os 20 primeiros termos da série
de Fibonacci, sendo que F(n) = F(n-1)+F(n-2) e F(1)=F(2) = 1.
EX: 1,1,2,3,5
Também calcule a sua média.*/
package unidade2;

public class AplicacaoFibonacci {

	public static void main(String[] args) {

		int valor = 1;
		int anterior = 1;
		int atual = 1;
		int soma = 0;
		int total = 0;


		for (int i = 1; i <= 20; i++) {
			total++;
			soma+=valor;

			System.out.println(valor);

			valor = atual;
			
			atual = anterior+atual;

			anterior = valor;

		}
		
		System.out.println("Média: "+soma / total);
	}
}