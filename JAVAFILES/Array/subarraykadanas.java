import java.util.*;
public class subarraykadanas{
    public static void subarray_kadnas(int arr[]){
        int currentSum = 0 ;
        int maximumSum = Integer.MIN_VALUE;
        for(int i = 0 ;i < arr.length ; i++){
            currentSum += arr[i];
            if (currentSum <0){  
                currentSum = 0 ;
                }
                maximumSum = Math.max(currentSum,maximumSum);
        }
                System.out.println("our max subarray sum is :" + maximumSum);
        

    }
    public static void main(String args[]){
        int arr[] = {2,5,7,-3,-4};
        subarray_kadnas(arr);
    }
}