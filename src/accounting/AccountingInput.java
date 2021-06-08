package accounting;

import java.util.Scanner;

public interface AccountingInput {
	
	public void setDate(int date);
	public void setAmount(int amount);
	public void setLocation(String location);
	public void setMemo(String memo);
	public int getDate();
	public int getAmount();
	public String getLocation();
	public String getMemo();
	
	public void getUserInput(Scanner input);
	
	public void printInfo(); 
	
	public void setAccountingDate(Scanner input);
	public void setAccountingAmount(Scanner input);
	public void setAccountingLocation(Scanner input);
	public void setAccountingMemo(Scanner input);
}
