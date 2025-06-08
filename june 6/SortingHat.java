package chandu;

import java.util.Scanner;

public class SortingHat {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number of students:");
       int n= sc.nextInt();
       sc.nextLine();
       String[] names=new String[n];
       System.out.println("enter names of student:");
       for(int i=0;i<n;i++) {
    	   names[i]=sc.nextLine();
       }
       for(int i=0;i<names.length-1;i++) {
			for(int j=0;j<names.length-1;j++) {
				if( names[j].compareToIgnoreCase(names[j+1])>0){
					String temp=names[j];
					names[j]=names[j+1];
					names[j+1]=temp;
				}
			}
       }
       System.out.println("Sorted students names:");
       for(String name:names) {

    	   System.out.println(name);
       }
       sc.close();
	}
}

