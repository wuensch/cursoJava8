package unidade4.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros = 0;

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.setIdCarro(1);
		carro1.setModelo("Corolla");
		carro1.setPlaca("JDK-7777");
		carro1.setCor("Blue");
		carro1.setValorDiaria(99.90f);
		carro1.setFabricante("Toyota");
		carro1.setRevendedor(Revendedor.ABCVEICULOS);
		
		totalCarros+=1;
		
		Carro carro2 = new Carro();
		
		Cliente cliente1 = new Cliente();
		cliente1.setIdCliente(1);
		cliente1.setCpf("777555333-10");
		cliente1.setNome("Rubão");
		cliente1.setCnh("YYZ1234567890");
		
		Cliente cliente2 = new Cliente();
		
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(carro1.getIdCarro(), cliente1.getIdCliente(), carro1.getValorDiaria());
		gerarRelatorioLocacao(carro1, LocalDate.now(), LocalDate.now().plusDays(5) );
		
		Moto moto  = new Moto();
		System.out.println(moto.getPassageiros());
		
		Onibus onibus = new Onibus();
		System.out.println(onibus.getPassageiros());
		
		
	}
	
	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria) {
		
		Locacao locacao = new Locacao();
		locacao.setIdCarro(idCarro);
		locacao.setIdCliente(idCliente);
		locacao.setIdLocacao(1);
		locacao.setDatainicial(LocalDate.now());
		locacao.setDatafinal(LocalDate.now().plusDays(2));
		locacao.setValorLocado(2 * 99.90f);
	}
	
	public static void gerarRelatorioLocacao(Carro carro1, LocalDate ...datas) {
		
		float totalFaturado = 2 * 99.90f;
		
		
		
	}

}
