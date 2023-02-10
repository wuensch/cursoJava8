package unidade2;

import javax.swing.JOptionPane;

public class AplicacaoMedia {
	/*Escreva um programa para calcular a média aritmetica, maior e menor valores de um conjunto de valores inteiros positivos.
	-Observação: considere o valor (-1) como finalizador.*/
	public static void main(String[] args) {

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um inteiro positivo: "));
		int total = 0;
		int soma = 0;
		double media = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		if (valor == -1) {
			maior = 0;
			menor = 0;
		}
		
		while (valor != -1) {
			total++;

			//Soma todos valores
			soma += valor;
			//Calcula a média (parse to double because integer division rounds toward zero)
			media = (double) soma / total;

			//Calcula maior valor
			if (valor > maior) {
				maior = valor;
			}

			//Calcula menor valor
			if (valor < menor) {
				menor = valor;
			}
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um inteiro positivo: "));
		}
		
		JOptionPane.showMessageDialog(null, "Média: "+media);
		JOptionPane.showMessageDialog(null, "Maior valor: "+maior);
		JOptionPane.showMessageDialog(null, "Menor valor: "+menor);
	}

}
