import java.util.*;
 public class conditionstat{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();   

        //eligibility
        if (age>18){
            System.out.println("can vote ");
        }

        else if (age >13 && age < 18){
            System.out.print("teen age you can go school");


        }
        
        else{
            System.out.println("not eligible for vote");

        }
        int A = 365  ;
        int B = 35;
        if(A>B){
            System.out.println(A + " "+ "is greater among two");

        }
        else{
            System.out.println(B + "is largest among two");
        }
        if (A%2==0){
            System.out.println( A +" " + "is an even number");
        }
        else{
            System.out.println( A + " "+ "is an odd number");
        }



        //income tax calculator
           int income = sc.nextInt();
           int tax;
           if (income<500000){
             tax = 0;
            }
            else if(income > 500000 && income<1000000){
                
                    tax =(int)(income*0.2);
                 
            }
            else {
                 
                    tax = (int)(income*0.3);
                 }
             
        System.out.println( "your tax is:"+tax);

         //largest of 3 numbers
         int a = 1;
         int b = 3;
         int c = 6;
         if (a>b && b>c){
            System.out.println(a + " "+ "is largest number among 3 numbers");
         }
         else if (b>c){
            System.out.println(b + " " +"is the largest number the three numbers");
         }
         else {
            System.out.println(c + " " + "is the largest number amoung three numbers");
            }
            
           
         }
            
         

    }
 