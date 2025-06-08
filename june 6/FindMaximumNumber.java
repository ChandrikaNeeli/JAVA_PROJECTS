package chandu;

import java.util.Scanner;

public class FindMaximumNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] numbers=new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Number"+(i+1)+":");
		    numbers[i]=sc.nextInt();
		}
		int max=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		System.out.println("The biggest number is:"+" "+max);
		
		sc.close();
	}

}
