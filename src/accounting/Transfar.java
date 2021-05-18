package accounting;

import java.util.Scanner;

public class Transfar extends Accounting{
	protected String receiver ;
	
	public Transfar(AccountingKind kind) {
		super(kind);
	}
	
	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public void getUserInput(Scanner input) {
		setAccountingDate(input);
		setAccountingAmount(input);
		setAccountingLocation(input);
		setAccountingMemo(input);
		setAccountingreceiver(input);
	}
	public void setAccountingreceiver(Scanner input) {
		System.out.print("receiver : ");
		this.setReceiver(input.next());
	}
	
	public void printInfo() {

		String akind = getKindString();
		System.out.println("kind: " + akind + " | date: " + this.date + " | amount: " + this.amount + 
				" | Location: " + this.Location + " | Memo: " + this.Memo+" | Receiver: "+this.receiver);}
}