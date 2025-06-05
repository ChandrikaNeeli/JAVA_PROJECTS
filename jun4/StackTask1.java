package jun4;

import java.util.Stack;

public class StackTask1 {

	public static void main(String[] args) {
        Stack<String>plateStack=new Stack<String>();
		
		plateStack.push("plate 1 ");
		plateStack.push("plate 2 ");
		plateStack.push("plate 3 ");
		plateStack.push("plate 4 ");
		plateStack.push("plate 5 ");
		System.out.println("Top plate:" + plateStack.peek());
		System.out.println(plateStack);

	}

}
