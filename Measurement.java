/*
*CSCI 185 M01/2
*Module 7 lab 2: More Java GUI: Measurement Unit Converter
*Ameer Ahmed, Javier Torres, Annie Zheng, Shajid Muntaser
*/
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class Measurement extends JFrame{
	public Measurement() {
		JFrame frame = new JFrame();
		setTitle("MEASUREMENT UNIT CONVERTER");
		setSize(400, 400);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Pound: ");
		JTextField txtPound = new JTextField();
		
		JLabel label1 = new JLabel("Kg: ");
		JTextField txtKg = new JTextField();
		
		setLayout(new GridLayout(0,1));
		add(label);
		add(txtPound);
		
		add(label1);
		add(txtKg);
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		add(panel, BorderLayout.CENTER);
		
		JButton button1 = new JButton("Convert");
		panel.add(button1);
		
		JButton button2 = new JButton("Clear");
		panel.add(button2);
		
		//converter
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a) {
				try {
					double pounds = Double.parseDouble(txtPound.getText());
					double kg = pounds * 0.454;
					txtKg.setText(kg + "");
				}
				catch(Exception e) {
				JFrame f2 = new JFrame("Error!");
				JOptionPane.showMessageDialog(f2, "Enter only NUMBERS please! Also values are not accepted in kg.");
				txtPound.setText("");
				}
			}
		});
		//clear
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				txtPound.setText("");
				txtKg.setText("");
			}
		});
		
	}
	public static void main(String[]args) {
		Measurement m = new Measurement();
		m.setVisible(true);
	}
}
