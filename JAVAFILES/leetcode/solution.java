public class solution {
    
        /*int nums[] = {2,7,11,15};
        int sum = 9;
        for(int i = 0 ; i < nums.length ; i++){
            for( int j = 1; j < nums.length; j++){
                if(nums[i]+nums[j] == sum){
                    System.out.println("(" +i + "," + j + ")");
                }
            }
        }
    */
    
public static int leetque(int height[]){
    //leftmax
    int leftmax[] = new int[height.length];
      leftmax[0] = height[0];
    for(int i = 1; i < height.length ; i++){
        leftmax[i] = Math.max(height[i] , leftmax[i-1]);
    }
         
    
   
     //rightmax
     int rightmax[] = new int[height.length];
      rightmax[height.length-1] = height[height.length - 1];

        for(int i = height.length -2  ; i >= 0 ; i--){
            rightmax[i] = Math.max(height[i] , rightmax[i + 1]);
            System.out.print(rightmax[i]);
        }
        System.out.println();
     
     //waterlevel  
     int watertrapped = 0;
     for(int i = 0 ; i <=  height.length-1; i++){
      int waterlevel = Math.min(leftmax[i],rightmax[i]) ; 
        watertrapped += (waterlevel- height[i]);
     }
     
    return watertrapped;
     
    }
    public static void main(String args[]){
        int height[] = {1,8,6,2,5,4,8,3,7};
    System.out.print(leetque(height));
    }
}