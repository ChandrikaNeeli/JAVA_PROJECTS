package chandu;

import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {
		TreeSet<Integer>BookIds=new TreeSet<Integer>();
		BookIds.add(5002);
		BookIds.add(4998);
		BookIds.add(5005);
		BookIds.add(4999);
		BookIds.add(5001);
		System.out.println(BookIds);
		System.out.println(BookIds.first());
		System.out.println(BookIds.last());
		System.out.println(BookIds.higher(4999));
		System.out.println(BookIds.lower(5005));
	
	}

}
