import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountingManager accountingManager = new AccountingManager(input);
		selectMenu(input, accountingManager);
	}
	public static void selectMenu(Scanner input, AccountingManager accountingManager) {
		int num = 0;
		while (num != 6) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					accountingManager.addAccounting();
					break;
				case 2:
					accountingManager.deleteAccounting();
					break;
				case 3:
					accountingManager.editAccounting();
					break;
				case 4:
					accountingManager.viewAccounting();
					break; 
				case 5:
					accountingManager.viewAccountings();
					break;
				default:
					continue;
				}
			}catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 6!"); 
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("1. Add accounting");
		System.out.println("2. Delete accounting");
		System.out.println("3. Edit accounting");
		System.out.println("4. View accounting");
		System.out.println("5. View accountings");
		System.out.println("6. Exit");	
		System.out.print("Select one number between 1-6: ");
	}
}