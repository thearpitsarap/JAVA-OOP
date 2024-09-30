import java.util.Date;

public abstract class Account {
	
		private static int generator=101;
		protected int accNumber;
		protected String holderName;
		protected double amount;
		protected Date date;
		
		public Account() {
			this.accNumber = 0;
			this.holderName = "";
			this.amount = 0;
			this.date = null;
		}
		
		public Account(String holderName, double amount,Date d) {
			this.accNumber = generator;
			this.holderName = holderName;
			this.amount = amount;
			this.date = d;
			generator++;
		}
		
		public abstract double applyIntrest();

		public int getNumber() {
			return this.accNumber;
		}	
}
