package accounting;

import java.util.Scanner;

public abstract class Accounting {
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
