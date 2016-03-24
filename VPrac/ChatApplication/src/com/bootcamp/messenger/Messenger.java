package com.bootcamp.messenger;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Messenger {

	private JFrame frame;
	private Container container;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Messenger window = new Messenger();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Messenger() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 354, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container = frame.getContentPane();
		container.setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(131, 11, -93, 102);
		frame.getContentPane().add(textArea);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(188, 30, -140, 83);
		frame.getContentPane().add(textArea_1);

		JButton Jbutton1 = new JButton("Color change");
		Jbutton1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		Cursor cursor =  new Cursor(Cursor.HAND_CURSOR);
		Jbutton1.setCursor(cursor);
		Jbutton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				container.setBackground(Color.BLACK);
			}
		});
		Jbutton1.setBounds(64, 272, 203, 34);
		frame.getContentPane().add(Jbutton1);
	}
}
