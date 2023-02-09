package br.com.xti.poo;

public class Funcionário {

	private String nome;
	private boolean ativo;
	private String sobrenome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String s) {
		this.sobrenome = s;
	}
}
