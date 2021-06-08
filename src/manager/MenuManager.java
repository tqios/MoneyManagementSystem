package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		AccountingManager accountingManager = getObject("accountingmanager.ser");
		if (accountingManager == null) {
				accountingManager = new AccountingManager(input);
		}
		else {
			accountingManager.setScanner(input);
		}

		WindowFrame frame = new WindowFrame(accountingManager);
		selectMenu(input, accountingManager);
		putObject(accountingManager, "accountingmanager.ser");
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
					logger.log("add a Accounting");
					break;
				case 2:
					accountingManager.deleteAccounting();
					logger.log("delete a Accounting");
					break;
				case 3:
					accountingManager.editAccounting();
					logger.log("edit a Accounting");
					break;
				case 4:
					accountingManager.viewAccounting();
					logger.log("view a Accounting");
					break; 
				case 5:
					accountingManager.viewAccountings();
					logger.log("view a Accountings");
					break;
				default:
					continue;
				}
			}catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1~6!"); 
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
	
	public static AccountingManager getObject(String filename) {
		AccountingManager accountingManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			accountingManager = (AccountingManager) in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return accountingManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return accountingManager;
	}
	
	public static void putObject(AccountingManager accountingManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(accountingManager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}