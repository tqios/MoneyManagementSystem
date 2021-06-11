package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import accounting.AccountingInput;
import accounting.AccountingKind;
import accounting.Cash;
import manager.AccountingManager;

public class AccountingAdderListener implements ActionListener {
	JTextField fieldDate;
	JTextField fieldAmount;
	JTextField fieldLocation;
	JTextField fieldMemo;
	
	AccountingManager accountingmanager;

	public AccountingAdderListener(JTextField fieldDate, JTextField fieldAmount, JTextField fieldLocation,
			JTextField fieldMemo, AccountingManager accountingmanager) {
		this.fieldDate = fieldDate;
		this.fieldAmount = fieldAmount;
		this.fieldLocation = fieldLocation;
		this.fieldMemo = fieldMemo;
		this.accountingmanager = accountingmanager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		AccountingInput accounting = new Cash(AccountingKind.Cash);
		accounting.setDate(Integer.parseInt(fieldDate.getText()));
		accounting.setAmount(Integer.parseInt(fieldAmount.getText()));
		accounting.setLocation(fieldLocation.getText());
		accounting.setMemo(fieldMemo.getText());
		accountingmanager.addAccounting(accounting);
	}
	
	public static void putObject(AccountingManager accountingManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(accountingManager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
