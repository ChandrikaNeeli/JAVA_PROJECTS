package chandu;

import java.util.ArrayList;

class Student{
	String name;
	int age;
	double grade;
	Student(String name,int age,double grade){
	 this.name=name;
	 this.age=age;
	 this.grade=grade;
	}
}

public class StudentManagement {

	public static void main(String[] args) {
		ArrayList<Student>Students=new ArrayList<Student>();
		Students.add(new Student("Anjali",20,85.5));
		Students.add(new Student("Roja",21,78.5));
		Students.add(new Student("Priya",23,88.5));
		Students.add(new Student("karan",10,67.5));
		Students.add(new Student("pandu",20,91.5));
		
		System.out.println("Students with grade above 80:");
		for(Student s:Students) {
			if(s.grade>80) {
				System.out.println("Name:"+s.name+",Age:"+s.age+",Grade:"+s.grade);
				
			}
		}
	

	}

}
