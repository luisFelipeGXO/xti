package br.com.xti.herança;

public class OperacaoTeste {

	public static void calcule(OperaçãoMatematica o, double x, double y) {
		System.out.println(o.calcular(x, y));
	}
	
	public static void main(String[] args) {

		calcule(new Soma(), 5,5);
		calcule(new Multiplicação(), 5,5);
	}

}
