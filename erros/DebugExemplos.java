package br.com.xti.erros;

public class DebugExemplos {

	int resultado;
	
	public int raiz(int numero) {
		int raiz = 0, impar = 1;
		while (numero >= impar) {
			numero -= impar;
			impar += 2;
			++raiz;
		}
		return raiz;
		
		
	}
	
	public static void main(String[] args) {

		int numero = 16;
		DebugExemplos exemplo = new DebugExemplos();
		int raiz = exemplo.raiz(numero);
		
		if(raiz == 4) {
			System.out.println("Raiz correta");
		}
	}

}
