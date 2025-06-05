package chandu;

import java.util.HashMap;

public class UpdateStudents {
	public static void main(String[] args) {
		HashMap<Integer,String>students=new HashMap<Integer,String>();
		students.put(1,"chandrika");
		students.put(2,"charith");
		students.put(3,"teddy");
		students.put(4,"akhila");
		students.put(5,"ram");
		System.out.println("before update:"+students);
		students.put(5,"seetha");
		System.out.println("After update:"+students);
		
	}
}
