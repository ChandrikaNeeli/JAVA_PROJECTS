package jun4;

public class Student {
	private String name;
	private int rollno;
	private int marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void checkResults(){
		if(marks<=40) {
			System.out.println("fail");
		}else {
			System.out.println("pass");
		}
	}
	public void displaysDetails() {
		System.out.println("Name:"+" "+ name);
		System.out.println("Rollno:"+" "+ rollno);
		System.out.println("Marks:"+" "+ marks);
		
	}

	public static void main(String[] args) {
		Student ob=new Student();
		ob.setName("Chandu");
		ob.setRollno(3310);
		ob.setMarks(99);
		ob.displaysDetails();
		

	}

}
