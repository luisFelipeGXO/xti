package br.com.xti.poo;

public class MatematicaTeste {

	public static void main(String[] args) {
		Matematica m = new Matematica();
		int ma = m.maior(10, 20);
		System.out.println(ma);
		
		
		
		double[] numeros = {2, 3, 4, 5, 7, 9, 1234};
		double total = m.soma(numeros);
		System.out.println("Total =" + total);
		
		
		

	}

}
