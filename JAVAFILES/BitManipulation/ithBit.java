
public class ithBit{
     //setith bit
    public static int setithbit(int n , int i ){
        int bitMask = (1<<i);
         return n | bitMask;
    }
   //clear bit 
    public static int clearithBit(int n , int i ){
        int bitMask = ~(i<<i);
        return n & bitMask;
    }
     //update ithBit
     public static int updateBi(int n , int i , int newBit){
       // if(newBit == 0){
      //      return clearithBit(n,i);
      // }else{
       //     return setithbit(n, i);
       // }
        n = clearithBit(n , i );
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static int clearIbit( int n , int i ){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }

   public static boolean isPowerofTwo(int n){
    return (n&(n-1)) == 0;
   } 

   public static int countSetBits(int n ){
    int count = 0;
    while(n>0){
        if((n & 1) != 0){
            count++;
        }
        n = n>>1;
    }
       return count;
   }
   public static int fastExpo(int a , int n ){
    int ans = 1 ; 
    while(n>0){
        if((n & 1) != 0 ){
            //check LSB
            ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        } 
    
    return ans;

   }

public static void main(String args[]){
  // int n = 10 ;
   //int i = 2 ;
    //int bitMask = 1<<i;
    /*if((n & bitMask) == 0){
        System.out.println('0');
    }
    else{
        System.out.println("1");
    }*/
 System.out.println(setithbit(10,2));  
System.out.println(clearithBit(10 , 1));
System.out.println(updateBi(10, 2 , 2));
System.out.println(clearIbit(15 , 2));
System.out.println (isPowerofTwo(15));
System.out.println(countSetBits(15));
System.out.println(fastExpo(3,5));
  } 
}