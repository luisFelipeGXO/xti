package br.com.xti.erros;

public class SenhaTest {
	
	static void autenticar(String senha)
	throws SenhaInvalidaException {
		if("123".equals(senha)) {
			System.out.println("Autenticado");
		} else {
			throw new SenhaInvalidaException("Senha Incorreta");
		}
	}

	public static void main(String[] args) {

		try {
			autenticar("1233");
		} catch(SenhaInvalidaException e){
			System.err.println(e.getMessage());
		}
	}

}
