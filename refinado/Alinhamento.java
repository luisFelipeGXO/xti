package br.com.xti.refinado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Alinhamento extends JFrame {
	
	JButton botao;
	public Alinhamento() {
		super("Aninhamento");
		
		botao = new JButton("Ok");
		
		botao.addActionListener(new ListenerAninhado());
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Classe Ânonima executa: " +botao.getText());
			}
			
			
		
		});
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}

	public class ListenerAninhado implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Classe Aninhada executa: " +botao.getText());
			
			
		}
		
	}
	
	public static void main(String[] args) {

		Alinhamento janela = new Alinhamento();
		
		Alinhamento.ListenerAninhado listener = 
				janela.new ListenerAninhado();
	}

}
