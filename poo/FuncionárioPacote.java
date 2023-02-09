package br.com.xti.poo;

public class FuncionárioPacote {

	public static void main(String[] args) {

		Funcionário f = new Funcionário();
		String n = f.getNome(); // get para captura de informação
		f.setNome("Wellington"); // set para configuração
		
		String s = f.getSobrenome();
		f.setSobrenome("Machado");
		
		
		
		
	}

}
