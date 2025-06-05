package chandu;

interface printable{
	
	void print();
}
class Message implements printable{
	public void print() {
		System.out.println("HELLO FROM INTERFACE");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		

	}

}
