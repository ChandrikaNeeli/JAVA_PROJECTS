package chandu;

public class BubbleSortString {

	public static void main(String[] args) {
		String[] words= {"banana","apple","grape","cherry","date"};
		int n=words.length;
		
		for(int i=0;i<n-1;i++) {
		   for(int j=0;j<n-i-1;j++) {
		     if(words[j].compareTo(words[j+1])>0) {
		    	 String temp=words[j];
		    	 words[j]=words[j+1];
		    	 words[j+1]=temp;
		     }
		   }
		}
		System.out.println("bubble sorted strings:");
		for(String word:words) {
			System.out.println(word);
		}

	}

}
