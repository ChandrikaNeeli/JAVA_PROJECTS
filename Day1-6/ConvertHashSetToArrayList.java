package chandu;
import java.util.HashSet;
import java.util.ArrayList;

public class ConvertHashSetToArrayList {

	public static void main(String[] args) {
		HashSet<String> namesSet=new HashSet<String>();
		namesSet.add("Chandrika");
		namesSet.add("Charith");
		namesSet.add("Teddy");
		ArrayList<String> namesList=new ArrayList<String>(namesSet);
		System.out.println(namesList);
	}

}