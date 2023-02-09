package br.com.xti.logica;
public class RepFor {
	
	public static void main (String[] args) {
		
		int tamanho = 10;
		for(int x=0; x<tamanho; x++) {
			for(int i =0; i<tamanho; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		String texto = "";
		for(int i=0;i<=20;i++) {
			if(i % 2 == 0)
			texto = texto + i + ",";
		}
		System.out.println(texto);
	}
	
	
}