package com.bootcamp.multithreading;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Swing2 {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblClock;
	private JButton btnNewButton;
	volatile boolean  status =true;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing2 window = new Swing2();
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
	public Swing2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(119, 68, 285, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		lblClock = new JLabel("Clock");
		lblClock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClock.setBounds(64, 66, 45, 41);
		frame.getContentPane().add(lblClock);
		
		btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if("Stop".equals(btnNewButton.getText())){
					btnNewButton.setText("Start");
					status = false;
					showTime();
				}else{
					btnNewButton.setText("Stop");
					status = true;
					showTime();
				}
				
				
			}
		});
		btnNewButton.setBounds(206, 133, 100, 33);
		frame.getContentPane().add(btnNewButton);
	}

	public void showTime() {

		new Thread() {
			@Override
			public void run() {
				try {
					while (status) {
						Calendar cal = new GregorianCalendar();
						int date = cal.get(Calendar.DATE);
						String meridiem = "PM";
						if (cal.get(Calendar.AM_PM) == 0) {
							meridiem = "AM";
						}
						int month = cal.get(Calendar.MONTH);
						int year = cal.get(Calendar.YEAR);
						int mm = cal.get(Calendar.MINUTE);
						int ss = cal.get(Calendar.SECOND);
						int hh = cal.get(Calendar.HOUR);

						textField.setText("Time : " + hh + ":" + mm + ":" + ss + " " + meridiem + "       Date : "
								+ month + "/" + date + "/" + year);

						sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}.start();

	}
}
