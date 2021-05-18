package accounting;

import java.util.Scanner;

public class Cash extends Accounting{
	
	public Cash(AccountingKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setAccountingDate(input);
		setAccountingAmount(input);
		setAccountingLocation(input);
		setAccountingMemo(input);
	}
	
	public void printInfo() {

		String akind = getKindString();
		System.out.println("kind: " + akind + " | date: " + this.date + " | amount: " + this.amount + 
				" | Location: " + this.Location + " | Memo: " + this.Memo);}

}
