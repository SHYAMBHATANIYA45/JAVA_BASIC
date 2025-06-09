import java.util.*;
public class BitManipulation {
    public static void evenorodd(int num){
         int bitMask = 1;
       
        if((num & bitMask) == 0){
        System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    
     public static void main(String args[]){
        
       // System.out.print("Enter your number : ");
        //int num = sc.nextInt();
        evenorodd(3);
         evenorodd(14);
          evenorodd(6);

        }
}