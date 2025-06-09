public class Mean{
    public static void main(String args[]){
        int arr[] = {2,4,5,6,8,12121};  
        int n = arr.length;
        int sum = printMean(arr, n , 0);
        int mean = sum/n ;
        System.out.println(mean);
    }
    public static int printMean(int arr[] , int n , int i ){
        if(i ==n){
            return 0;
        }
       return (arr[i] + printMean(arr , n , i+1));
    }     
    }
