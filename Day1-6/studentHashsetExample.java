package chandu;
import java.util.HashSet;
import java.util.Scanner;

public class studentHashsetExample {

	public static void main(String[] args) {
		HashSet<String>students=new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of 5 students");
		while (students.size()<5) {
			System.out.println("Enter name of student:");
			String name =sc.nextLine();
			if (!students.add(name)) {
				System.out.println("name already added please enter a different name.");
				
			}
			
		}
		System.out.println("\nunique student names are:");
		for(String student:students) {
			System.out.println(student);
		}
		sc.close();

	}

}
