import java.util.*;
public class Binary{
    public static void main(String args[]){
        int n[] = {1,2,3,4,5,6,7};
        int target = 4;
        int s = 0;
        int e = n.length-1 ;
        int ans = binarysearch(n,s,e,target);
        System.out.println(ans);
        }
    public static int binarysearch(int n[], int s , int e , int target){
        int m = s +( e-s)/2;
        if(s>e){
            return -1;
        }
        if(n[m] == target){
            return m;
        }
        if(target < m){
            return binarysearch(n ,s, m-1,target);
        }
        
         return binarysearch(n , m+1 ,e,target);
    
}
}