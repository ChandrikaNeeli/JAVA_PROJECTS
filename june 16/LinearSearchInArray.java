package chandu;

public class LinearSearchInArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 12, 7, 3, 10}; 
        int target = 7; 

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; 
            }
        }
        return -1;
    }
}

       