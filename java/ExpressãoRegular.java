package br.com.xti.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressãoRegular {

	public static void main(String[] args) {

		boolean b = "Java".matches("java");
		
		/*MODIFICADORES
		 * (?i), Ignora maiúscula e minúscula 
		 * (?x), Comentários
		 * (?m), Multilinhas
		 * (?s), Dottal */
		
		b = "Java".matches("(?im)java");
		//System.out.println(b);
		
		/*METACARACTERES
		 *  . qualquer caracter
		 *  \d dígitos
		 *  \D nao é digito
		 *  \s espaços
		 *  \S nao é espaço
		 *  \w letra
		 *  \W não é letra*/
		
		b = "@".matches(".");
		b = "a".matches("\\d");
		b = "a".matches("\\w");
		b = " ".matches("\\s");
		b = "Pie".matches("...");
		b = "21".matches("\\d\\d");
		
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "70294-070".matches(cep);
		
		
		/*QUANTIFICADDORES
		 * X{n} X, exatamente n vezes
		 * X{n,} X, pelo menos n vezes
		 * X{n, m} X, pleo menos n mas não mais do que m vezes
		 * X?      X, 0 ou 1 vez
		 * X*      X, 0 ou + vezes
		 * X+      X, 1 ou + vezes*/
		
		b = "12".matches("\\d{2}");
		b = "1234".matches("\\d{2,}");
		b = "12345".matches("\\d{2,5}");
		b = "aa".matches(".?"); //0 ou 1
		b = "".matches(".*"); //  0 ou +
		b = "123".matches(".+");
		
		b = "70294-070".matches("\\d{5}-\\d{3}");
		b = "12/02/1980".matches("\\d{2}/\\d{2}/\\d{4}");
		
		
		/**METACARACTER DE FRONTEIRA
		 * ^ inicia 
		 * $ finaliza
		 * | ou */
		
		b = "Pier21".matches("^Pier.*");
		b = "Pier21".matches(".*21$");
		b = "tem java aqui".matches(".*java.*");
		b = "tem java aqui".matches("^tem.*aqui$");
		b = "sim".matches("sim|não");
		
		/*AGRUPADORES
		 * [...] Agrupamento
		 * [a-z] Alcance
		 * [a-e][i-u] União
		 * [a-z&&[aeiou]] Interseção
		 * [^abc] Exceção
		 * [a-z&&[^m-p]] Subtração
		 * \x Fuga literal */
		
		b = "x".matches("[a-z]");
		b = "3".matches("[0-9]");
		
		b = "True".matches("[tT]rue");
		b = "yes".matches("[tT]rue|[yY]es");
		b = "Nome".matches("[A-Z][a-z]*");
		b = "olho".matches("[^abc]lho");
		b = "crau".matches("cr[ae]u");
		
		b = "rh@xti.com.br".matches("\\w+@\\w+\\.\\w{2,3}\\.\\w{2,3}"); // validação de email
		System.out.println(b);
		
		String doce = "Qual é o Doce mais doCe que o doce?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce); 
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		/*SUBSTITUIÇÕES*/
		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		
		String rato = "O rato roeu a roupa do rei de roma";
		String t = "Tabular esse texto".replaceAll("\\s", "\t");
		r = rato.replaceAll("r[aeiou]", "XX");
		
		String url = "www.xti.com.br/clientes-2011.html";
		           //http://www.xti.com.br/2011/clientes
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		b = url.matches(re);
		
		re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		
		r = url.replaceAll(re, "http://$1/$3/$2.jsp");
		
		
		System.out.println(r);
		System.out.println(t);
		System.out.println(b);
	}

}
