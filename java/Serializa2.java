package br.com.xti.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import br.com.xti.poo.Conta;

public class Serializa2 {

	public static void main(String[] args) throws Exception {

		Conta conta1 = new Conta("Luis",999.999);
		Conta conta2 = new Conta("João",1000);
		Conta conta3 = new Conta("Mario",999);
		Conta conta4 = new Conta("Daniel",8499);	
		
		/* ESCRITA DE OBJETO */
		FileOutputStream fos = new FileOutputStream("C:/xti/files/conta.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(conta1);
		oos.writeObject(conta2);
		oos.writeObject(conta3);
		oos.writeObject(conta4);
		oos.close();
		
		/* LEITURA DE OBJETO */
		FileInputStream fis = new FileInputStream("C:/xti/files/conta.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Conta c1 = (Conta) ois.readObject();
		Conta c2 = (Conta) ois.readObject();
		Conta c3 = (Conta) ois.readObject();
		Conta c4 = (Conta) ois.readObject();
		ois.close();
		
		c1.exibeSaldo();
		c2.exibeSaldo();
		c3.exibeSaldo();
		c4.exibeSaldo();
		
		Path path = Paths.get("C:/xti/files/trand.ser");
		Files.delete(path);
		
	}

}
