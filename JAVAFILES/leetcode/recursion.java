class Recursion {
    public static int search(int[] nums, int target , int si , int ei) {
       if (si >ei){
           return -1;
        }
        int mid = si +(ei - si)/2;
         if (nums[mid] == target) {
            return  mid;
        }
        
         if(nums[mid] < target){
             
            return search(nums , target , mid + 1 , ei);
        }
       
         return search(nums , target, si , mid-1);
    }
    public static void main(String args[]){
        int nums [] = {1,2,3,4,5,6,7};
        int target = 3;
        System.out.println(search(nums, target , 0 , nums.length-1));
    }

    public static int print capitalletter(int n  , int i){
        
    }
}