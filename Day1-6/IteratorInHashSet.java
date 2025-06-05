package chandu;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorInHashSet {
	public static void main(String[] args) {
		HashSet<String> namesSet=new HashSet<String>();
		namesSet.add("Chandrika");
		namesSet.add("Charith");
		namesSet.add("Teddy");
	    Iterator<String> iterator= namesSet.iterator();
	    while (iterator.hasNext()) {
        String name = iterator.next();
	    System.out.println(name);
	}
	}
}
