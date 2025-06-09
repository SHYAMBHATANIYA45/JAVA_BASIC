import java.util.*;
public class trappingWater{
    public static int trappedwater(int height[]){
        //left max boudaries
        int left_max[] = new int[height.length];
        left_max[0] = height[0];
         for(int i = 1 ; i < height.length ; i++){
            left_max[i] = Math.max(height[i],left_max[i-1]);
            
            } 

            //right max boundaries
            int right_max[] = new int[height.length];
            right_max[height.length - 1] = height[height.length-1];
            for( int j = height.length - 2; j >= 0 ; j--){
              right_max[j] = Math.max(height[j],right_max[j+1]);
            }
            
            int total_trappedwater = 0;
            for( int i = 0 ; i< height.length ; i++){
                //waterlevel
            int waterlevel = Math.min(left_max[i] , right_max[i]); 
            //trapedwater = waterlevel - height[]
            total_trappedwater += (waterlevel-height[i]);
            }
          return total_trappedwater;
           
    
    }
    public static void main(String arg[]){
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(trappedwater(height));
     }
}   