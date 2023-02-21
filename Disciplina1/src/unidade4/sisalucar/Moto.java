package unidade4.sisalucar;

public class Moto extends Veiculo {

	//Exemplo de anulação (overriding)
	public int getPassageiros() {
		return 1;
	}
	
	//Exemplo de sobercarga
	public void acelera(int limiteVelocidade) {
		System.out.println("Obedeça o limite de velocidade que é: "+limiteVelocidade);
	}
	
}
