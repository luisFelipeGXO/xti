package br.com.xti.poo;

public class CarroTeste {

	public static void main(String[] args) {

		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 439;
		ferrari.segundosZeroACem = 3.2;
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		ferrari.motor = v12;
		
		Carro Uno = new Carro("Uno CCXR",400, 3.1);
		Motor v8 = new Motor("V8",1018);
		Uno.motor = v8;
		
		Carro bugatti = new Carro("Bugatti Veyron",430, 2.2, new Motor("v16", 1400));
		
		System.out.println(bugatti.modelo);
		System.out.println(Uno.motor.potencia);
	}

}
