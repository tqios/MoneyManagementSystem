
public class Spending {
	int date;
	int money;
	String PaymentMethod;
	String Location;
	String Memo;
	static int numSpendingRegistered =0;
	
	public Spending() {
	}
	
	public Spending(int date, int money, String paymentMethod, String location, String memo) {
		if (date<=0) {
			System.out.println("please enter a valid value.");}
		else {
		this.date = date;}
		if (date<0) {
			System.out.println("please enter a valid value.");}
		else {
		this.money = money;}
		this.PaymentMethod = paymentMethod;
		this.Location = location;
		this.Memo = memo;
	}
	
	public Spending(int date, int money, String paymentMethod, String location) {
		this.date = date;
		this.money = money;
		this.PaymentMethod = paymentMethod;
		this.Location = location;
	}
	
	public void printInfo() {
		System.out.println("date: " + this.date + " | money: " + money + " | PaymentMethod: "
				+ this.PaymentMethod + " | Location: " + this.Location + " | Memo: " + this.Memo);		
	}	
}
