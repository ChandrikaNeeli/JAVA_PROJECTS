package chandu;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTask3 {

	public static void main(String[] args) {
	  TreeSet<String>Productnames=new TreeSet<String>();
	  Productnames.add("Keyboard");
	  Productnames.add("Mouse");
	  Productnames.add("Monitor");
	  Productnames.add("Cpu");
	  Productnames.add("Webcam");
	  System.out.println("enter  productname:");
	  Scanner sc=new Scanner(System.in);
	  String input=sc.nextLine().toLowerCase();
	  if(Productnames.contains(input)){
		  System.out.println("Exists in Set");
		  
	  }else{
		  System.out.println(" Not Exists in Set");
	  }
	  sc.close();
	}
}
