import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SpendingManager spendingManager = new SpendingManager(input);
		int num = 0;
		while (num != 5) {
			System.out.println("1. Add Spending");
			System.out.println("2. Delete Spending");
			System.out.println("3. Edit Spending");
			System.out.println("4. View Spending");
			System.out.println("5. Exit");	
			System.out.print("Select one number between 1-5: ");
			num = input.nextInt();

			if (num == 1) {
				spendingManager.addSpending();
			}if (num == 2) {
				spendingManager.deleteSpending();
			}if (num == 3) {
				spendingManager.editSpending();
			}if (num == 4) {
				spendingManager.viewSpending();
			}else {
				continue;}
		}
	}
}
