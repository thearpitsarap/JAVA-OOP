import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.cdac.acts.MinimumBalanceException;
import com.cdac.acts.AccountTypes.Account;
import com.cdac.acts.AccountTypes.CurrentAccount;
import com.cdac.acts.AccountTypes.DepositAccount;
import com.cdac.acts.AccountTypes.SavingsAccount;
import com.cdac.acts.MyEnums.Depositable;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int choice = 0;
		Account acc[] = new Account[10];

		do {
			System.out.println("Enter your Choice : ");
			System.out.println("1 - Savings Account : ");
			System.out.println("2 - Current Account : ");
			System.out.println("3 - Deposite Account :  ");
			System.out.println("4 - Show Account Info By number  ");
			System.out.println("5 - Deposite Account :  ");
			System.out.println("6 - Withdraw Account :  ");

			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				sc.nextLine();
				System.out.println("Enter your Name : ");
				String name = sc.nextLine();

				System.out.println("Enter Amount : ");
				double amt = sc.nextDouble();
				sc.nextLine();

				System.out.println("Enter Date in dd/mm/yyyy Fromat : ");
				String date = sc.nextLine();
				Date dt = DateUtils.getDate(date);

				acc[count] = new SavingsAccount(name, amt, dt);
				System.out.println("Your Account Number is : " + acc[count].getNumber());
				count++;
			}
				break;

			case 2: {
				sc.nextLine();
				System.out.println("Enter your Name : ");
				String name = sc.nextLine();

				System.out.println("Enter Amount : ");
				double amt = sc.nextDouble();
				sc.nextLine();

				System.out.println("Enter Date in dd/mm/yyyy Fromat : ");
				String date = sc.nextLine();
				Date dt = DateUtils.getDate(date);

				acc[count] = new CurrentAccount(name, amt, dt);
				System.out.println("Your Account Number is : " + acc[count].getNumber());
				count++;
			}
				break;

			case 3: {
				sc.nextLine();
				System.out.println("Enter your Name : ");
				String name = sc.nextLine();

				System.out.println("Enter Amount : ");
				double amt = sc.nextDouble();
				sc.nextLine();

				System.out.println("Enter Date in dd/MM/yyyy Fromat : ");
				String date = sc.nextLine();
				Date dt = DateUtils.getDate(date);

				acc[count] = new DepositAccount(name, amt, dt);
				System.out.println("Your Account Number is : " + acc[count].getNumber());
				count++;
			}
				break;

			case 4: {
				System.out.println("Enter Account Number ");
				int num = sc.nextInt();
				for (int i = 0; i < count; i++) {
					if (acc[i].getNumber() == num) {
						System.out.println(acc[i].toString());
					}
				}
			}
				break;
			case 5: {
				System.out.println("Enter Account Number ");
				int num = sc.nextInt();
				for (int i = 0; i < count; i++) {
					if (acc[i].getNumber() == num) {
						System.out.println("Enter Amount :");
						double am = sc.nextDouble();
						if (acc[i] instanceof CurrentAccount) {
							CurrentAccount c = (CurrentAccount) acc[i];
							c.Deposit(am);
						}

						if (acc[i] instanceof SavingsAccount) {
							SavingsAccount c = (SavingsAccount) acc[i];
							c.Deposit(am);
						}
						System.out.println(acc[i].toString());
					}
				}
			}
				break;
			case 6: {
				System.out.println("Enter Account Number ");
				int num = sc.nextInt();

				for (int i = 0; i < count; i++) {
					if (acc[i].getNumber() == num) {
						try {
							System.out.println("Enter Amount :");
							double am = sc.nextDouble();
							if (am < 100) {
								throw new MinimumBalanceException("Amount less than 100");
							}
							if (acc[i] instanceof CurrentAccount) {
								CurrentAccount c = (CurrentAccount) acc[i];
								c.withdraw(am);
							}

							if (acc[i] instanceof SavingsAccount) {
								SavingsAccount c = (SavingsAccount) acc[i];
								c.withdraw(am);
							}
						} catch (MinimumBalanceException e) {
							System.out.println(e.getMessage());
						}
						System.out.println(acc[i].toString());
					}
				}
			}
				break;
			case 7: {
				System.out.println("Enter Account Number ");
				int num = sc.nextInt();
				for (int i = 0; i < count; i++) {
					if (acc[i].getNumber() == num) {
						System.out.println(acc[i].toString());
					}
				}
			}
				break;
			}
		} while (choice != 0 && count < 10);
	}

}
