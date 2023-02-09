package br.com.xti.java;

public class StringToken {

	public static void main(String[] args) {

		String s = "XHTML; CSS; JavaScript; jQuery; Java";
		s = "Venha trabalhar na XTI";
		String[] tokens = s.split("a");
		System.out.println(tokens.length + " tokes");
		for(String token : tokens) {
			System.out.println(token);
		}
		
	}

}
