import java.util.*;
public class trappedwater{
    public static void main(String args[]){
     int height[] = {4,2,0,6,3,2,5};
      // left max boundary
      int leftMax[] = new int[height.length];
      leftMax[0] = height[0];

       for(int i = 1 ; i < height.length ; i++){
          leftMax[i] = Math.max(height[i] , leftMax[i-1]);                                        
      }
       // right max 
       int rightMax[] = new int[height.length];
       rightMax[height.length-1] = height[height.length-1];
        
       for(int i = height.length-2 ; i>=0 ; i--){
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
       }

       // 
       int watertrapped = 0;
       for(int i = 0 ; i < height.length ; i++){
       int waterlevel = Math.min(leftMax[i] , rightMax[i]);
       watertrapped += waterlevel - height[i];
       }
       System.out.println(" total water trapedd : " + watertrapped);


int price[]= {7,1,5,3,6,4};
 int buyprice = Integer.MAX_VALUE;
 int maxProfit = 0;
  for(int i = 0 ; i < price.length; i++){
  if(buyprice < price[i]){
    int profit = price[i] - buyprice ; //todays profit
    maxProfit = Math.max(profit , maxProfit);
     }
     else{
        buyprice = price[i];
      }
    }
    System.out.print(" max profit is :" + maxProfit);
  }
}  