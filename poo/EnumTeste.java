package br.com.xti.poo;

public class EnumTeste {
	
	public static final double PI = 3.14;
	
	public static void andar(Medida medida, int total) {
		if(medida == Medida.M) {
			
		}
	}

	public static void main(String[] args) {

		System.out.println(PeçasXadrez.BISPO);
		System.out.println(Medida.M.titulo);
		
		for(Medida m : Medida.values()) {
			System.out.println(m + " : " + m.titulo);
		}
		
		andar(Medida.M,100);
	}

}
