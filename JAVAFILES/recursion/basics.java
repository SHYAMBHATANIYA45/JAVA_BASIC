  import java.util.*;
import java.math.BigInteger;//these is biginteger in java 
public class Basics{
    public static void IncreasingRec(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        IncreasingRec(n-1);
        System.out.println(n + " ");
   
     
    }

public static void main(String args[]){
    int n = 5;
    IncreasingRec(n);
     System.out.println("factorior of "+ n + ":  "+ factn(n));
     System.out.println("sum of n number is : " + SumN(n));
     System.out.println("fibnacci of nth number is : " + calcufn(n));
     int arr[] = {1,2,3,4,5,8,7,5};
     System.out.println(isSorted(arr,0));
     int key = 5;
     System.out.println(firstOccurence(arr , key , 0));
}

public static BigInteger factn(int n ){
    if(n == 0){
        return BigInteger.ONE;
    }
 BigInteger nm1 = factn(n-1);
 BigInteger factorial =BigInteger.valueOf(n).multiply(nm1);// n * nm1;
 return factorial;
        }
// n natural number
public static int SumN(int n ){
    if( n == 1){
        return 1;
    }
    int smn1 = SumN(n-1);
    int Sum = n + smn1;
    return  Sum; 
}
// fibbonacci number
public static int calcufn(int n)
{if(n== 0){
    return 0 ;
}
if(n==1){
    return 1;
}
    int fbn1 = calcufn(n-1);
    int fbn2 = calcufn(n-2);
    int fb = fbn1 + fbn2 ;
    return fb ;
}      
//SOPRTED ARRAY 
 public static boolean isSorted(int arr[] , int i){
    if(i == arr.length - 1){
        return true;
    }
    if(arr[i] > arr[i+1]){
        return false;}

    return isSorted(arr , i+1);
 
}
public static int firstOccurence(int arr[] , int key, int i)
{ 
     if (arr[i] == key){
    return i ;
    }
    return firstOccurence(arr, key , i + 1);

}
}