import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException{

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
	
					acc[count] = new SavingAccount(name, amt, dt);
					System.out.println("Your Account Number is : " + acc[count].getNumber());
					count++;
				}break;
				
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
				}break;
				
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
				}break;
				
				case 4: {
					System.out.println("Enter Account Number ");
					int num = sc.nextInt();
					
					for(int i=0;i<count;i++) {
						if(acc[i].getNumber() == num) {
							System.out.println(acc[i].toString());
							break;
						}
					}
				}break;
			}
		} while (choice != 0 && count<10);
	}

}
