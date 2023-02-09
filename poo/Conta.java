package br.com.xti.poo;

public class Conta implements java.io.Serializable{

	public String cliente;
	public double saldo;
	
	public Conta() {
		
	}
	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public void exibeSaldo() {
		System.out.println(cliente +" seu saldo é " +saldo);
	}
	
	void saca(double valor) {
		saldo = saldo - valor;
	}
	
	void deposita(double valor) {
		saldo = saldo + valor;
	}
	
	void transferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}
	
}
