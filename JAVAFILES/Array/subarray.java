import java.util.*;
public class subarray{
    public static void print_Subarray(int number[])
{
 int sum = 0;
 
 for(int i = 0; i < number.length; i++){
    int start = i ;
    for( int j = i; j < number.length ; j++){
        int end = j;
      
    
  for( int k = start ; k <= end ; k++){//print
  
    
    System.out.print(number[k] + " ");//subarray
  }
  
   System.out.println("   (sum the subarrays is : "+sum );
    }
     
    System.out.println();
  }

}
public static void main(String args[]){
    int number[] = {2 , 4 , 5 , 8 , 12};
     print_Subarray(number);
}

}