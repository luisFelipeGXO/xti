package br.com.xti.herança;

public class InterfaceTeste {

	public static void area(AreaCalculavel o) {
		System.out.println(o.calculaArea());
	}
	
	public static void volume(VolumeCalculavel l) {
		System.out.println(l.calculaVolume());
	}
	
	public static void main(String[] args) {

		area(new Quadrado(2));
		volume(new Cubo(2));
		
		
	}

}
