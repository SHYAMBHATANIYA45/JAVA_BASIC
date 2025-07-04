import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter is a :");
         int a = sc.nextInt();
         System.out.print("enter is b :");
         int b = sc.nextInt();
         System.out.print("enter is operator :");
         int operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println(a+b);
              break;
            case '-' : System.out.println(a-b);
              break;
            case '*' : System.out.println(a*b);
              break;
            case '/' : System.out.println(a/b);
              break;
            case '%' : System.out.println(a%b);
            break;
             default : System.out.print("not an advanced calculator");
            
            
            
            
        } 

    }
}