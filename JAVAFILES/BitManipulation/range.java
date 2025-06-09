import java.util.*;
public class Range{
    public static int clearIthbitInrange(int n , int i , int j){
        int a =(~0)<<(j+1);
        int b = (i+1)<< 0;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String args[]){
      int n = 10;
        int i = 2;
        int j = 4;
        System.out.println(clearIthbitInrange(n ,i,j));
    }
}