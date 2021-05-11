import java.util.ArrayList;
import java.util.Scanner;

import accounting.Accounting;
import accounting.AccountingKind;
import accounting.Cash;
import accounting.Credit;
import accounting.Transfar;
import accounting.AccountingInput;

public class AccountingManager {
	ArrayList<AccountingInput> accountings = new ArrayList<AccountingInput>();
	Accounting accounting;
	Credit income;
	Scanner input;
	AccountingManager(Scanner input){
		this.input = input;
	}

	
	public void addAccounting() {
		
		int kind = 0;
		AccountingInput accountingInput;
		while (kind !=1 && kind !=2 && kind !=3) {
			System.out.println("1. Credit\n2. Cash\n3. Transfar");
			System.out.print("Select num for Accounting kind: ");
			kind = input.nextInt();
			if (kind == 1) {
				accountingInput = new Credit(AccountingKind.Credit);
				accountingInput.getUserInput(input);
				accountings.add(accountingInput);
			}else if (kind == 2) {
				accountingInput = new Cash(AccountingKind.Cash);
				accountingInput.getUserInput(input);
				accountings.add(accountingInput);
			}else if (kind == 3) {
			accountingInput = new Transfar(AccountingKind.Transfar);
			accountingInput.getUserInput(input);
			accountings.add(accountingInput);
			}else {
				System.out.println("Select num for Acounting kind between 1 and 3");
				break;
			}	
			
	}}
	
	public void deleteAccounting() {
		System.out.print("date+time(YYMMddhhmm) : ");
		int date = input.nextInt();	
		if (accounting == null) {
			System.out.println("the spending has not been registered");
			return;}
		if (findIndex(date) >= 0) {
			accountings.remove(findIndex(date));
			System.out.println("the spending ("+date+") is deleted");
		}else {
			System.out.println("please enter a valid value.");}
	}
	
	public void editAccounting() {
		System.out.print("date+time(YYMMddhhmm) : ");
		int date = input.nextInt();	
		if (findIndex(date) >= 0) {
			AccountingInput accountingInput = accountings.get(findIndex(date));
			int n = -1;
			while (n !=6) {
				System.out.println("the spending to be edited is " + date);
				System.out.println("== Spending Info Edit Menu ==");
				System.out.println("1. Edit date\n2. Edit amount\n3. "
						+ "Edit Location\n4. Edit Memo\n5. Exit");
				System.out.print("Select one number between 1-6: ");
				n = input.nextInt();
				switch(n) {
				case(1):{
					System.out.print("date+time(YYMMddhhmm) : ");
					accountingInput.setDate(input.nextInt());
					break;
				}case(2):{
					System.out.print("amount: ");
					accountingInput.setAmount(input.nextInt());	
					break;
				}case(3):{
					System.out.print("Location : ");
					accountingInput.setLocation(input.next());
					break;
				}case(4):{
					System.out.print("Memo : ");
					accountingInput.setMemo(input.next());
				}case(5):{
					break;}
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
		
	
	public int findIndex(int date) {
		int idx= -1;
		for (int i=0; i<accountings.size(); i++) {
			if (date == accountings.get(i).getDate()) {
				idx = i; 
				break;}}
		return idx;
	}
}
