package unidade4.polimorfismo;

public abstract class Funcionario {

	public static void main(String[] args) {
		
		
	}
	
	public abstract void getBonificacao();
	
	void verificaTipoFuncionario(Funcionario objeto) {

		if (objeto instanceof Diretor)
			System.out.println("Diretor");
		else if (objeto instanceof Professor)
			System.out.println("Professor");
		else if (objeto instanceof Administrador)
			System.out.println("Administrador");
	}
	
	
	
	
}
