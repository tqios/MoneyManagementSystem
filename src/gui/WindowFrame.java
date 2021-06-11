package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.AccountingManager;


public class WindowFrame extends JFrame{
	
	AccountingManager accountingManager;
	MenuSelection menuSelection;
	AccountingAdder accountingAdder;
	AccountingsViewer accountingsViewer;


	public WindowFrame(AccountingManager accountingManager) {

		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.accountingManager = accountingManager;
		menuSelection = new MenuSelection(this);
		accountingAdder = new AccountingAdder(this, this.accountingManager);
		accountingsViewer = new AccountingsViewer(this, this.accountingManager);
		
		this.setupPanel(menuSelection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}

	public AccountingAdder getAccountingAdder() {
		return accountingAdder;
	}

	public void setAccountingAdder(AccountingAdder accountingAdder) {
		this.accountingAdder = accountingAdder;
	}

	public AccountingsViewer getAccountingsViewer() {
		return accountingsViewer;
	}

	public void setAccountingsViewer(AccountingsViewer accountingsViewer) {
		this.accountingsViewer = accountingsViewer;
	}


}
