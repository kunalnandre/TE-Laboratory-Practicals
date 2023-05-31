import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter NO. of elemetes : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.print("Enter element no. " +  (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n;  i++){
            int min  = arr[i];
            int minPos = i;
            for(int j = i+1; j < n; j++){
                if(min > arr[j]){
                    min = arr[j];
                    minPos = j;
                }
            }
            swap(arr, i, minPos);
            for(int j = 0; j < n; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }

    static void swap(int[] arr, int i, int minPos) {
        int temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] =  temp;
    }
}


// Output:

/*
Enter NO. of elemetes : 6
Enter element no. 1 : 36
Enter element no. 2 : 56
Enter element no. 3 : 45
Enter element no. 4 : 25
Enter element no. 5 : 98
Enter element no. 6 : 45
25 56 45 36 98 45 
25 36 45 56 98 45 
25 36 45 56 98 45 
25 36 45 45 98 56 
25 36 45 45 56 98 
25 36 45 45 56 98 
*/
  
