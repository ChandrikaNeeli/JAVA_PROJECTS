package chandu;

import java.util.ArrayList;
import java.util.Collections;

public class SortingString {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("chandu");
		names.add("charith");
		names.add("akhila");
	System.out.println("before sorting strings:"+names);
	     Collections.sort(names);
	 System.out.println("after sorting strings:"+names);
		
	}

}

