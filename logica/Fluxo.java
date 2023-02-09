package br.com.xti.logica;
public class Fluxo{
	
	public static void main(String[] args){
		
		boolean passou = true;
		if(passou) {
			System.out.println("Contratado");
			
		}
		int numero = 10;
		if((numero % 2) == 0) {
			
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		int idade = 11;
		if(idade <= 11) {
			System.out.println("Criança");
		} else if (idade > 18 && idade <= 60) {
			System.out.println("Adulto");
		} else {
			System.out.println("Melhor idade");
		}
		int nota = 6;
		if(nota >= 7) {
			System.out.println("Passou");
			
		} else {
			System.out.println("Reprovou");
			if(nota >= 6) {
				System.out.println("Mais pode fazer a recuperação");
			}
		}
		
	}
	
}