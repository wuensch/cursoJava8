package unidade1;

public class TesteExcecao {

	public static void main(String[] args) {

		int i = 50;
		
		try 
		{
			i = 1 / 0;
			System.out.println("O resultado " + i);
			Object c = null;
			System.out.println("O resultado " + c.toString());			
		} catch (ArithmeticException | NullPointerException e) {
				
			if (e instanceof ArithmeticException) {
				System.out.println("Erro de divisão por zero");
			}else if (e instanceof NullPointerException) {
				System.out.println("Erro de acesso a objeto nulo.");
			}

		}
		
	}

}
