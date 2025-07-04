import java.util.*;
public class Assignment{
    public static void printkeyind(int arr[] , int i, int key){
         if(i == arr.length){
            return ;
         }
         if(arr[i] == key){
            System.out.println("index of key 2 is " + i);
         }
         printkeyind(arr,i+1,key);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,2,3,4,2,3,4};
        int key = 2;
         printkeyind(arr, 0 , 2);
        System.out.println();
        
         int num = 2019;
         printDigits(num);
         }

static String digits[] = {"zero","one","two","3","4","5","6","7","8","nine"};
    public static void printDigits(int num ){
     
       if(num == 0 ){
        return;
       } 
      int lastdigit = num%10;
    printDigits(num/10);
      System.out.print(digits[lastdigit]+" ");
    }
}
  




















