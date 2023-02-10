package unidade2;

import javax.swing.JOptionPane;

public class Avaliacao {

	public static void main(String[] args) {

		int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota:"));
		
		if (nota < 0 || nota > 100) {
			System.out.println("Valor inválido para nota.");
			main(null);//Recursividade
		} else if (nota >= 90) {
			System.out.println("Excelente.");
		} else if (nota >= 70) {
			System.out.println("Bom.");
		} else if (nota >= 50) {
			System.out.println("Regular.");
		} else {
			System.out.println("Insuficiente.");
		}
		
	}
}