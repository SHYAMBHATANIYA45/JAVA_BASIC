import java.util.*;
 public class aprimenum{
   /* public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         boolean isPrime = true;
          for (int i = 2; i<=Math.sqrt(n); i++ ){
            if(n%i==0){
          isPrime = false;
            
          }
          
      if (isPrime  == true){
      System.out.println("number is the prime");
      }
     

      else{
         System.out.print("not prime number");
      }


       
        
    }
    }*/

  /* public static boolean Isprime(int n ){
      if(n == 2){
        boolean Isprime = true;
      }
      //boolean Isprime = true;
      for(int i=2;i<=n-1;i++){
         if(n%i==0){
            return false;
            //Isprime = false;
            //break;
         }
       }
       return true;
       //return Isprime;
      }
      public static void main(String args []){
         System.out.println(Isprime(61));
      } */

     //optimized code  of prime number
     public static boolean isprime(int n )
     {
       if (n==2){
         return true;
       }
       for(int i = 2;i <= Math.sqrt(n);i++)
       {
         if(n%i==0){
            return false;
         }
   
      }
      return true;
     }
     
   public static void main(String args[]){
     System.out.println(isprime(5));
    }
 }
 //prime number code in range 10
/*public static void primesInrange(int n){
  for(i= 2;i <=n;i++){
  isprime(i);
  System.out.println("number is prime:" + i);
}
System.out.println();
   public static void main(String args[]){
   primesInrange(20);
  }
}*/
  
  

   
 