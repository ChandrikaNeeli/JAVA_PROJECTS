package jun4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
	public static void main(String[] args) {
    Stack<String>ToyBox=new Stack<String>();
	
	ToyBox.push("Ball ");
	ToyBox.push("Blocks ");
	ToyBox.push("Puzzle ");
	System.out.println("Top Toy:" + ToyBox.pop());
	System.out.println(ToyBox);
	Queue<String> IceCream=new LinkedList<String>();
	IceCream.add("Maya");
	IceCream.add("Leo");
	IceCream.add("Nina");
	String firstOut=IceCream.poll();
	System.out.println(firstOut);
	System.out.println(IceCream);
    
}
}
