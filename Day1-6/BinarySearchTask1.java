package chandu;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTask1 {
	public static void main(String[] args) {
		String[] names= {"Amit","Divya","Karan","Priya","Zoya"};
		Scanner sc=new Scanner(System.in);
		String inputName=sc.nextLine();
		int result=Arrays.binarySearch(names,inputName);
		if(result>=0) {
			System.out.println(inputName+" "+"name exists"+" "+result +" .");
		}else {
			System.out.println(inputName+" "+"name not exists.");
		}
	}

}
