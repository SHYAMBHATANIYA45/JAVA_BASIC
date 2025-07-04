import java.util.*;
public class Prinsumarray{
    public static void PrintSum(int s[]){
        if(s.length == 0){
            return;
        }
        int temp[] = new int [s.length-1];
        for(int i = 0 ; i < s.length-1 ; i++){
            temp[i] = s[i] + s[i+1];
        }
        PrintSum(temp);
        System.out.println(Arrays.toString(s));
    }




    public static void main(String args[]){
        int s[] = {1,2,3,4,5};
        int n = s.length;
        PrintSum(s);
        System.out.println("maximum of array is "+ finMax(s,n));
         System.out.println("minimum of array is "+ finMin(s,n));
    }

//min and max of aray

    public static int finMax(int s[], int n){
        if(n == 1){
           return s[0];
        }
        return Math.max(s[n -1], finMax(s, n-1));

    }
     public static int finMin(int s[], int n){
        if(n == 1){
           return s[0];
        }
        return Math.min(s[n -1], finMin(s, n-1));

    }

}