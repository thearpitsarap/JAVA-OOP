import java.util.Scanner;

class MobileNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder n = new StringBuilder(sc.nextLine());

		if( n.length()<10 || n.length()>13 || (n.charAt(0)=='+' && n.length()<11) ){
			System.out.println("Error");
			return;
		}

		for(int i=1;i<n.length();i++){
			if(n.charAt(i) - '0' < 0 || n.charAt(i) - '0' > 9){
				System.out.println("Error");
				return;
			}	
		}

		if ((n.charAt(0) != '+' && n.length() < 10) || (n.charAt(0) != '+' && n.length() > 10 && n.length() < 14)) {
    			System.out.println("Error");
    			return;
		}

		if ((n.charAt(0) == '+' && n.length() < 11) || (n.charAt(0) == '+' && n.length() != 13) ) {
                        System.out.println("Error");
                        return;
                }

		//3,7,11
		if(n.charAt(0)=='+' && n.length()==13){
			n.insert(3,'-');	
			n.insert(7,'-');	
			n.insert(11,'-');	
		}

		if(n.charAt(0) == '+' && n.length()==13){
			n.insert(0,'+');
			n.insert(1,"91");
			n.insert(3,'-');   
                        n.insert(7,'-');
                        n.insert(11,'-');
		}

		if(n.charAt(0)=='+' && n.length()==11){
			System.out.println("Erroe");
		}

		System.out.println(n);	
	}
}
