import java.util.*;
 public class operator{
    public static void main(String args[]){
        int a = 5;
        int b = 2;
        int c = 10;
        //c = c+10;
        c +=10;
        int sum = a+b;
        int sub = a-b;
        int product = a*b;
        int div = a/b;
        int modulo =a%b;
        
   System.out.println("arithmetic operator");//unary and binary and ternary operator
     System.out.println("add :"+sum);
     System.out.println("sub: "+sub);
     System.out.println("product:"+product);
     System.out.println("div:"+div);
     System.out.println("modulo:"+modulo);

   System.out.println("relational operator");
      System.out.println(a==b);
      System.out.println(a!=b);
      System.out.println(a>b);
      System.out.println(a<b);
      System.out.println(a>=b);
      System.out.println(a<=b);

   System.out.println("logical operator");
      System.out.println(a>b && b>a);
      System.out.println(a>b || b>a);
      System.out.println(!(a<b) || b>a);

   System.out.println("assignment operator");
   System.out.println(c);
   
   


      



    
     


    
    }
 }