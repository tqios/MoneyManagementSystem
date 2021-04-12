package accounting;

import java.util.Scanner;

public class Accounting {
	protected AccountingKind kind = AccountingKind.Cash;
	public int date;
	protected int amount;
	protected String Location;
	protected String Memo;
	
	public Accounting() {}

	
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
			System.out.println("date: " + this.date + " | amount: " + this.amount + 
					" | Location: " + this.Location + " | Memo: " + this.Memo);
	}
	
	
	public AccountingKind getKind() {
		return kind;
	}

	public void setKind(AccountingKind kind) {
		this.kind = kind;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
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

	
	}	
