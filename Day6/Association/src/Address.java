
public class Address {
	private String line1;
	private String line2;
	private String line3;
	private String pin;
	
	public Address(String l1, String l2, String l3, String p) {
		this.line1 = l1;
		this.line2 = l2;
		this.line3 = l3;
		this.pin = p;
	}
	
	@Override
	public String toString() {
		return "line1 = " + line1 + " line2 = " + line2 + " line3 = " + line3 + " pin = " + pin; 
	}
	
}
