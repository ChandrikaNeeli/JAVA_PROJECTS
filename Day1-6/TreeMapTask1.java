package chandu;
import java.util.TreeMap;

public class TreeMapTask1 {

	public static void main(String[] args) {
		TreeMap<String,Integer>studentsmarks=new TreeMap<String,Integer> ();
		studentsmarks.put( "chandrika",98);
		studentsmarks.put( "charith",98);
		studentsmarks.put( "teddy",89);
		System.out.println(studentsmarks);
	    String studentsToSearch="charith";
	    if (studentsmarks.containsKey(studentsToSearch)) {
             System.out.println(studentsToSearch + " exit in the students");
        } else {
            System.out.println(studentsToSearch + " not exit in students");
    }
}
}
