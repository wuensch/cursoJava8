package unidade4.sisalucar;

public class Onibus extends Veiculo {

	//Exemplo de anulação (overriding)
	public int getPassageiros() {
		return 40;
	}
	
	//Exemplo de sobercarga
	public void acelera(int limiteVelocidade) {
		System.out.println("Obedeça o limite de velocidade que é: "+limiteVelocidade);
	}	
	
}
