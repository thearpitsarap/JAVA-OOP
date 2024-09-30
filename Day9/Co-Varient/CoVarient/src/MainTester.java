
public class MainTester {

	public static void main(String[] args) {
		SuperClass s = new SuperClass();
		System.out.println(s.add(11, 11));
		
		SubClass s1 = new SubClass();
		System.out.println(s1.add(5, 5));

	}

}
