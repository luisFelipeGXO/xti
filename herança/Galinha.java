package br.com.xti.herança;

public class Galinha extends Animal implements AreaCalculavel {

	double lado; // deu pra fazer isso só por causa da interface (objeto x animal)
	public Galinha(double lado) {
		this.lado = lado;
	}
	
	public double calculaArea() {
		return lado * lado *lado;
	}
	
	void fazerBarulho() {
		System.out.println("Có Có Có!");
	}
}
