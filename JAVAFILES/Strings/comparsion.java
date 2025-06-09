import java.util.*;
public class comparsion{
    public static void main(String args[]){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

    //comparoison
    if( s1 == s2){
        System.out.println("equal strings ");
    }
    else{
        System.out.println("strings are not equal");
    }
    //(s2 == s3) these give unequal because ..new string creat new "Tony".but we can check 
    //value of s1 s2 s3. not objects.
    if( s2.equals(s3)){
        System.out.println("equal strings ");
    }
    else{
        System.out.println("strings are not equal");
    }
   // if( s1 == s3){
   if( s1.equals(s3)){
        System.out.println("equal strings ");
    }
    else{
        System.out.println("strings are not equal");
    }
    }
}