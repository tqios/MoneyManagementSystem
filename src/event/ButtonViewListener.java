package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.AccountingsViewer;
import gui.WindowFrame;
import manager.AccountingManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		AccountingsViewer accountingsViewer = frame.getAccountingsViewer();
		AccountingManager accountingManager = getObject("accountingmanager.ser");
		accountingsViewer.setAccountingManager(accountingManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(accountingsViewer);
		frame.revalidate();
		frame.repaint();
		
		//JButton b = (JButton) e.getSource();
		//AccountingsViewer viewer = frame.getAccountingsViewer();
		//frame.setupPanel(viewer);
	}

	public static AccountingManager getObject(String filename) {
		AccountingManager accountingManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			accountingManager = (AccountingManager) in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return accountingManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return accountingManager;
	}
}
