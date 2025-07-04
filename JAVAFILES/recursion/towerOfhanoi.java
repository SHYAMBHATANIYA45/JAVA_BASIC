import java.util.*;
public class TowerOfhanoi{
    public static void tower(int n , int a ,int c,int b){
       if(n==0){
        return;
       } 
       tower(n-1,a,b,c);
        System.out.println("moving disc " + n + " from " + a + " to " +b);
        tower(n-1,b,c,a);
    }
    public static void main(String args[]){
        tower(3,10,30,20);
    } 
}