package br.com.xti.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Guaraná");
		list.add("Uva");
		list.add("Manga");
		list.add("Coco");
		list.add("Açaí");
		list.add("Banana");
		System.out.println(list);
		
		Collections.sort(list); // ordem alfabetica
		System.out.println(list);
		
		Collections.reverse(list); // ordem invertida
		System.out.println(list);
		
		Collections.shuffle(list); // ordem aleatória
		System.out.println(list);
		
		Collections.addAll(list, "Cupuaçu", "Laranja", "Laranja"); // add
		System.out.println(list);
		
		System.out.println(Collections.frequency(list, "Laranja"));
		
		List<String> list2 = Arrays.asList("Acerola", "Granola");
		boolean d = Collections.disjoint(list, list2);
		
		Collections.sort(list);
		int indice = Collections.binarySearch(list, "Guaraná");
		System.out.println(indice);
		
		Collections.fill(list, "Açaí");
		System.out.println(list);
		
		//coleção não modificável
		Collection<String> constante = 
				Collections.unmodifiableCollection(list);
	}

}
