import java.util.Scanner;

public class Three{

	static double CompoundInt(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Principle Amount ");
		double p = sc.nextDouble();
		System.out.println("Enter Rate of Interest ");
		float r = sc.nextFloat();
		System.out.println("Enter Number of times interestapplied ");
		int n = sc.nextInt();
		System.out.println("Enter Time Period ");
		int t = sc.nextInt();
		
		float t1 = r/n;
		t1 = 1 + t1;
		double t2 = Math.pow(t1,n*t);
		double ans = p*t2;

		return ans;
	}

	static double SimpleInt(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Principle Amount ");
		double p = sc.nextDouble();
		System.out.println("Enter Annual Rate of Interest ");
		float r = sc.nextFloat();
		System.out.println("Enter Time Period ");
		float t = sc.nextFloat();
		
		double ans = (p*r*t)/100;
		return ans;	
	}

	public static void main(String[] args){
		System.out.println("Enter Your Choice : ");
		System.out.println("1 : Compund Interest");	
		System.out.println("2 : Simple Interest");	

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();

		switch(c){
			case 1:
				System.out.println("Compund Interest : " + CompoundInt());	
				break;
			case 2:
				System.out.println("Simple Interest : " + SimpleInt());	
				break;
		}
	}
}
