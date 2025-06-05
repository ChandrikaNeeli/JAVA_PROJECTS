package chandu;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		 
		int low=0,high=n,answer=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(mid*mid<=n) {
				answer=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		System.out.println("Square root of"+" "+n+ " "+"is"+" "+answer);
		sc.close();
	}

}
