import java.util.ArrayList;
import java.util.Scanner;

public class SpendingManager {
	ArrayList<Spending> spendings = new ArrayList<Spending>();
	Spending spending;
	Scanner input;
	SpendingManager(Scanner input){
		this.input = input;
	}

	
	public void addSpending() {
		spending = new Spending();
		System.out.print("date+time(YYMMddhhmm) : ");
		spending.setDate(input.nextInt());
		System.out.print("money: ");
		spending.setMoney(input.nextInt());
		System.out.print("Payment method : ");
		spending.setPaymentMethod(input.next());
		System.out.print("Location : ");
		spending.setLocation(input.next());
		System.out.print("Memo : ");
		spending.setMemo(input.next());
		spendings.add(spending);
	}
	
	public void deleteSpending() {
		System.out.print("date+time(YYMMddhhmm) : ");
		int date = input.nextInt();	
		if (spending == null) {
			System.out.println("the spending has not been registered");
			return;}
		if (findIndex(date) >= 0) {
			spendings.remove(findIndex(date));
			System.out.println("the spending is deleted");
		}else {
			System.out.println("please enter a valid value.");}
	}
	
	public void editSpending() {
		System.out.print("date+time(YYMMddhhmm) : ");
		int date = input.nextInt();	
		if (findIndex(date) >= 0) {
			Spending spending = spendings.get(findIndex(date));
			System.out.println("the spending to be edited is " + date);
			System.out.println("What do you want to edit it?");
			System.out.println("1. date\n2. money\n3. PaymentMethod\n4. Location\n5. Memo");
			System.out.print("Select one number between 1-5: ");
			int n = input.nextInt();
			switch(n) {
			case(1):{
				System.out.print("date+time(YYMMddhhmm) : ");
				spending.setDate(input.nextInt());
				break;
			}case(2):{
				System.out.print("money: ");
				spending.setMoney(input.nextInt());	
				break;
			}case(3):{
				System.out.print("Payment method : ");
				spending.setPaymentMethod(input.next());	
				break;
			}case(4):{
				System.out.print("Location : ");
				spending.setLocation(input.next());
				break;
			}case(5):{
				System.out.print("Memo : ");
				spending.setMemo(input.next());}
			}			
		}else {
			System.out.println("please enter a valid value.");}
	}
	
	public void viewSpending() {
		System.out.print("date+time(YYMMddhhmm) : ");
		int date = input.nextInt();	
		if (spending == null) {
			System.out.println("the spending has not been registered");
			return;}
		if (findIndex(date) >= 0) {
			Spending spending = spendings.get(findIndex(date));
			spending.printInfo();
		}else {
			System.out.println("please enter a valid value.");}
		/*int i = spend.indexOf(date);
		for(int i=0; i<spend.size(); i++) {
			int x=spend.get(i).date;
			printiInfo(x);}
		//spend.get(i).printInfo();
		
		if (spending.date == date) {
			spending.printInfo();
		}else {
			System.out.println("please enter a valid value.");}*/
	}
	
	public int findIndex(int date) {
		int idx= -1;
		for (int i=0; i<spendings.size(); i++) {
			if (date == spendings.get(i).date) {
				idx = i;
				break;}}

		return idx;
	}
}
