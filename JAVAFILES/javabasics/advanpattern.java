import java.util.*;
 public class advanpattern{
    //public static void main(String args[]){
   // Scanner sc = new Scanner(System.in);
     /*System.out.println("******");
        System.out.println("*****");
        System.out.println("****");
        
     //for loop
        for( int line=1;line<=4;line++){
            System.out.println("****");*/

           /* char s = '*';
            for( char i = 4;i>0;i--){
                  for( char j = 1;j<=i;j++){
                     System.out.print(s);
                  }  
                  System.out.println();*/

   
           /* 
            for( int line=1;line<=4;line++){
                     
                     for( int j = 1; j <= line; j++){
                        System.out.print(A);
                     }
                     System.out.println();*/
            
           
           /*  int n = 4;
            char ch = 'A';
            //outer loop
            for (int line = 1; line <=4; line++){
               for (int chars=1; chars<=line; chars++){
                  System.out.print(ch);
                  ch++;
               }
               System.out.println();
            }
               }*/   
         
     /* public static void hollow_rectangle(int row  , int column){
        
         for(int i = 1; i<=row;i++){
            for (int j = 1;j<= column;j++){
               if (i == 1 || i == row ||  j ==  1 || j == column ){
               System.out.print("*");
              }
              else{
               System.out.print(" ");
              }
         }
          System.out.println();
         }
   }
   public static void main (String args[]){
      hollow_rectangle(5,7);
   }
}*/
 /*   *
     **
    ***
   ****
public static void inverted_rotated_half_pyramid(int n){
   for (int i = 1; i<=n; i++){
//spaces
     for (int j = 1; j<=n-i;j++){
      System.out.print(" ");
     }
     for(int j = 1; j<=i ; j++){
      System.out.print("*");
     }
   System.out.println();}
} 
public static void main(String args[]){
   inverted_rotated_half_pyramid(5);
 }
 }*/
 //  numbers
 /*public static void half_pyramid_with_number(int n){
   for(int i = 1; i<=n ; i++){
     for(int j = 1; j <= n-i+1; j++){
    
      System.out.print(j + " ");
     }
     System.out.println();
   }  
 }
 public static void main(String args[]){
   half_pyramid_with_number(5);
 }
 }*/

// zero one triangle
/*public static void zero_one_triangle(int n){
   for (int i = 1; i<=n; i++){
      for (int j=1; j<=i;j++){
         if ((i+j)%2==0){
            System.out.print("1");
         }else{
            System.out.print("0");
         }
         
      } System.out.println();
   }
}
   public static void main(String args[]){
      zero_one_triangle(5);
   }

}*/

//floyd's triangle
/*public static void floyds_triangle(int n ){
  int num = 1;
   for (int i = 1; i<=n; i++){
      for (int j = 1; j<=i;j++){
         System.out.print(num);
         num++;
      }
      System.out.println();
   }

}
public static void main(String args[]){
   floyds_triangle(4);
} 
 }*/


//buterfly 
/*public static void butterfly(int n ){
   for(int i=1; i<=n;i++){
      for(int j = 1 ;j<=i;j++){
       System.out.print("*");
      }
      for (int  j = 1; j<=2*(n-i);j++){
         System.out.print(" ");
      }
      for (int j = 1 ; j<=i;j++){
         System.out.print("*");
      }
      System.out.println();
   }
      for(int i = n; i >= 1;i--){
      for(int j = 1 ;j <= i;j++){
       System.out.print("*");
      }
      for (  int j = 1; j <= 2*(n-i);j++){
         System.out.print(" ");
      }
      for ( int j = 1 ; j <= i ; j++){
         System.out.print("*");
      }
      
   System.out.println();
  }
   }
public static void main(String args[]){
   butterfly(5);
}
 }*/

//rhombus
  /*public static void solid_rhombus(int n){
  for(int i=  1 ; i <= n ; i++){
      for(int j = 1 ; j <= (n-i); j++){
         System.out.print(" ");
      }
      for(int j = 1; j <= n ; j++){
        //hollow rohmbus codition if - else 
      if (i==1 || i == n || j == 1 || j == n){
         System.out.print("* ");
      } 

      else{
         System.out.print("  ");
      }
      }
      System.out.println();
   }
 
 }
 public static void main(String args [])
{
   solid_rhombus(5);
   }*/
  // daimond pattern
public static void daimond(int n ){
   for ( int i = 1 ; i <= n ; i++){

      for ( int j = 1 ;  j <= n-i; j++){
         System.out.print(" ");
        }
        for (int j = 1 ; j <= (2 * i - 1); j++){
         System.out.print("*");
        }
        
      System.out.println();
   }
 
      for(int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
              System.out.println(); 
}
}
public static void main(String args[]){
   daimond(5);
}
}
 