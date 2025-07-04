import java.util.*;
public class Subset{
    public static void findsubset(String str , String ans, int i){
    // base case
    if(i == str.length()){
    if(ans.length()== 0 ){
     System.out.println("null");
    }
     else{
         System.out.println(ans);
            }
            return;
    }
    
            findsubset(str , ans+str.charAt(i) , i+1);
            //no
            findsubset(str, ans ,i+1);     
           }
           public static void main(String args[]){
            String str = "ABC";
            findsubset(str , " " , 0);
           }
    
    }
