package jun4;

public class LinearSearchExample {

	public static void main(String[] args) {
		int[] numbers= {5,8,7,3,9,2};
		int target=9;
		
		boolean found =false;
		
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]==target) {
			System.out.println("Found"+" "+target+ " "+"at index"+ i);
			found=true;
			break;
		    }
      }
	
	if(!found) {
		System.out.println("Number"+target+"not found");
	}
	}
}
