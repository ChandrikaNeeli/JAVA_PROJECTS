package chandu;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> cities=new ArrayList<String>();
		cities.add("mumbai");
		cities.add("kerala");
		cities.add("delhi");
		cities.add("manali");
		cities.add("mysure");
		System.out.println(cities);
		System.out.println(cities.get(0));
		cities.set(0, "chennai");
		System.out.println(cities);
		cities.remove(2);
		System.out.println(cities);

	}

}
