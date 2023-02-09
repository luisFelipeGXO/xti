package br.com.xti.logica;
import java.util.ArrayList;

public class Fibonacci {
	
	public static void main (String[] args) {
		
		int novo_numero, numero_anterior, numero_atual;
		numero_atual = 1;
		numero_anterior = 0;
		
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		for(novo_numero=2; novo_numero<=50; novo_numero++) {
			fibonacci.add(numero_atual);
			
			novo_numero = numero_atual + numero_anterior;
			numero_anterior = numero_atual;
			numero_atual = novo_numero;
		}
		for(Integer numero : fibonacci) {
			System.out.println(numero);
		}
	}
	
	
}