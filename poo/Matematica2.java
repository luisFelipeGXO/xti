package br.com.xti.poo;

public class Matematica2 {

	double media(int x) {
		System.out.print("media(int x) ");
		return x;
	}
	
	double media(int x, int y) {
		System.out.print("media(int x, int y) ");
		return (x + y) / 2;
	}
	

	double media(String x, String y) {
		System.out.print(" media(String x, String y) ");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy) / 2;
	}
	
	
}
