/* 1) Escreva um programa que calcule o faturamento trimestral de uma
empresa de software. Sabendo que, em Janeiro, as vendas foram de
R$15.000, em Fevereiro, R$23.000 e em Março, R$17.000. O valor final
deverá ser impresso na tela.
 * */
package unidade2;

public class FaturamentoTrimestral {

	public static void main(String[] args) {
		double faturamentoJan = 15_000;
		double faturamentoFev = 23_000;
		double faturamentoMar = 17_000;
		double faturamentoTrimestral = (faturamentoJan + faturamentoFev + faturamentoMar);
		
		System.out.println("Valor do faturamento trimestral: "+faturamentoTrimestral);

	}

}
