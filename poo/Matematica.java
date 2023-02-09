package br.com.xti.poo;

public class Matematica {

	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior dos dois números
	 */
	int maior(int um, int dois) {
		if(um > dois) {
			return um;
		} else {
			return dois;
		}
		
		
	}
	
	double soma(double[] numeros) {
		double total = 0;
		for(double n : numeros) { 
			total += n;
		}
		return total;
	}
}
