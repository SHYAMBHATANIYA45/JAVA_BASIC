import java.util.*;
public class Pairing {
    public static void main(String args[]){
    int n  = 3 ;
    System.out.println(frndpairing(n));
    }
    public static int frndpairing(int n){
        if(n == 0 || n == 1){
            return n;
        }
        // single
        int fnm1 = frndpairing(n-1);
         // paring
         int fnm2 = frndpairing(n-2);
         int pairways = (n-1) * fnm2;
         //total pairs
         int totways = fnm1 + pairways;
         return totways;
    }
    } 