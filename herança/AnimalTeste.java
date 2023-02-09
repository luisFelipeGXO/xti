package br.com.xti.herança;

public class AnimalTeste {

	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}
	
	
	public static void main(String[] args) {

		Cachorro toto = new Cachorro();
		toto.comida = "carne";
		toto.dormir();
		toto.fazerBarulho();
		
		
		

		
		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal);
	}

}
