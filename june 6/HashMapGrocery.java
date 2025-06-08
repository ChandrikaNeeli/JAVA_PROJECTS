package chandu;

import java.util.HashMap;

public class HashMapGrocery {

	public static void main(String[] args) {
		HashMap<String,Integer>storeitems=new HashMap<String,Integer>();
		storeitems.put("Apple", 50);
		storeitems.put("Milk", 40);
		storeitems.put("Ice Cream", 60);
		storeitems.put("Groundnuts", 80);
		storeitems.put("dall",70);
		System.out.println(storeitems);
		int sum=0;
		for(int value :storeitems.values()) {
			sum +=value;
		}
		System.out.println(sum);
		storeitems.replace("Ice Cream", 60, 100);
		System.out.println(storeitems);
		storeitems.remove("dall");
		System.out.println(storeitems);

	}

}
