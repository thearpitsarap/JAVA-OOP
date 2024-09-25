import java.util.Scanner;

class One{

	public static void main(String[] args){
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for(int i=0;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
