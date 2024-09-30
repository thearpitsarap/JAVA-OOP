import java.util.Date;

public class Person {
	private String aadharNumber;
	private String name;
	private Date DateOfBirth;
	private Address address;

	public Person(String an, String n, Date d, Address adr) {
		this.aadharNumber = an;
		this.name = n;
		this.DateOfBirth = d;
		this.address = adr;
	}

	@Override
	public String toString() {
		return "Aadhar Number : " + aadharNumber + " Name : " + name + " Date of Birth " + DateOfBirth + "Address : "
				+ address.toString();
	}
}
