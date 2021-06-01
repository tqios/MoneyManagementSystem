package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AccountingAdder extends JFrame{
	
	public AccountingAdder() {
        
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
        
		JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelDate.setLabelFor(fieldDate);
		panel.add(labelDate);
		panel.add(fieldDate);
		
		JLabel labelAmount = new JLabel("Amount: ", JLabel.TRAILING);
		JTextField fieldAmount = new JTextField(10);
		labelDate.setLabelFor(fieldAmount);
		panel.add(labelAmount);
		panel.add(fieldAmount);
		
		JLabel labelLocation = new JLabel("Location: ", JLabel.TRAILING);
		JTextField fieldLocation = new JTextField(10);
		labelDate.setLabelFor(fieldLocation);
		panel.add(labelLocation);
		panel.add(fieldLocation);
		
		JLabel labelMemo = new JLabel("Memo: ", JLabel.TRAILING);
		JTextField fieldMemo = new JTextField(10);
		labelDate.setLabelFor(fieldMemo);
		panel.add(labelMemo);
		panel.add(fieldMemo);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
		
	}
}
