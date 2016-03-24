package com.bootcamp.multithreading;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 extends JFrame implements ActionListener {

	JButton jb = new JButton("click me");
	Container c;
	public static void main(String[] args) {
		Swing1 s = new Swing1();
		s.setSize(400, 400);
		s.setResizable(true);
		s.setLocationRelativeTo(null);
		s.setVisible(true);
	}

	public Swing1() {
		super("Basic Application");
		c = this.getContentPane();
		this.setLayout(null);
		jb.setBounds(100, 50, 100, 50);
		jb.addActionListener(this);
		c.add(jb);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		c.setBackground(Color.GREEN);

	}
}
