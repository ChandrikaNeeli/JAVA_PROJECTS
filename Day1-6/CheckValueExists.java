package chandu;

import java.util.HashMap;

public class CheckValueExists {
	public static void main(String[] args) {
		HashMap<Integer,String>students=new HashMap<Integer,String>();
		students.put(1,"chandrika");
		students.put(2,"charith");
		students.put(3,"teddy");
		students.put(4,"akhila");
		students.put(5,"ram");
		System.out.println(students);
		String studentsToCheck="charith";
		if (students.containsValue(studentsToCheck)) {
            System.out.println(studentsToCheck + " exit in the students");
        } else {
            System.out.println(studentsToCheck + " not exit in students");
        }
		int KeyToCheck=1;
		if (students.containsKey(KeyToCheck)) {
            System.out.println(KeyToCheck + " exit in the students");
        } else {
            System.out.println(KeyToCheck + " not exit in students");
        }

	}

}
