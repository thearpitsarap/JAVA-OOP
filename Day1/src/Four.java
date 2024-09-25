import java.util.Scanner;

class Four{

	static int usingLoop(int n){
		int sum=1,m=0;
		for(int i=0;i<n;i++){
			m=n%10;
			sum+=m;
			n=n/10;
		}
		return sum;
	}

	static int usingRecursion(int n){
		if(n==0){
			return n;
		}
		usingRecursion(n%10);
		int sum=1;
		int m=n%10;
		sum+=m;
		n=n/10;
		return sum;

	}

	public static void main(String[] args){
		System.out.println("Factorial using loop : "+usingLoop(12345));	
		System.out.println("Factorial using Recursion : "+usingLoop(12345));	
	}
}
