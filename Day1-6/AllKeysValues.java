package chandu;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;

public class AllKeysValues {

	public static void main(String[] args) {
		HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "chandrika");
        students.put(2, "charith");
        students.put(3, "teddy");
        students.put(4, "akhila");
        students.put(5, "ram");

        // Print all keys
        Set<Integer> keys = students.keySet();
        System.out.println("Keys: " + keys);

        // Print all values
        Collection<String> values = students.values();
        System.out.println("Values: " + values);

        // Print all key-value pairs
        Set<Entry<Integer, String>> entries = students.entrySet();
        System.out.println("Key-Value pairs:");
        for (Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

	

	}

