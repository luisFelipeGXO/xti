package br.com.xti.poo;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.cliente = "Ricardo";
		conta.saldo = 10_000.00;
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Lawrence";
		destino.saldo = 8_000.00;
		destino.exibeSaldo();
		
		conta.transferePara(destino, 1550.0);
		conta.exibeSaldo();
		destino.exibeSaldo();

	}

}
