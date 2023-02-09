package br.com.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcessoBanco {

	public static void main(String[] args) throws Exception {
		
		String sql = "SELECT CODIGO, NOME, SEXO, EMAIL FROM PESSOA";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try(Connection con = DriverManager.getConnection(url, "xti", "xti123");
		PreparedStatement stm = con.prepareStatement(sql);
		ResultSet rs = stm.executeQuery()) {
		   	while(rs.next()) {
		   		String s = rs.getString("codigo")
		   		       + "; " + rs.getString("nome")
		   		       + "; " + rs.getString("sexo")
		   		       + "; " + rs.getString("email");
		   		System.out.println(s);
		   	}
		}
		
		
	}

}
