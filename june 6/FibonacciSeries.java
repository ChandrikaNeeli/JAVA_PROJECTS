package chandu;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number N:");
		int N =sc.nextInt();
		int a=0,b=1;
		System.out.println("Fibonacci series using loop");
		for (int i=0;i<N;i++ ) {
			System.out.println(a+" ");
			int next=a+b;
			a=b;
			b=next;
		}
         sc.close();
	}

}
