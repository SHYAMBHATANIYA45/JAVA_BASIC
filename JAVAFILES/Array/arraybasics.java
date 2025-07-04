import java.util.*;
 public class arraybasics{
    public static void main(String  args[]){
      Scanner sc = new Scanner(System.in);
//jagged array 3D
int[][][] a = new int[2][][];
 a[0] = new int[2][];
  a[1] = new int[3][];
  a[0][0] = new int[3];
  a[0][1] = new int[2];
  a[1][0] = new int[2];
  a[1][1] = new int[3];
  a[1][2] = new int[1];
  for(int i = 0 ; i<a.length ;i++){
   for(int j = 0 ; j<a[i].length;j++){
      for(int k = 0 ; k<=a[i][j].length;k++){
         a[i][j][k] = sc.nextInt();
      }
   }
  } 
  
   for(int i = 0 ; i<a.length ;i++){
   for(int j = 0 ; j<a[i].length;j++){
      for(int k = 0 ; k<=a[i][j].length;k++){
         System.out.print(a[i][j][k]+" ");
      }
      System.out.println();
   }
   System.out.println();
  } 





























 //jagged array 2D
//   int[][] a = new int[2][];
//   a[0] = new int[3];
//   a[1] = new int[4];
//   for(int i = 0 ; i<a.length; i++){
//    for(int j = 0; j<a[i].length;j++){
//       a[i][j] = sc.nextInt();
//    }
//    System.out.println();
//   } 
//   System.out.println("require array");
//     for(int i = 0 ; i<a.length; i++){
//    for(int j = 0; j<a[i].length;j++){
//       System.out.print(a[i][j] + " ");
//    }
//     System.out.println();
//   } 



//2D

//    int n  = sc.nextInt();
   //    int m = sc.nextInt();
   //    int[] a[] = new int[n][m];
   //    int i ,j;
   // for(i = 0 ; i < a.length ; i++){
   // for(j = 0 ; j<a[i].length;j++){
   //    a[i][j] = sc.nextInt();
   // }
   // }
   // System.out.println("require array");
   // for(i = 0 ; i < a.length ; i++){
   // for(j = 0 ; j < a[i].length;j++){
   //   System.out.print(a[i][j]+" ");
   // }
   // System.out.println();
   // }
   

   //1D

      // Scanner sc = new Scanner(System.in);
      // int b = sc.nextInt();
      // int[] a = new int[b];

      //  for(int j = 0 ; j <a.length ; j++){
      //    a[j] = sc.nextInt();
      //  }
      // for(int i = 0; i< a.length; i++){
        
      //   System.out.print(a[i] + " ");
      // }
   }
 }