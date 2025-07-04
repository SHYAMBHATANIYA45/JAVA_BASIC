public class Stringlength{
    public static void main(String args[]){
        String str = "sa";
        int n = str.length();
        System.out.println(length(str, n));

    }
    public static String length(String str ,int n ){
        if(n == 0){
            return "length of string " + str.length();
        }
        return( length(str , n-1));
    }
}