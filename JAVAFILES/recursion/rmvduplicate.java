import java.util.*;
public class RmvDuplicate {
    public static String removeDuplicates(String str, boolean[] map, StringBuilder str1, int idx) {
        if (idx == str.length()) {
            return str1.toString();
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            
            return removeDuplicates(str, map, str1, idx + 1);
        } else {
           
            map[currChar - 'a'] = true;
            str1.append(currChar);
            return removeDuplicates(str, map, str1, idx + 1);
        }
    }

    public static void main(String[] args) {
         StringBuilder str1 = new StringBuilder();
    
        boolean[] map = new boolean[26]; // Initialize all elements to false
        String str = "appnncollege";
        System.out.println(removeDuplicates(str, map, str1, 0));
    }
}
