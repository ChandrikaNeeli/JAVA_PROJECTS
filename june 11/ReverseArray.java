package chandu;

public class ReverseArray {

	public static void main(String[] args) {
		int[]arr= {10,20,30,40,50};
		
		System.out.println("original array:");
		for(int num:arr) {
			System.out.println(num+" ");
		}
		System.out.println("reversed array:");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
		
	}

}
}
