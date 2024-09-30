import java.util.Date;

public class SavingAccount extends Account{
	
	public SavingAccount( String name, double amount,Date d){
		super(name,amount,d);
	}
	
	@Override
	public double applyIntrest() {
		return amount * 0.03;
	}
	
	@Override
	public String toString() {
		return "Account No - " + accNumber + " Holder Name - " + holderName + " Amount - " + amount + " Date - " + date + "Interest on Amount is " + applyIntrest();
	}
}
