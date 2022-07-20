import java.util.Scanner;

public class peakelementMoountainArray {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter  "  + n + "  elements");
         for ( int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
         }

         System.out.println("The peak element in Mountain Array is at index "  + peakIndexMountainArray(arr));

    }

    static int peakIndexMountainArray(int[] nums){
        int start = 0;
        int end = nums.length -1;
        int mid = start + (end - start)/2;
        while (start <end){
        if (nums[mid] < nums[mid+1]){
            start = mid +1;
        }
        else{
            end = mid;

        }
        mid =start + (end - start)/2; 

        }
         return start ;
    }
    
}
