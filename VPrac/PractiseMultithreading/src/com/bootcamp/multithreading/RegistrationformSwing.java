package com.bootcamp.multithreading;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class RegistrationformSwing extends JFrame implements ActionListener {

	Container c;
	JTextField jTxt;
	JPasswordField jp;
	JCheckBox jc;
	JTextArea jTa1;
	JTextArea jTa;
	JRadioButton jRb;
	JRadioButton jRb1;
	JComboBox<String> jCom;
	JComboBox<String> jCom1;
	JComboBox<String> jCom2;

	public static void main(String[] args) {

		RegistrationformSwing reg = new RegistrationformSwing();
		reg.setBounds(100, 100, 800, 500);
		reg.setDefaultCloseOperation(EXIT_ON_CLOSE);
		reg.setVisible(true);
		reg.setResizable(true);
	}

	public RegistrationformSwing() {
		c = this.getContentPane();
		login(c);
	}

	public void login(Container c) {
		c.setLayout(null);
		// c.setBackground(Color.ORANGE);

		JLabel jLbl1 = new JLabel("Username");
		jLbl1.setBounds(50, 50, 150, 30);
		jTxt = new JTextField();
		jTxt.setBounds(150, 50, 150, 30);

		JLabel jLbl2 = new JLabel("Password");
		jLbl2.setBounds(50, 100, 150, 30);
		jp = new JPasswordField();
		jp.setBounds(150, 100, 150, 30);

		JLabel jLbl3 = new JLabel("DOB");
		jLbl3.setBounds(50, 150, 150, 30);

		String days[] = new String[31];
		for (int i = 1; i <= 31; i++) {
			days[i - 1] = Integer.toString(i);
		}
		jCom = new JComboBox<>(days);
		jCom.setBounds(150, 150, 50, 25);

		String months[] = { "jan", "feb", "mar", "apr", "may", "june", "july", "aug", "sep", "oct", "nov", "dec" };
		jCom1 = new JComboBox<>(months);
		jCom1.setBounds(220, 150, 50, 25);

		String years[] = new String[50];
		for (int i = 1971; i <= 2020; i++) {
			years[i - 1971] = Integer.toString(i);
		}
		jCom2 = new JComboBox<>(years);
		jCom2.setBounds(290, 150, 70, 25);

		JLabel jLbl4 = new JLabel("Gender");
		jLbl4.setBounds(50, 200, 150, 30);

		jRb = new JRadioButton("Male");
		jRb.setBounds(150, 200, 70, 30);
		jRb.setSelected(true);
		jRb1 = new JRadioButton("Female");
		jRb1.setBounds(250, 200, 70, 30);

		ButtonGroup bg = new ButtonGroup();
		bg.add(jRb);
		bg.add(jRb1);

		JLabel jLbl5 = new JLabel("Address");
		jLbl5.setBounds(50, 250, 150, 30);
		jTa = new JTextArea(3, 5);
		jTa.setBounds(150, 250, 200, 80);

		jc = new JCheckBox();
		jc.setBounds(130, 350, 20, 30);
		JLabel jLbl6 = new JLabel("please accept the terms and conditions");
		jLbl6.setBounds(150, 350, 400, 30);

		JButton jb = new JButton("Submit");
		jb.setBounds(150, 400, 100, 30);
		jb.addActionListener(this);

		jTa1 = new JTextArea(3, 5);
		jTa1.setBounds(450, 50, 300, 400);

		c.add(jLbl1);
		c.add(jTxt);
		c.add(jLbl2);
		c.add(jp);
		c.add(jLbl3);
		c.add(jCom);
		c.add(jCom1);
		c.add(jCom2);
		c.add(jLbl4);
		c.add(jRb);
		c.add(jRb1);
		c.add(jTa);
		c.add(jLbl5);
		c.add(jc);
		c.add(jLbl6);
		c.add(jTa1);
		c.add(jb);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String gen = "male";
		if (jRb1.isSelected()) {
			gen = "female";
		}
		if (jc.isSelected()) {
			jTa1.setText("Username 		: " + jTxt.getText() + "\n" + "Password 		: " + jp.getText() + "\n"
					+ "DateOfBirth		: " + jCom.getSelectedItem() + "/" + jCom1.getSelectedItem() + "/"
					+ jCom2.getSelectedItem() + "\n" + "Gender		: " + gen + "\n" + "Address		: "
					+ jTa.getText());

		} else {
			jTa1.setText("please accept the terms and conditions");
		}
	}
}
