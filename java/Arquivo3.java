package br.com.xti.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import br.com.xti.poo.Conta;

public class Arquivo3 {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta("Luis",999.999);
		Conta conta2 = new Conta("João",1000);
		Conta conta3 = new Conta("Mario",999);
		Conta conta4 = new Conta("Daniel",8499);
		
		Path path = Paths.get("C:/xti/files/contas.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		
		try(BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
			w.write("Cliente1 = "+conta1.cliente + " Saldo ="+ conta1.saldo +"\n");
			w.write("Cliente2 = "+conta2.cliente + " Saldo ="+ conta2.saldo +"\n");
			w.write("Cliente3 = "+conta3.cliente + " Saldo ="+ conta3.saldo +"\n");
			w.write("Cliente4 = "+conta4.cliente + " Saldo ="+ conta4.saldo +"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
