import java.util.*;
public class Basics{
    public static int PowerN(int n ,int x){
       if(n==0){
        return 1;
    }

      // int xnm1 = PowerN(x,n-1);
     //  int xn = x*xnm1;
      // return xn; 
       // we can also return
       return x*PowerN(n-1, x);
    }

public static void main(String args[]){
 
    System.out.println(PowerN(10 , 2));
System.out.println(optimzedpowN(2 ,10));

}

public static int optimzedpowN(int n , int x){
    if(x == 0){
        return 1 ;
    }
    // for logn timme complexity
     int halfpower = optimzedpowN(n,x/2);
  int halfpowersq = halfpower * halfpower;
  if(x%2 != 0){
    halfpowersq = n * halfpowersq;
  }
  return halfpowersq;
}
}