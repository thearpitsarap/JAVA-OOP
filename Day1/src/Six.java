import java.util.Scanner;

class Six{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number : ");
		int n = sc.nextInt();

		if(n<=50){
			System.out.println("Pass Class");
		}
		else if(n>50 && n<=60){
			System.out.println("Second Class");
		}
		else if(n>60 && n<=75){
			System.out.println("First Class");
		}
		else{
			System.out.println("Extension");
		}
	}
}
