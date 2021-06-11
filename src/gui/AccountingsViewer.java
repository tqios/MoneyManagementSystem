package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import accounting.AccountingInput;
import manager.AccountingManager;

public class AccountingsViewer extends JPanel{
	
	WindowFrame frame;
	AccountingManager accountingManager;

	public AccountingManager getAccountingManager() {
		return accountingManager;
	}

	public void setAccountingManager(AccountingManager accountingManager) {
		this.accountingManager = accountingManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Date");
		model.addColumn("Amount");
		model.addColumn("Location");
		model.addColumn("Memo");
		 
		for (int i = 0; i<accountingManager.size(); i++) {
			Vector row = new Vector();
			AccountingInput ai = accountingManager.get(i);
			row.add(ai.getDate());
			row.add(ai.getAmount());
			row.add(ai.getLocation());
			row.add(ai.getMemo());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public AccountingsViewer(WindowFrame frame, AccountingManager accountingManager)  {
		
		this.frame = frame;
		this.accountingManager = accountingManager;
		
		
		

	}

}