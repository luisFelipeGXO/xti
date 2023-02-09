package br.com.xti.erros;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DividirPor0 {
	
	public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException
	{
		System.out.print("Numero: ");
		int a = s.nextInt();
		System.out.print("Divisor: ");
		int b = s.nextInt();			
		System.out.println(a / b);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			try {
				dividir(s);
				continua = false;
			}
			catch(InputMismatchException | ArithmeticException e1) {
				System.err.println("Número inválido.");
				e1.getMessage(); // imprime todo o erro 
				s.nextLine(); 
			}
			
			finally {
				System.out.println("Finally executado... ");
			}
			
		} while (continua);
		
		
		
		
	}

}
