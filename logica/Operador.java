package br.com.xti.logica;
public class Operador {
	
	public static void main(String[] args){
		
		double x = 7 * 3;
		String y = "oi" + "dev";
		int a = 6;
		int b = a++;
		int z = 6;
		Integer p = 9;
		int s = 10;
		
		int idade = 6;
		String k = (idade >= 18) ? "Maior de idade" : "Menor de idade";
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(z == 6);
		System.out.println(p instanceof Integer);
		System.out.println((s >= 1) && (s <=10));
		
		System.out.println(k);
	}
	
}