import java.util.*;//its an package in java
public class practice{
    public static void main (String args[]){
        

        //sum of a&b// 
       /* int a = 5;
        int b = 4;
        int sum = a+b;
        System.out.println(sum);*/

        //sum of a and b by taking input//
       /* Scanner name =  new Scanner(System.in);
        int a = name.nextInt();
        int b = name.nextInt();
        int sum =a+b;
        System.out.println(sum);*/
        
        //product of a and b by taking input//
        //Scanner name = new Scanner(System.in);
         //int a = name.nextInt();
         //int b = name.nextInt(); 
        // int product = a*b;
         //System.out.print(product);

         // area of circle //
         
          /*Scanner name = new Scanner(System.in);
          
          float rad = name.nextFloat();
          float area = 3.14f*rad*rad;
          System.out.println(area);*/
          //int a = 5;
          //int b = a++;
          
          //int b =++a;
         // System.out.println(a);
         // System.out.println(b);
          
          
          //System.out.println(b);
           Scanner sc = new Scanner(System.in);
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
    
        //pass or fail
        int marks = sc.nextInt();
        if (marks>=33){
            System.out.println("pass");
        }
        else{




            System.out.println("fail");
        }
        //sum of the n natural number
        int n = sc.nextInt();
        int sum =(n*(n+1))/2;
        System.out.println(sum +" "+"is the sum of first" +" "+ n +" "+"numbers");


        

         }



            
         
}