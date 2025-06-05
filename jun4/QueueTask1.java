package jun4;

import java.util.Queue;
import java.util.LinkedList;

public class QueueTask1 {

	public static void main(String[] args) {
		Queue<String>iceCreamTruck=new LinkedList<String>();
		iceCreamTruck.add("child 1");
		iceCreamTruck.add("child 2");
		iceCreamTruck.add("child 3");
		iceCreamTruck.add("child 4");
		iceCreamTruck.add("child 5");
		System.out.println(iceCreamTruck);
		for(int i=0;i<=iceCreamTruck.size()+1;i++);{
		   System.out.println(iceCreamTruck.poll());
		   System.out.println(iceCreamTruck);
		
	}
	}
}
