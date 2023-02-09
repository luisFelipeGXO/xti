package br.com.xti.logica;
import javax.swing.JOptionPane;
public class Imc {
	
	public static void main(String[] args) {
		
		String peso = JOptionPane.showInputDialog("Qual o seu peso em kg?");
		String altura = JOptionPane.showInputDialog("Qual a sua altura em m?");
		
		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilogramas / (alturaEmMetros * 2);
		
		String msg = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Fora do peso ideal";
		msg = "imc = " + imc + "\n" + msg;
		
		JOptionPane.showMessageDialog(null, msg);
		
	}
	
}