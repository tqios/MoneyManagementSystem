import java.util.Scanner;

public class SpendingManager {
	Spending spending;
	Scanner input;
	SpendingManager(Scanner input){
		this.input = input;
	}

	
	public void addSpending() {
		spending = new Spending();
		System.out.print("date+time(YYMMddhhmm) : ");
		spending.date = input.nextInt();
		System.out.print("money: ");
		spending.money = input.nextInt();
		System.out.print("Payment method : ");
		spending.PaymentMethod = input.next();
		System.out.print("Location : ");
		spending.Location = input.next();
		System.out.print("Memo : ");
		spending.Memo = input.next();
	}
	
	public void deleteSpending() {
		System.out.print("date+time(YYMMddhhmm) : ");
		int date = input.nextInt();	
		if (spending == null) {
			System.out.println("the spending has not been registered");
			return;}
		if (spending.date == date) {
			spending = null;
			System.out.println("the spending is deleted");}
		else {
			System.out.println("please enter a valid value.");}
	}
	
	public void editSpending() {
		System.out.print("date+time(YYMMddhhmm) : ");
		int date = input.nextInt();	
		if (spending.date == date) {
			System.out.println("the spending to be edited is " + date);
			System.out.println("What do you want to edit it?");
			System.out.println("1. date\n2. money\n3. PaymentMethod\n4. Location\n5. Memo");
			System.out.print("Select one number between 1-5: ");
			int n = input.nextInt();
			switch(n) {
			case(1):{
				spending = new Spending();
				System.out.print("date+time(YYMMddhhmm) : ");
				spending.date = input.nextInt();
				break;
			}case(2):{
				System.out.print("money: ");
				spending.money = input.nextInt();	
				break;
			}case(3):{
				System.out.print("Payment method : ");
				spending.PaymentMethod = input.next();	
				break;
			}case(4):{
				System.out.print("Location : ");
				spending.Location = input.next();
				break;
			}case(5):{
				System.out.print("Memo : ");
				spending.Memo = input.next();}
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
		if (spending.date == date) {
			spending.printInfo();
		}else {
			System.out.println("please enter a valid value.");}
	}
}
