package accounting;

import java.util.Scanner;

public class Credit extends Accounting {
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
		System.out.print("date+time(YYMMddhhmm) : ");
		date = input.nextInt();
		this.setDate(date);
		System.out.print("amount: ");
		int amount = input.nextInt();
		this.setAmount(amount);
		System.out.print("Location : ");
		String Location = input.next();
		this.setLocation(Location);
		System.out.print("Memo : ");
		String Memo = input.next();
		this.setMemo(Memo);
		System.out.print("bank : ");
		this.setBank(input.next());
	}
	
	public void printInfo() {
		String akind = "none";
		switch(this.kind){
		case Cash:
			akind = "Cash";
			break;
		case Credit:
			akind = "Credit";
			break;
		case Transfar:
			akind = "Transfar";
			break;
		}
		
		System.out.println("kind: " + akind + " | date: " + this.date + " | amount: " + this.amount + 
				" | Location: " + this.Location + " | Memo: " + this.Memo +
				" | Bank: " + this.bank);}
}