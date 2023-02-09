package br.com.xti.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {

		//REGRA FIFO
		Queue<String> fila = new LinkedList<>();
		fila.add("Ricardo");
		fila.add("Sandra");
		fila.offer("Beatriz");
		System.out.println(fila);
		
		System.out.println(fila.peek()); //proximo da fila
		System.out.println(fila.poll()); //removee o elemento do inicio da fila
		System.out.println(fila);
		
		/* outros metodos disponíveis em linkedlist */
		LinkedList<String> f = (LinkedList<String>) fila;
		f.addFirst("Caio");
		f.addFirst("Juliana");
		System.out.println(f);
		
		System.out.println(f.peekFirst());
		System.out.println(f.peekLast());
		
		f.pollFirst();
		f.pollLast();
		System.out.println(f);
	}

}
