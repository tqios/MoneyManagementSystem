package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import accounting.Accounting;
import accounting.AccountingKind;
import accounting.Cash;
import accounting.Credit;
import accounting.Transfar;
import accounting.AccountingInput;

public class AccountingManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8800217314767934609L;
	
	ArrayList<AccountingInput> accountings = new ArrayList<AccountingInput>();
	Accounting accounting;
	Credit income;
	transient Scanner input;
	AccountingManager(Scanner input){
		this.input = input;
	}

	
	public void addAccounting() {		
		int kind = 0;
		AccountingInput accountingInput;
		while (kind !=1 && kind !=2 && kind !=3) {
			try {
				System.out.println("1. Credit\n2. Cash\n3. Transfar");
				System.out.print("Select num for Accounting kind between 1~3: ");
				kind = input.nextInt();
				if (kind == 1) {
					accountingInput = new Credit(AccountingKind.Credit);
					accountingInput.getUserInput(input);
					accountings.add(accountingInput);
					break;
				}else if (kind == 2) {
					accountingInput = new Cash(AccountingKind.Cash);
					accountingInput.getUserInput(input);
					accountings.add(accountingInput);
					break;
				}else if (kind == 3) {
				accountingInput = new Transfar(AccountingKind.Transfar);
				accountingInput.getUserInput(input);
				accountings.add(accountingInput);
				break;
				}else {
					System.out.println("Select num for Acounting kind between 1 and 3");
				}	
			}catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1~3!"); 
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	public void deleteAccounting() {
		System.out.print("date+time(YYMMddhhmm) : ");
		int date = input.nextInt();	
		if (accounting == null) {
			System.out.println("the spending has not been registered");
			return;}
		removefromAccounting(date);
	}
	
	public int removefromAccounting(int date) {
		if (findIndex(date) >= 0) {
			accountings.remove(findIndex(date));
			System.out.println("the spending ("+date+") is deleted");
			return 1;
		}else {
			System.out.println("please enter a valid value.");}
		return -1;
	}
	
	public void editAccounting() {
		System.out.print("date+time(YYMMddhhmm) : ");
		int date = input.nextInt();	
		if (findIndex(date) >= 0) {
			AccountingInput accounting = accountings.get(findIndex(date));
			System.out.println("the spending to be edited is " + date);
			int n = -1;
			while (n !=5) {
				showEditMenu();
				n = input.nextInt();
				switch(n) {
				case(1):{
					System.out.print("date+time(YYMMddhhmm) : ");
					accounting.setDate(input.nextInt());
					break;
				}case(2):{
					System.out.print("amount: ");
					accounting.setAmount(input.nextInt());	
					break;
				}case(3):{
					System.out.print("Location : ");
					accounting.setLocation(input.next());
					break;
				}case(4):{
					System.out.print("Memo : ");
					accounting.setMemo(input.next());
					break;
				}default:{
					break;
				}
				} //switch
			}//while
		}else {
			System.out.println("please enter a valid value.");}//if
	}
	
	public void viewAccounting() {
		System.out.print("date+time(YYMMddhhmm) : ");
		int date = input.nextInt();	
		if (accounting == null) {
			System.out.println("the spending has not been registered");
			return;}
		if (findIndex(date) >= 0) {
			Accounting income = (Accounting) accountings.get(findIndex(date));
			income.printInfo();
		}else {
			System.out.println("please enter a valid value.");}}
	
	public void viewAccountings() {
		System.out.println("# of registered accountings: "+accountings.size());
		for (int i=0; i<accountings.size(); i++) {
			(accountings.get(i)).printInfo();}
		}
	public void setScanner(Scanner input) {
		this.input = input;
	}
		
	
	public int findIndex(int date) {
		int idx= -1;
		for (int i=0; i<accountings.size(); i++) {
			if (date == accountings.get(i).getDate()) {
				idx = i; 
				break;}}
		return idx;
	}
	
	
	public int size() {
		return accountings.size();
	}
	
	public AccountingInput get(int index) {
		return (Accounting) accountings.get(index);
	}
	 
	
	public void showEditMenu() {
		System.out.println("== Spending Info Edit Menu ==");
		System.out.println("1. Edit date\n2. Edit amount\n3. "
				+ "Edit Location\n4. Edit Memo\n5. Exit");
		System.out.print("Select one number between 1-6: ");
	}
}
