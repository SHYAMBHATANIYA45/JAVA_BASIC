
import java.util.*;//its an package in java
public class JavaBasics {
    public static void main (String args[]){
       // System.out.println("Hello world!");
       // System.out.println("Hello world!");
        //System.out.println("Hello world!");
       /* System.out.println("**");
        System.out.println("***");
        System.out.println("****");*/
       // Scanner sc = new Scanner(System.in); 
       // String input = sc.next();
       // System.out.println(input);
      // String name = sc.nextLine();
       //System.out.println(name);
       //int number= sc.nextInt();
       //System.out.println(number);
       
    //type conversion
   /* int a = 5;
    long b=a;
    System.out.print(b);*/
    //but
     /*long a =5;
    int b = a;
    System.out.print(b);*/ //ERROR of lossy conversion
    /*Scanner sc = new Scanner(System.in);
    int a = sc.nextFloat();
    System.out.println(a); */  // Error possible lossy conversion from float to int
    //but
    // Scanner sc = new Scanner(System.in);
    //float a = sc.nextInt();
    //System.out.println(a);

    //type promotion
    //char a = 'a';
   // short b =50;
   // System.out.println(a+b);
    //wrong
    byte b= 5;
   // b= b*2; we use typing cast
   b =(byte) (b*2);
   System.out.print(b);
   







        
        

    }
}//boilerplate//

