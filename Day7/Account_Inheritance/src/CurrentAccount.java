import java.util.Date;

public class CurrentAccount extends Account {

	public CurrentAccount(String name, double amount,Date d){
		super(name,amount,d);
	}
	
	@Override
	public double applyIntrest() {
		return amount * 0.01;
	}
	
	@Override
	public String toString() {
		return "Account No - " + accNumber + " Holder Name - " + holderName + " Amount - " + amount + " Date - " + date + " Interest Amount " + applyIntrest();
	}
}
