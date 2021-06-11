package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AccountingAdder;
import gui.WindowFrame;

public class AccountingAdderCancelListener implements ActionListener {

	
	WindowFrame frame;

	public AccountingAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuSelection());
		frame.revalidate();
		frame.repaint();
		
		//JButton b = (JButton) e.getSource();
		//AccountingAdder adder = frame.getAccountingAdder();
		//frame.setupPanel(adder);
	}

}