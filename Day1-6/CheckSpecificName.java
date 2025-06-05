package chandu;

import java.util.ArrayList;

public class CheckSpecificName {

	public static void main(String[] args) {
		ArrayList<String> food=new ArrayList<String>();
		food.add("Fish");
		food.add("Annam");
		food.add("Chicken");
		String foodToCheck="gobi";
		if (food.contains(foodToCheck)) {
            System.out.println(foodToCheck + " is in the list.");
        } else {
            System.out.println(foodToCheck + " is not in the list");
        }
	}

}