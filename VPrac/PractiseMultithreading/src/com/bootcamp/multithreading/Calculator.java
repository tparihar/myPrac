package com.bootcamp.multithreading;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Calculator extends JFrame implements ActionListener {
	Container c;
	JTextArea jTextArea;
	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.setBounds(100, 100, 300, 400);
		cal.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cal.setVisible(true);
		cal.setResizable(true);
	}

	public Calculator() {
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.lightGray);
		jTextArea = new JTextArea();
		jTextArea.setBounds(10, 10, 260, 80);
		
		
		
		c.add(jTextArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
