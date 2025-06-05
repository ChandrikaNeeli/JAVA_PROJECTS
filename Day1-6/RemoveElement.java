package chandu;
import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        
        System.out.println("Original list: " + fruits);

       //using index value
        fruits.remove(2);
       //using value
        fruits.remove("Date");

       
        System.out.println("Updated list: " + fruits);
 
    }

}

