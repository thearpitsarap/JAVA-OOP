import java.util.Scanner;

class Two{

	public static void main(String[] args){
		int n = 7;
		for(int i=n;i>0;i-=2){
			for(int j=i;j>i/2;j--){
				System.out.print("*");
			}
			for(int k=1;k<n-i+1;k++){
				System.out.print(" ");
			}
			
			for(int l=i/2;l>=0;l--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

} 
