package chandu;

abstract class Machine {
	  
	  abstract void ATM();
	  public void ATM2() {
		  System.out.println("ATM USING JAVA WITH PHP");
	  }
 }

class Bank1 extends Machine{
		void ATM() {
			System.out.println("ATM MACHINE USING JAVA");
		
	}
}
public class A {
	public static void main(String[] args) {
			Bank1 b = new Bank1();
			b.ATM();
			b.ATM2();

	}
}
