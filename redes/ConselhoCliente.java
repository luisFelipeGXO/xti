package br.com.xti.redes;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ConselhoCliente {

	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("192.168.42.9", 3000);
		Scanner s = new Scanner(socket.getInputStream());
		System.out.println("Mensagem:" +s.nextLine());
		s.close();
	}

}
