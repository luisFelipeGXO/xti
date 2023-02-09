package br.com.xti.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo3Reader {

	public static void main(String[] args) {

		Path path = Paths.get("C:/xti/files/contas.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		
		try(BufferedReader reader = Files.newBufferedReader(path,utf8)) {
			String line = null;
			while((reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.err.println("Erro.");
			e.printStackTrace();
		}
		
	}

}
