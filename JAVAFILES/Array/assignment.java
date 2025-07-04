import java.util.*;
public class assignment{
    /*public static boolean array(int num[] ){
        int n = num.length;
        for( int i = 0 ; i < n-1; i++){
            for ( int j = i + 1; j < n ; j++){
                if( num[i]  == num[j]){
                    return true;
                }
            }
        } 
       return false;
    }

     
        
public static int bNum( int arr [], int key){
 int m = arr.length;
 
 int first  = 0;
 int end = m-1;
 
 while(first <= end){

    int mid = (first + end)/2;

      if ( arr[mid] == key){
       return mid;
     // if left is sorted

    if(arr[mid] < key ){
         if (arr[first] <= key && key < mid){
                 end = mid -1;
      }
         else{
          first= mid+1;
      }
    }
    
    // if right sorted
    else {
         if (arr[mid] < key && key < arr[end]){
            first = mid  + 1 ; 
         }
         else{
            end = mid -1;
         }
    }
    
      }
   return -1;
  }
 public static void main(String args[]){
    int num[] = {1,2,3};
        System.out.println(array(num));
    

    int arr[] ={4,5,6,7,0,1,2};
    int key = 0;
    if( bNum(arr , key) == -1){
        System.out.println("not present that key in our array");
    }
    else{
        System.out.println(bNum(arr , key));
    }
  }
  
}*/

 /*public static int buy_Sell(int price[]){
    int buy_price = Integer.MAX_VALUE;
    int max_profit = 0 ;
    for(int i = 1 ; i < price.length ; i++ ){
        if( buy_price < price[i]){
            int profit = price[i] - buy_price; 
            max_profit = Math.max(profit , max_profit);
        }
        else{
            buy_price = price[i];
        }
    }
    return max_profit;

}
public static void main(String args[] ){
    int price[] = { 7,6,4,3,1};
    System.out.println("our profit is : " + buy_Sell(price)); 
} */   
//water trapping
public static int trapped_water(int height[]){
    int leftmax[] = new int[height.length];
    int rightmax[] = new int [height.length];
    leftmax[0] = height[0];
     rightmax[height.length -1] = height[height.length - 1];
    //left max
    for(int i = 1 ; i < height.length ; i++){
     leftmax[i] = Math.max( leftmax[i-1] , height[i]);
    }
     //right max
    for(int i = height.length - 2; i >= 0  ; i--){
        rightmax[i] = Math.max(rightmax[i+1] , height[i]);
    }
    //watter level
    int watertrapped = 0 ;
    for(int i = 0 ; i<height.length; i++){
        int waterlevel = Math.min( rightmax[i] , leftmax[i]);
        watertrapped += waterlevel - height[i];
    }
  return watertrapped;

}
public static void main (String args[]){
    int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println("water trapped is :" + trapped_water(height));
    }
}