public class substring{
    public static String sub(String str , int si, int ei ){
        String substr = "";
        for(int i = si ; i<ei ; i++){
            substr += str.charAt(i);
        }
        return substr;
        }
        public static void main(String args[]){
            String str = "HelloWorld";
             System.out.println(str.substring(0 , 5));
          //  System.out.println(sub(str , 0 , 5));
        }
    
}