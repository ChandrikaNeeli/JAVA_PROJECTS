package chandu;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("chandu");
		names.add("teddy");
		names.add("forever");
		//before reverse
		System.out.println(names);
		Collections.reverse(names);
		//after reverse
		System.out.println(names);
		
	}

}
