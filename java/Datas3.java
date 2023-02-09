package br.com.xti.java;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.util.Calendar;

public class Datas3 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		Date date = c.getTime();
		
		Locale padrao = Locale.getDefault();
		Locale brasil = new Locale("pt", "BR"); // ISO 639 = LINGUA e ISO 3166 = PAÍS
		Locale india = new Locale("hi", "IN");
		Locale usa = Locale.US;
		Locale japao = Locale.JAPAN;
		Locale italia = Locale.ITALIAN;
		
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, india);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, usa);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, japao);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, italia);
		System.out.println(f.format(date));
		
	}

}
