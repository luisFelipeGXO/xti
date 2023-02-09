package br.com.xti.herança;

public abstract class Animal {
	
	double peso;
	String comida;
	
	void dormir(){System.out.println("Dormiu");}
	
	abstract void fazerBarulho();

}
