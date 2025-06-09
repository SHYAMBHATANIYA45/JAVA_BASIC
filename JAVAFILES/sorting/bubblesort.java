import java.util.*;
public class bubblesort{
    public static void bubble(int arr[]){
        for(int turn = 0 ; turn < arr.length ; turn++){
            int swap = 0 ;
            for( int j = 0 ; j<arr.length - 1 -turn ; j++){
                // swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
          }
        }
      }
       public static void printarr(int arr[]){
        for( int i = 0 ; i < arr.length ; i++){
        System.out.print( arr[i]);
       }
       System.out.println();
       }
      
     
    public static void main(String args[]){
    int arr[] = {2,5,4,7,8};
    bubble(arr);
    printarr(arr);
    
    }
     }
    

