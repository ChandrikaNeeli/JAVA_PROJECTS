package chandu;

import java.util.HashSet;

public class CheckNameExistsInHashset {

	public static void main(String[] args) {
		HashSet<String> food=new HashSet<String>();
		food.add("Fish");
		food.add("Annam");
		food.add("Chicken");
		String foodToCheck="Fish";
		if (food.contains(foodToCheck)) {
            System.out.println(foodToCheck + " exit in the set");
        } else {
            System.out.println(foodToCheck + " not exit in set");
        }
	}

}

