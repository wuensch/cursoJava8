package unidade4;

import unidade4.sisalucar.Cliente;

public class Conta {

	private int numero;
	private double saldo;
	private double limite;
	private Cliente cliente[];
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean saca(double valor) {
		
		if (valor <= this.getSaldo()) {
			this.saldo -= valor;
			return true;
		} else 
			return false;
	}
	
	public void deposita(double valor) {
		
		this.saldo += valor;
		
	}
	
	public void transfere(Conta destino, double valor) {
		
		if (valor <= saldo) {
			
			saldo -= valor;
			destino.deposita(valor);
			
		} else
			System.out.println("Saldo insuficiente.");
		
	}
	
	public void atualiza (double taxa) {
		this.saldo = this.saldo + this.saldo * taxa;
	}
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.cliente = new Cliente[5];		
		
	}
	
}
