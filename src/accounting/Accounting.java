package accounting;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Accounting implements AccountingInput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7553751942169260220L;
	
	protected AccountingKind kind = AccountingKind.Cash;
	public int date;
	protected int amount;
	protected String Location;
	protected String Memo;
	
	public Accounting() {}
	
	public Accounting(AccountingKind kind) {
		this.kind = kind;
	}
	
	public abstract void printInfo();
	
	
	public AccountingKind getKind() {
		return kind;
	}

	public void setKind(AccountingKind kind) {
		this.kind = kind;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date){
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getMemo() {
		return Memo;
	}

	public void setMemo(String memo) {
		Memo = memo;
	}
	
	public String getKindString() {
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
		default:
		}
		return akind;
		
	}
	
	public void setAccountingDate(Scanner input) {
		int date = -1;
		while(date == -1) {
			try {
				System.out.print("date+time(YYMMddhhmm) : ");
				date = input.nextInt();
				this.setDate(date);
			}catch(InputMismatchException e) {
				System.out.println("Please put an integer"); 
				if (input.hasNext()) {
					input.next();
				}
				date = -1;
			}
		}
	}
	public void setAccountingAmount(Scanner input) {
		int amount = -1;
		while(amount == -1) {
			try {
				System.out.print("amount: ");
				amount = input.nextInt();
				this.setAmount(amount);
			}catch(InputMismatchException e) {
				System.out.println("Please put an integer"); 
				if (input.hasNext()) {
					input.next();
				}
				amount = -1;
			}
		}
	}
	public void setAccountingLocation(Scanner input) {
		System.out.print("Location : ");
		this.setLocation(input.next());
	}
	public void setAccountingMemo(Scanner input) {
		System.out.print("Memo : ");
		this.setMemo(input.next());
	}
}

	
