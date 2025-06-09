import java.util.*;
public class Printcapital{


    public static void main(String args[]){
        String s = "shyamBhataniya";
        
      char result = printCapital(s , 0);
      if(result == 0){
        System.out.println("there is no uppercase letter" + result);
      }
      else{
        System.out.println("Our uppercase letter is " + result);
      }
      String str[] = {"s","h","y","a","m"};
      System.out.println(printReverse(str , 0 , str.length() - 1));
}




public static char printCapital(String s, int i ){
    if( i == s.length()){
        return 0;
    }
    if(Character.isUpperCase(s.charAt(i))){
        return s.charAt(i);
    }
    return printCapital( s , i+1);
} 
//reverse string 
public static String printReverse(String str , int i, int n){
    if(i< 0){
        return " ";
    
}
return str.charAt(i) + printReverse(str ,(n-i));
}



}