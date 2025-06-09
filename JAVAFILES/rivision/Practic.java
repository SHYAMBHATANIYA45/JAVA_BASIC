import java.util.*;
public class Practic{
/*public static int factorial(int a){
    int f = 1;
   for(int i = 1; i<=a; i++){
    f = f*i;
}
return f;
}
public static void main(String args[]){
    int a = 4;
   
    int m =   factorial(a);
    System.out.print("factorial :" + m);
}*/
/*public static void main(String args[]){
    int n = 4;
     for(int i = 1; i <=n ; i++){
    
         for(int j = 1 ; j<=i ; j++){
            System.out.print("*");
         }
         
     
     for(int j= 1 ; j<=2*(n-i);j++){
        System.out.print(" ");
     }
     for(int j =1; j<=i ; j++){
        System.out.print("*");
     }
     System.out.println();
     }
     //reverse
     for(int i = n; i >= 1 ; i--){
        for(int j = 1; j<= i ; j++){
            System.out.print("*");
         }
          for(int j= 1 ; j<=2*(n-i);j++){
        System.out.print(" ");
     }
     for(int j =1; j<=i ; j++){
        System.out.print("*");
     }
     System.out.println();
     
     }
     




//public static void main(String args[]){
/*int marks[] = new int[100];
Scanner sc = new Scanner(System.in);
marks[0] = sc.nextInt();
marks[1] = sc.nextInt();
marks[2] = sc.nextInt();
System.out.println("lenth of array :" + marks.length);
System.out.println(" MARKS IS : " + marks[0]);
System.out.println(" MARKS IS : " + marks[1]);
System.out.println(" MARKS IS : " + marks[2]);
int percentage = ((marks[0] + marks[1]+ marks[2])/3);
System.out.println("your percentage is : " + percentage +"%");*/


// linear search
/*public static int linearSearch( int n , int marks[]){
for(int i = 0 ; i< marks.length ; i++){
if ( marks[i] == n){
return i;
   }
 }
return -1;
}
public static void main(String args[]){
int marks[] = { 2,4,6,8,10,21,22,55};
int n = 10 ;
System.out.println(linearSearch(n , marks));
 }*/

//largest
/*public static int getLargest(int number[]){
   int largest = Integer.MIN_VALUE;
   for ( int i = 0 ; i<number.length ; i++){
      if(number[i] > largest){
        largest = number[i];
      }
   }
      return largest;
   
}
public static void main(String args[]){
 int number[] = {2,4,9,2,55,3,4,58};
 System.out.println(getLargest(number));

}*/

//binary search
/*public static int binarySearch(int number[],int key){
   int start = 0;
   int end =  number.length-1;
   while(start<=end){
      int mid = (start+end)/2;
     if (number[mid]==key){
      return mid;
     }
     if(number[mid]>key){
      end =  mid-1;
       }
       else{
         start = mid +1;
       }
   }
   return -1;
}
public static void main(String args[]){
   int number[] ={2,4,8,9,4,2,5,10,56};
   int key = 10; 
   System.out.println(binarySearch(number,key));
   }*/
  public static void main(String args[]){
   int number[] ={1,-2,6,-1,3};
   int currSum = 0;
   int maxSum = Integer.MIN_VALUE;
   int prefix[] = new int [number.length];
   prefix[0] = number[0];
   
   for(int i = 1; i<prefix.length; i++){
      prefix[i] = prefix[i-1] + number[i];}

      for(int i = 0 ; i<number.length;i++){
      
         for(int j = i ; j<number.length; j++){
         currSum = i == 0 ? prefix[j]:  prefix[j] - prefix[i-1];
            
            if(maxSum<currSum){
               maxSum = currSum;
            }
       } 
   }
  
    System.out.println( " maxSum is : "+ maxSum);
  }
 
}
    
    /*
  public static void reversArray(int number[]){
  int first = 0 ;
  int last = number.length-1;
  while(first < last){
   int temp = number[last];
   number[last] = number[first];
   number[first] = temp;
   first++;
   last--;
   
    }
  }
  public static void main (String args[]){
   int number[] = {21,12,45,48,12,5};
   reversArray(number);
   for(int i = 0 ; i<number.length; i++){
      System.out.print(number[i] + " ");
   }
   System.out.println();
  }*/
/*
public static void pairsArray(int number[]){
  int tp = 0;
  for(int i = 0 ; i < number.length ; i++){
   int curr = number[i];
   for( int j = i + 1 ; j<number.length; j++){
      System.out.print("(" + curr + ","+ number[j] + ")");
      tp++;
   }
   System.out.println(" total pairs = " + tp);
  }
}
public static void main(String args[]){
   int number[] = {2,4,6,8,10,12};
  pairsArray(number);
   }
}*/
