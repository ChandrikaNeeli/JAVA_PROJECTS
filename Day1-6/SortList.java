package chandu;
import java.util.ArrayList;
import java.util.Collections;

public class SortList {

	public static void main(String[] args) {
		ArrayList<String> food=new ArrayList<String>();
		food.add("Fish");
		food.add("Annam");
		food.add("Chicken");
		System.out.println(food);
		//sort the elements
		Collections.sort(food);
		System.out.println(food);
		

	}

}
