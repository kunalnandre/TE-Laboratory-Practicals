import java.util.Arrays;
import java.util.Scanner;
public class Selectionsort { 
	public static int[] sort(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n; i++) {
	        int minIdx = i;
	        for (int j = i+1; j < n; j++) {
	            if (arr[j] < arr[minIdx]) {
	                minIdx = j;
	            }
	        }
	        int temp = arr[i];
	        arr[i] = arr[minIdx];
	        arr[minIdx] = temp;
	        System.out.println("Pass " + (i+1) + ": " + Arrays.toString(arr));
	    }
	    return arr;
	}
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the size of the array: ");
         int size = scanner.nextInt();
         int[] arr = new int[size];

         System.out.println("Enter the elements of the array:");
         for (int i = 0; i < size; i++) {
             arr[i] = scanner.nextInt();     
         }      
         scanner.close();
        int[] sortedArr = Selectionsort.sort(arr);
        System.out.println("Sorted array is: " + Arrays.toString(sortedArr));
    }
}
