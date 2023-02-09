package br.com.xti.java;

public class StringOperações {

	public static void main(String[] args) {

		String s1 = "Write Once";
		String s2 = s1 + " Run AnyWhere";
		String s3 = new String("Java Virtual Machine");
		char[] array = {'J', 'a', 'v', 'a'};
		String s4 = new String(array);
		
		//OPERAÇÕES
		int tamanho = s1.length();
		char letra = s1.charAt(0);//0 a lenght()-1
		String texto = s1.toString();
		
		//LOCALIZAÇÃO
		int posicao = s3.indexOf("Virtual");
		int ultima = s3.lastIndexOf('a');
		boolean vazia = s3.isEmpty();
		System.out.println(posicao);
		
		//COMPARAÇÃO
		String xti = "XTI";
		boolean x = xti.equalsIgnoreCase("xti");
		boolean y = xti.startsWith("xt");
		boolean z = xti.endsWith("ti");
		int c = "amor".compareTo("bola"); //-1
		System.out.println(c);
		System.out.println(x);
		
		String so = "Olhe, olhe!";
		boolean o = so.regionMatches(6, "Olhe", 0, 4);
		System.out.println(o);
		
		//EXTRAÇÃO E MODIFICAÇÃO
		String l = "O Brasil é lindo!";
		String sl = l.substring(2, 8);
		sl = l.concat(" que Maravilha");
		sl = l.replace('s', 'z');
		sl = l.replaceFirst(" ", "X");
		sl = l.toUpperCase();
		sl = l.toLowerCase();
		
		System.out.println("      espaços        ".trim());
		System.out.println(sl);
		
	}

}
