package chandu;

import java.util.TreeMap;

public class PhoneCallBook {
	public static void main(String[] args) {
		TreeMap<String,String>callbook=new TreeMap<String,String> ();
		callbook.put( "chandrika","9848223321");
		callbook.put( "charith","9264890471");
		callbook.put( "teddy","8926350341");
        System.out.println(callbook);
}
}
