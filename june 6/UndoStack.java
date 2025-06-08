package chandu;

import java.util.Stack;

public class UndoStack {

	public static void main(String[] args) {
		 Stack<String>stack=new Stack<String>();
		 stack.push("write");
		 stack.push("Delete");
		 stack.push("Insert");
		 System.out.println(stack);
		 System.out.println(stack.peek());
		 stack.peek();
		 stack.pop();
		 stack.pop();
		 System.out.println(stack);
		
	}

}
