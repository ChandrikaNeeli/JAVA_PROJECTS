package chandu;

public class ReverseStringTask {

	public static void main(String[] args) {
		String[] words= {"charith","chandu","akhila"};
		System.out.println("Reverse words:");
		
		for(int i=words.length-1;i>=0;i--) {
			System.out.println(words[i]+" ");
		}

	}

}
