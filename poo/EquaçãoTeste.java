package br.com.xti.poo;
import java.util.Scanner;

public class EquaçãoTeste {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Digite um número ");
		int num = s.nextInt();
		int resultado = 0;

		int passos = 0;
		int i=1;
	    for(i=1; i < num ;i=i+2) {
	    	if(i % 2 != 0) { 
	    		resultado = num - i;
	    		num = resultado;
	    		passos = passos + 1;
	    		System.out.println(passos);
	    		
	    	}

	}
	    

}
}