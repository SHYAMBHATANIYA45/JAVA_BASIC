import java.util.*;
public class binstring{
    public static void printStrings(int n ,int lastPlace ,String str){
         if(n  == 0){
        System.out.println(str);
        return;
    }
        //kamm
        printStrings(n-1 , 0 , str+"0");

        if(lastPlace == 0){
            printStrings(n-1 , 1 , str+"1");
        }    }
   

    
    
    
    public static void main(String args[]){
       printStrings(3,0, new String(""));
    }
}