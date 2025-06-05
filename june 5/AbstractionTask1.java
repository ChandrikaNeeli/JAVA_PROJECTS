package chandu;

abstract class Car{
	abstract void start();
	abstract void drive();
	abstract void stop();

	void needs(){
		System.out.println("need driving license");
		System.out.println("RC");

	}
}

public class AbstractionTask1 {
	void start() {
		System.out.println("Car start using start button");
	}
	void drive() {
		System.out.println("drive car using accelator");
	}
	void stop() {
		System.out.println("car stop");
	}

	public static void main(String[] args) {
		AbstractionTask1 ob=new AbstractionTask1();
		ob.start();
		ob.drive();
		ob.stop();
	
	}

}
