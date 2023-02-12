package unidade3.sisalucar;

public enum Revendedor {

	ABCVEICULOS("101010/0001","RUA XXX, 123"," VOLKSVAGEM"),
	SIMAOVEICULOS("201010/0001","RUA ABC, 1500"," HONDA"),
	EMANUELVEICULOS("301010/0001","AVENIDA DAS NAÇÕES, 123"," SUZUKI");
	
	String cnpj;
	String endereco;
	String fabricante;
	
	private Revendedor(String cnpj, String endereco, String fabricante) {
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.fabricante = fabricante;
	}
	
	
}
