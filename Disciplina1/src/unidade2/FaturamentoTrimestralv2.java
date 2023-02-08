/* 1) Escreva um programa que calcule o faturamento trimestral de uma
empresa de software. Sabendo que, em Janeiro, as vendas foram de
R$15.000, em Fevereiro, R$23.000 e em Março, R$17.000. O valor final
deverá ser impresso na tela.

2) Adapte o programa acima para que a leitura das vendas mensais seja
informada pelo usuário final

 * */
package unidade2;

import javax.swing.JOptionPane;

public class FaturamentoTrimestralv2 {

	public static void main(String[] args) {
		double faturamentoJan = Double.parseDouble( JOptionPane.showInputDialog("Informe o faturamento de Janeiro: ") );
		double faturamentoFev = Double.parseDouble( JOptionPane.showInputDialog("Informe o faturamento de Fevereiro: ") );
		double faturamentoMar = Double.parseDouble( JOptionPane.showInputDialog("Informe o faturamento de Março: ") );;
		
		double faturamentoTrimestral = (faturamentoJan + faturamentoFev + faturamentoMar);
		
		JOptionPane.showMessageDialog(null, "Valor do faturamento trimestral: "+faturamentoTrimestral);

	}

}
