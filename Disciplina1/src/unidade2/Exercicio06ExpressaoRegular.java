/*
 * Criar uma classe Java que valide um endereço de e-mail utilizando expressões regulares.
 * */
package unidade2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio06ExpressaoRegular {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe o e-mail a ser validado: ");
		String email = scn.next();
		
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		if (matcher.matches() ) {
			System.out.println("The e-mail is valid.");
		} else {
			System.out.println("The e-mail is not valid.");
		}
		
		scn.close();

	}
}