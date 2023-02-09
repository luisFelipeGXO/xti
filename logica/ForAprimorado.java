package br.com.xti.logica;
import java.util.ArrayList;

public class ForAprimorado {
	
	public static void main (String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0; i<10; i++) {
			list.add(i);
		}
		for(Integer numero : list) {
			System.out.println(numero);
		}
		int[] pares = {2,4,6,8};
		for(int i=0; i<pares.length; i++) {
			int par = pares[i];
			System.out.println(par);
		}
	}
	
}