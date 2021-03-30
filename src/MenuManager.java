import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		while (num != 6) {
			System.out.println("1. Add Spending");
			System.out.println("2. Delete Spending");
			System.out.println("3. Edit Spending");
			System.out.println("4. View Spending");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");	
			System.out.print("Select one number between 1-6: ");
			num = input.nextInt();

			if (num == 1) {
				addSpending();
			}if (num == 2) {
				deleteSpending();
			}if (num == 3) {
				editSpending();
			}if (num == 4) {
				viewSpending();
			}else {
				continue;}
		}
	}
	
	public static void addSpending() {
		Scanner input = new Scanner(System.in);
		System.out.print("date+time(YYMMddhhmm) : ");
		int date = input.nextInt();
		System.out.print("money: ");
		int money = input.nextInt();
		System.out.print("Payment method : ");
		String PaymentMethod = input.next();
		System.out.print("Location : ");
		String Location = input.next();
		System.out.print("Memo : ");
		String Memo = input.next();
	}
	
	public static void deleteSpending() {
		Scanner input = new Scanner(System.in);
		System.out.print("date+time(YYMMddhhmm) : ");
		int date = input.nextInt();	
	}
	
	public static void editSpending() {
		Scanner input = new Scanner(System.in);
		System.out.print("date+time(YYMMddhhmm) : ");
		int date = input.nextInt();	
	}
	
	public static void viewSpending() {
		Scanner input = new Scanner(System.in);
		System.out.print("date+time(YYMMddhhmm) : ");
		int date = input.nextInt();	
	}
}
