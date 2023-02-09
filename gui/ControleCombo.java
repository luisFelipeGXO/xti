package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener {

	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("fotos/teste1.jpg")),
			new ImageIcon(getClass().getResource("fotos/teste2.jpg")),
			new ImageIcon(getClass().getResource("fotos/teste3.jpg")),
			new ImageIcon(getClass().getResource("fotos/teste4.jpg")),
	};
	
	
	
	public ControleCombo() {
		super("Album de Fotos");
		Container c = getContentPane();
		
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif",Font.PLAIN, 26));
		combo.addItem("Whatsapp 01");
		combo.addItem("Whatsapp 02");
		combo.addItem("Whatsapp 03");
		combo.addItem("Whatsapp 04");
		combo.addItemListener(this);
		
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 530);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ControleCombo();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
	}

}
