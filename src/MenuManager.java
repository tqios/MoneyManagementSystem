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
			switch(num) {
			case 1:
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
				break;
			case 2:
				System.out.print("date+time(YYMMddhhmm) : ");
				int date_del = input.nextInt();
				break;
			case 3:
				System.out.print("date+time(YYMMddhhmm) : ");
				int date_edit = input.nextInt();
				break;
			case 4:
				System.out.print("date+time(YYMMddhhmm) : ");
				int date_view = input.nextInt();
				break;
			}
		}
	}
}
