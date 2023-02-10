package unidade2;

import java.util.Scanner;

public class Operadoresv2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		//Lê os valores
		System.out.print("Digite o 1 número: ");
		int numero1 = scn.nextInt();
		System.out.print("Digite o 2 número: ");
		int numero2 = scn.nextInt();
		
		System.out.println("Número 1 é < número2: "+(numero1<numero2));
		System.out.println("Número 1 é > número2: "+(numero1>numero2));
		System.out.println("Número 1 é >= número2: "+(numero1>=numero2));
		scn.close();
	}
}