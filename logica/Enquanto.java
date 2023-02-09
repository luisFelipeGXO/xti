package br.com.xti.logica;
import java.util.ArrayList;
import java.util.Scanner;

public class Enquanto {
	
	public static void main (String[] args) {
		
		ArrayList<String> produtos = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Liste seus Produtos : Para sair digite FIM");
		
		String produto;
		while(!"FIM".equals(produto = s.nextLine())) {
			produtos.add(produto);
		}
		System.out.println(produtos.toString());
		
		do{
			System.out.println(i);
			i++;
		} while(i < 2);
	}
	
// DO WHILE mostra 1 ou mais resultados, enquanto o WHILE mostra 0 ou mais resultados.	
}