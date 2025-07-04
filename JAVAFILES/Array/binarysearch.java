import java.util.*;
public class binarysearch{
    public static int binarysearch(int number[] ,int key){
        int start = 0;
        int end = number.length-1;

        while( start <= end){
        int mid = (start + end)/2;
           if (number[mid] == key){
              System.out.println("found");
              return mid;
           }
           if (number[mid] > key){
              end = mid+1;
              
           }else{
            start = mid-1;
           }
        
        }
        return -1;
    }
         

    public static void main(String args[]){
        int n[] = {2,4,6,8,13,14,18};
        int key = 13;
        int index = binarysearch( n , key );
        System.out.println("Index number of your key is : " + index );
    }
}
