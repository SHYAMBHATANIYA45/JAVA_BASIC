import java.util.*;
 /*public class print{
    public static void main(String args[]){
      int n = 9; 
    for(int i = 1 ; i <= n ; i++){
     
      for( int j = 1 ; j <= n; j++){

       if(i == 1 || i == n || j == 1  || j == n || i == (n/2)+1 || j == (n/2)+1 || j == i || j == (n-i)+1){
            System.out.print("* ");
          } else 
          System.out.print("  "); 
           
    }
           System.out.println();

    }
    }
    */
  /* public class print{
    public static void main(String args[]){
      int n = 5 ;
      for( int i = 1 ; i <= n ; i++){
       
        for(int j = 1 ; j <= i; j++){
         System.out.print("* ");
        }
      
        for( int j = 1 ; j <= 2*(n-i) ; j++){
        System.out.print("  ");
        } 
        for( int j = 1 ; j  <= i ; j++)
        {
          System.out.print("* ");
        } 
        System.out.println();
      }
      for( int i = n ; i >= 1 ; i--){
       
        for(int j = 1 ; j <= i; j++){
         System.out.print("* ");
        }
      
        for( int j = 1 ; j <= 2*(n-i) ; j++){
        System.out.print("  ");
        } 
        for( int j = 1 ; j  <= i ; j++)
        {
          System.out.print("* ");
        } 
        System.out.println();
    }
    
    }
    
  }*/
 //daimond pattern
/* public class print{
  public static void main(String args[]){
    int n = 5;
  for(int i = 1 ; i <= n ; i++ ){
      for( int j = 0 ; j < n - i ; j ++){
        System.out.print(" ");
      }
      for(int j = 1 ; j <= (2 * i - 1) ; j++ ){
      System.out.print("*");
      }
    System.out.println();
     }
   
for(int i = n ; i >= 1 ; i-- ){
 
       for( int j = 0 ; j < n - i ; j++){
        System.out.print(" ");
      }
       for(int j = 1 ; j <= (2 * i - 1) ; j++ ){
        System.out.print("*");
      }
      System.out.println();
         }
     }
}*/
public class print{
  public static void main(String args[]){
    int n = 4;
   for(int i = 1 ; i <= n ; i++){
    for(int j = 1; j <= n-i; j++){   
      System.out.print(" ");
    
    }
    for(j = i ; j<= i ; j++){
      System.out.print("*");
    }
    System.out.println();
   }
  }
  }