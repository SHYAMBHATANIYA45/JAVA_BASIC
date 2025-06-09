import java.util.*;
public class Practice{
    // public static void printNNumber(int n){
    //     if(n == 0){
    //         return ;
    //     }
    //     System.out.println(n);
    //  printNNumber(n-1);
    //  if(n == 1){
    //     return;
    //  }
    //  System.out.println(n);
    // }
    // public static void main(String args[]){
    //     int n = 5;
    //   printNNumber(n);
    // }
    public static void firstOccurence(int arr[] , int i , int tar){
        if(i == arr.length){
            return;
        }
        if(arr[i] == tar){
             System.out.println(i);
        
        
        }
       
       
     firstOccurence(arr,i+1,tar);
        
    }
    public static void lastOccurence(int arr[], int tar , int n){
        if(arr[n] == tar){
            System.out.println(n);
            return;
}    
lastOccurence(arr , tar , n-1);

    }
    public static void main(String args[]){
        int arr[] = {10,9,13,7,5,7,4,8};
        int tar = 7;
        int i = 0;
        int n = arr.length-1;
         
        firstOccurence(arr, i, tar);
         lastOccurence(arr, tar , n);
    }
}           