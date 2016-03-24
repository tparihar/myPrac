package com.bootcamp.multithreading;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Swing extends JFrame implements ActionListener {

	JPanel jp = new JPanel();
	JButton jb = new JButton("click me");
	JTextField jTextField = new JTextField("hello world", 20);
	JTextArea jTextArea = new JTextArea("hello \n how are yu guys\n ?", 5, 20);
	JLabel jlabel = new JLabel();

	public static void main(String[] args) {
		new Swing();
	}

	public Swing() {
		super("Basic Application");
		this.setSize(400, 400);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		jp.setBackground(Color.RED);
		jp.add(jb);
		jp.add(jTextField);
		jp.add(jTextArea);
		this.add(jp);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb) {
			this.setBackground(Color.BLUE);
		}

	}
}
