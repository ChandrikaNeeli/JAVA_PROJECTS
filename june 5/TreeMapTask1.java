package chandu;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapTask1 {

	public static void main(String[] args) {
		TreeMap<String,String>CountryCapital=new TreeMap<String,String> ();
		CountryCapital.put("India","Delhi");
		CountryCapital.put("USA","Mashington");
		CountryCapital.put("Germany","Berlin");
		CountryCapital.put("Japan","Tokyo");
		CountryCapital.put("India","Delhi");
		for(Map.Entry<String,String> entry:CountryCapital.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
			

	}

}
}