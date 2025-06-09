import java.util.*;
 public class binNdec{

  // binary to decimal

    /*public static void binDec(int biNUM){
        int myNum = biNUM;
        int Dec = 0;
        int pow = 0;
    while(biNUM>0){
        int lastdigit = biNUM%10;
        Dec = Dec + (int)(lastdigit * Math.pow(2,pow));
        pow++;
        biNUM = biNUM/10;
        
    }
     System.out.println(" your decimal of  "+  myNum +" is " + Dec);
    }
    public static void main(String args[]){
    
    binDec(101);
  }*/
 //decimal to binary

  public static void decbin(int decNum){
  int Mydec = decNum;
  int binNum = 0;
  int pow = 0;
  while(decNum>0){
    int remainder = decNum % 2 ;

    binNum = binNum + remainder * (int)(Math.pow(10,pow));
    pow++;
   decNum = decNum/2;
   }
     System.out.println("your binary number of "+ "is "  + binNum);
 }
       public static void main(String args[]){
       decbin(11);
  }
 }

