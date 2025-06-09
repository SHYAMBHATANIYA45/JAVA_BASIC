import java.util.Arrays;
public class Assignment{
/*public static boolean Ispalidrome(String str){
     int n = str.length();
  for(int i = 0 ; i < (n)/2 ; i++){
   if(str.charAt(i) != str.charAt(n - 1 - i)){
        return false;
    }
}
   return true;
}
public static void main(String args[]){
    String str = "racecar";
    System.out.println(Ispalidrome(str));
String s = "apnacollege".replace("1","");
 System.out.println(s);

}*/




//checkng  string is anagram or not 
public static void main(String args[]){
 String str1 = "race";
 String str2 = "CArAe";
  str1 = str1.toLowerCase();
  str2 = str2.toLowerCase();

  if(str1.length()  == str2.length()){
    char[] str1CharArray = str1.toCharArray();
    char[] str2CharArray = str2.toCharArray();
     // sort
     Arrays.sort(str1CharArray);
     Arrays.sort(str2CharArray);
     boolean result = Arrays.equals(str1CharArray,str2CharArray);
     if(result){
        System.out.println(str1 + " and " + str2 + " are anagram of each other"); 
     }else{
        System.out.println(" not an anagram");
     }
     }
     else{
        System.out.println("not an anagram");
     }
   }
 }