import java.util.*;
public class Tiling{
    public static int tiilling(int n ){
        if(n==0 || n== 1){
            return 1;
        }
        //vertical choice
        int fnm1 = tiilling(n-1);
        
         int fnm2 = tiilling(n-2);
         int totwys = fnm1 + fnm2;
         return totwys;
    }
public static void main(String args[]){
    int n = 3;
    System.out.println(tiilling(n));
}
}