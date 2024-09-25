import java.util.Scanner;

public class Two{

	static int Add(int a,int b){
		return a+b;
	}

	static int Sub(int a,int b){
		return a-b;
	}

	static int Div(int a,int b){
		return a/b;
	}
	static int Multi(int a,int b){
		return a*b;
	}

	public static void main(String[] args){
		char ch = 'n';

		do{
			
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your choice : ");
			System.out.println("1 : Add");
			System.out.println("2 : Subtract");
			System.out.println("3 : Multiply");
			System.out.println("4 : Division ");
			int c = sc.nextInt();
			int x=0,y=0;
			switch(c){
				case 1:
					System.out.println("Enter two numbers ");
					x = sc.nextInt();
					y = sc.nextInt();
					System.out.println("Addition is : "+Add(x,y));
					break;
				case 2:
					System.out.println("Enter two numbers ");
					x = sc.nextInt();
					y = sc.nextInt();
					System.out.println("Subtraction is : "+Sub(x,y));
					break;
				case 3:
					System.out.println("Enter two numbers ");
					x = sc.nextInt();
					y = sc.nextInt();
					System.out.println("Multiplication is : "+Multi(x,y));
					break;
				case 4:
					System.out.println("Enter two numbers ");
					x = sc.nextInt();
					y = sc.nextInt();
					System.out.println("Division is : "+Div(x,y));
					break;
			}

			System.out.println("Do you want to continue ? y/n ? ");
			ch = sc.next().charAt(0);

		}while(ch!='n');
	}

}
