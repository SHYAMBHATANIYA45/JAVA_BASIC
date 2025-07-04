import java.util.*;
/* public class linearsearch{
    public static int linear_search(int number[], int key){
        
        for(int i = 0; i < number.length ; i++){
            if(number[i] == key){
                return i;
            }
        }
           return -1;
}
    
    public static void main(String args[]){
        int number[] = {2,4,8,9,10,35,15};
        int key = 15;
        int index = linear_search(number,key );
        
        if( index== -1){
            System.out.println("NoT FOUND");
        }
        else{
            System.out.println("index number of your key is " + index);
        }

    } 
 }*/
    // larger number
    /*public class Linearsearch{
        public static int largestNum(int number[]){
            int larger = Integer.MIN_VALUE;
            for(int i = 0; i < number.length; i++){
                if(number[i] > larger){
                    larger = number[i];
                }

            }
            return larger;
        }
        public static void main(String args[]){
            int number[] = {2,3,4,34,5,6,8,14};
            System.out.println("your larger number is :" + largestNum(number));
        }
    }*/

    //smallest number
    public class linearsearch{
        public static int smallestNum(int number[]){
            int smallest  =  Integer.MAX_VALUE;
            for( int i = 0; i < number.length; i++){
                if ( number[i] < smallest ){
                    smallest = number[i];
                }

            
        }
        return smallest;

   }
   public static void main(String args[]){
    int number[] = {2,4,5,3,5,66,41,2,29};
    System.out.println(" your smallest number is  : " + smallestNum(number));
   }
   }

