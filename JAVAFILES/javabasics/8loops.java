import java.util.*;
public class loops{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
//whle loop
          int counter = 0;
          while(counter<100){
            System.out.println("hello world");
             counter++;//increasing the value of counter
          }


//reverse the number and print
int N = 10899;
 while(N>0){
    int lastdigit = N%10;
    System.out.print(lastdigit);
    N = N/10;}
    System.out.println();
    

    // reverse the number
 int num = 10899;
 int reverse = 0;
 while(num>0){
    int lastd = num%10;
     reverse = (reverse*10)+lastd;
   
   num =num/10;
 }
System.out.println(reverse);

//for loop
           for(int i = 1;i<=10;i++){
            System.out.println(i);
         }
          //sum first n natural number
          
          int n = sc.nextInt();
          int sum = 0;
          int i = 1;
         while(i >= n){
            sum+=i;
            System.out.println(sum);
            i++;
         }
         
        
//do while loop
int count = 1;
do {
   System.out.println("hello world");
   count++;
}while(count<=10);
         
//break statement & continue

do{
   System.out.print("Enter your number :"+ " ");   
   int E = sc.nextInt();
  
   if(E%10==0){
     //break
      continue;
       }
   System.out.println("your number is :"+ E);
   E++;

}while(true);

         
       
    }

}  

