package accounting;

import java.util.Scanner;

public interface AccountingInput {
	
	public void setDate(int date);
	public void setAmount(int amount);
	public void setLocation(String location);
	public void setMemo(String memo);
	public int getDate();

	public void getUserInput(Scanner input);
	
	public void printInfo();

}
