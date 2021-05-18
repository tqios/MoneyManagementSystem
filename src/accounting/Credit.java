package accounting;

import java.util.Scanner;

public class Credit extends Accounting{
	protected String bank ;

	public Credit(AccountingKind kind) {
		super(kind);
	}
	
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public void getUserInput(Scanner input) {
		setAccountingDate(input);
		setAccountingAmount(input);
		setAccountingLocation(input);
		setAccountingMemo(input);
		setAccountingbank(input);
	}
	public void setAccountingbank(Scanner input) {
		System.out.print("bank : ");
		this.setBank(input.next());
	}
	
	public void printInfo() {

		String akind = getKindString();
		System.out.println("kind: " + akind + " | date: " + this.date + " | amount: " + this.amount + 
				" | Location: " + this.Location + " | Memo: " + this.Memo +" | Bank: "+this.bank);}
	

}