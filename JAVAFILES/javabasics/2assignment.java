import java.util.*;
 public class assignment{
    //public static void main(String args[]){
       // int $ = 24;
        //System.out.println($);
        Scanner name = new Scanner(System.in);

        //avg of 3 numbers

        /*int a = name.nextInt();
        int b = name.nextInt();
        int c = name.nextInt();
        int avg = (a+b+c)/3;
        System.out.println(avg);*/
        
   // area of square
       /* int a = name.nextInt();
        int b = a;
        int area = a*a;
        System.out.print(area);*/

   // total cost of three item and 18% gst
       /* float pen = name.nextFloat();
        float pencil = name.nextFloat();
        float eraser = name.nextFloat();
        float total_cost = pen+pencil+eraser;
        float avg= total_cost+((total_cost))*18/100;
        System.out.println("Bill is: " +total_cost);
        System.out.println("including gst :"+ avg);
        //given values*/
        
/*
   //operator asssignment
   int x = 2;
   int y =5;
   int exp1 =(x* y/x);
   int exp2 =(x* (y/x));
   System.out.print(exp1 + ",");
   System.out.print(exp2);
   
   //conditional statement assignment
   //1
    int number = name.nextInt();
    if (number >=0){
     System.out.println( "number is positive :" + number);
    }
    else{
     System.out.println("number is negative:" + number);
    }

    //2
    double temp = 103.5;
    if(temp > 100){
     System.out.println("you have fever");
    }else{
     System.out.println("you are fine");
    }
     //3
     int week = name.nextInt();
     switch(week){
          case 1 : System.out.println("monday");
          break;
          case 2 : System.out.println("tuesday");
          break;
          case 3 : System.out.println("wednesday");
          break;
          case 4: System.out.println("thrusday");
          break;
          case 5 : System.out.println("friday");
          break;
          case 6 : System.out.println("saturday");
          break;
          case 7 : System.out.println("sunday");
          break;
          default : System.out.println("relax buddy");
     }
     //  5 leap year or not
        int year = name.nextInt();
        boolean a =; year%4
        boolean b = year%100;
        boolean c = year%400;
        if (a == 0   ){
          if ( c == 0){
               System.out.println("Year is a leap year");
          }
          else {
               System.out.prinyln("year is not a leap year");
          }
        }
        
        else{
          System.out.println(year + " " + "not a leap year");
        }
        
  //print even and odd number and sum of even and odd

     System.out.println("Enter your number:");
     int number = name.nextInt();
     int evensum = 0;
     int oddsum = 0;
     int choice;
   do{
      if (number%2==0){
          evensum += number; 
         
          
        }
        else{
          oddsum += number;
          System.out.println("number is odd and sum of the odd number is :" + oddsum);

        
        }
      
      System.out.print("print 0 if you quit here else print 1 for move continue"); 
     choice = name.nextInt();
   }while(choice == n);
    System.out.println("number is odd and sum of the odd number is :" + oddsum);
   System.out.println("number is even and sum of the even number is :" + evensum);
   
  

  // find the factorial of number given by user

  int num = name.nextInt();
  int factorial = 1;
  for( int i = num ; i>0 ;i--){
      factorial *=i;
     }
   System.out.println(factorial);

   }
 }*/

//table
/*int num = name.nextInt();
int table;
  for ( int i = 1; i<=10; i++){
     table = num*i;
     System.out.println(table);

  }
  }
}*/
 public static boolean isPalindrome(int num){
 int mum = num;
 
 int reverse = 0;
 while(num>0)
 {
   int remainder = num%10; 
   reverse = reverse*10 + remainder;
   num = num/10;
 }

 if (mum == reverse){
  System.out.println("your num is palidrome");
  return true;
}
else{
  System.out.println("number is not a palidrome");
   }
   return false;
 }
 public static void main(String args[]){
  isPalindrome(121);
   }

 }
 