package br.com.xti.logica;
import javax.swing.JOptionPane;
public class Entrada2{
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null,nome);
	}
	
}