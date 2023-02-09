package br.com.xti.logica;
import java.util.Scanner;
public class Circulo{
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o Raio");
		double raio = s.nextDouble();
		
		double diametro = 2 * raio;
		System.out.println("Diametro="+diametro);
	}
	
}