package br.com.xti.refinado;

import java.io.Console;
import java.util.Properties;
import java.util.Set;

public class Sistemas {

	public static void main(String[] args) {
		
		Properties p = System.getProperties();
		System.out.println(p.getProperty("java.version"));
		p.setProperty("xti.curso.java.version", "1.0.0");
		
		/*Lista de propriedades
		Set<Object> pk = p.keySet();
		for (Object key : pk) {
			System.out.println(key + " = " + p.get(key));
		} */
		
		Console c = System.console();
		System.out.println("Usuário: ");
		String user = c.readLine();
		System.out.println("Senhora: ");
		char[] pass = c.readPassword();
		System.out.println("Usuário=" +user + "Senha=" +pass);
		
		
	}

}
