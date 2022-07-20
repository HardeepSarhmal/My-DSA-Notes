import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class practicebinary {

    public static void main(String [] args, int[] is, int[] is2, int[] is3){

        Scanner sc = new Scanner(System.in);
     System.out.print("Enter the size of element" + "");
      int n = sc.nextInt();

      int [] arr = new int[n];
      System.out.print("enter" + n + "elements");
      for (int i= 0; i < n; i++){
        arr[i] = sc.nextInt();
      }
      System.out.println(Arrays.toString(arr));
      System.out.print("Enter the target element: ");
      int target = sc.nextInt();
      System.out.println(target + "element is at index"+ search(arr,target));
    } 

    static int search(int[] nums , int target){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
           int mid = start + (end-start)/2 ;
           if (nums[mid]==target){
            return mid ;
           } 
           else if (nums[mid] < target )
           end = mid -1;
           
           else 
            start = mid +1;
             
            mid = start + (end - start);

           }
           return -1 ; 


    }
    
}
