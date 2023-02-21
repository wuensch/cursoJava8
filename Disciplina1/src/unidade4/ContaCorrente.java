package unidade4;

public class ContaCorrente extends Conta {

	public void atualiza (double taxa) {
		super.setSaldo( super.getSaldo() * taxa * 2 );
	}
}
