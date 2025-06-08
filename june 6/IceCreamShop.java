package chandu;

import java.util.LinkedList;
import java.util.Queue;

public class IceCreamShop {

	public static void main(String[] args) {
		Queue<String>kids=new LinkedList<String>();
		kids.add("chandu");
		kids.add("cutie");
		kids.add("puppy");
		kids.add("teddy");
		kids.add("sweety");
		System.out.println(kids);
		String firstOut= kids.poll();//peek()
		System.out.println(firstOut);
		kids.remove(kids);
		System.out.println(kids);
		kids.add("nana");
		System.out.println(kids);
		
		}

}
