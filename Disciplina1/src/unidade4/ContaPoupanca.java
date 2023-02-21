package unidade4;

public class ContaPoupanca extends Conta {

	public void atualiza (double taxa) {
		super.setSaldo( super.getSaldo() * taxa * 3 );
	}	

}
