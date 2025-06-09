import java.util.*;
public class sumbarraybf{
    public static void print_SumbArray(int number[]){
    int currSum = 0 ;
    int maxSum = Integer.MIN_VALUE;

 
 for(int i = 0; i < number.length; i++){
    int start = i ;
    for( int j = i; j < number.length ; j++){
        int end = j;
        currSum = 0;
    for( int k = start ; k <= end ; k++){//print
        //subarrysum 
        currSum += number[k];
    }
    System.out.println(currSum);
    if (currSum > maxSum){
        maxSum = currSum;
    }
    //sumbarray
    
  }
}
  System.out.println("max sum = " + maxSum);
}
public static void main(String args[]){
    int number[] = {2 , 4 , 5 , 8 , 12};
    print_SumbArray(number);
}
}