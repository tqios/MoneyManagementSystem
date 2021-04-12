import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountingManager accountingManager = new AccountingManager(input);
		int num = 0;
		while (num != 6) {
			System.out.println("1. Add accounting");
			System.out.println("2. Delete accounting");
			System.out.println("3. Edit accounting");
			System.out.println("4. View accounting");
			System.out.println("5. View accountings");
			System.out.println("6. Exit");	
			System.out.print("Select one number between 1-6: ");
			num = input.nextInt();

			if (num == 1) {
				accountingManager.addAccounting();
			}if (num == 2) {
				accountingManager.deleteAccounting();
			}if (num == 3) {
				accountingManager.editAccounting();
			}if (num == 4) {
				accountingManager.viewAccounting();
			}if (num == 5) {
				accountingManager.viewAccountings();
			}else {
				continue;}
		}
	}
}
