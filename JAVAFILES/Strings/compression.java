import java.util.*;
public class Compression{
public static String compression(String str){
    StringBuilder sb = new StringBuilder("");
    
    
    for(int i  =  0 ; i < str.length();i++){
         char ch = str.charAt(i);
        Integer count = 1 ;
        while( i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
    sb.append(ch);
    sb.append(count);}
    return sb.toString();
}
   
    public static void main(String args[]){
        String str = "aaabbbdddeee";
        System.out.println(compression(str));
    }
}
