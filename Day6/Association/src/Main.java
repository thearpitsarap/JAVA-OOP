import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;

public class Main {
	
	public static Address getAddressFromUser(Scanner sc) {
		System.out.println("Please enter line1");
		String line1 = sc.nextLine();
		System.out.println("Please enter line2");
		String line2 = sc.nextLine();
		System.out.println("Please enter landmark");
		String landmark = sc.nextLine();
		System.out.println("Please enter pin");
		String pin = sc.nextLine();
		Address address = new Address(line1, line2, landmark, pin);
		return address;
	}
	

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Aadhar Numer : ");
		String aadharNumber = sc.nextLine();
		
		System.out.println("Enter Date of Birth : ");
		String DoB = sc.nextLine();
		
		Date constDate = DateUtils.getDate("15/08/1947");
		Date userDate = DateUtils.getDate(DoB);
				
		int compare = userDate.compareTo(constDate);
		
		System.out.println("Enter Address : ");
		Address adr = getAddressFromUser(sc);
		
		Person person = new Person(aadharNumber, name, userDate, adr);
		System.out.println(person);
		
		if(compare<1) {
			System.out.println("Person is born Before 15th August 1947");
		}
		else {
			System.out.println("Person is born After 15th August 1947");
		}
	}

}
