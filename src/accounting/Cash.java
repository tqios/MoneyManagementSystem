package accounting;

import java.util.Scanner;

public class Cash extends Accounting implements AccountingInput{
	
	public Cash(AccountingKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {

		System.out.print("date+time(YYMMddhhmm) : ");
		this.setDate(input.nextInt());
		System.out.print("amount: ");
		this.setAmount(input.nextInt());
		System.out.print("Location : ");
		this.setLocation(input.next());
		System.out.print("Memo : ");
		this.setMemo(input.next());}
	
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
				" | Location: " + this.Location + " | Memo: " + this.Memo);}

}
