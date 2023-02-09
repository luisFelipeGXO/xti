package br.com.xti.java;

public class StringMutavel {

	public static void main(String[] args) {

		StringBuffer s0 = new StringBuffer(); // sinncrniazdos, varias threads mesmo stringbuffers
		StringBuilder s1 = new StringBuilder("Java"); // nao sincrnidaszos, 
		
		s1.toString();
		s1.length();
		System.out.println(s1.length());
		s1.capacity();
		System.out.println(s1.capacity());
		
		System.out.println(s1);
		//s1.reverse();
		System.out.println(s1);
		
		s1.append(" Trabalhando ");
		char[] c = {'c', 'o', 'm'};
		s1.append(c).append(" Textos.");
		System.out.println(s1);
		
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
		System.out.println(url);
	}

}
