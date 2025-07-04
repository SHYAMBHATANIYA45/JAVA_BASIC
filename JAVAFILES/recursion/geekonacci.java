/*package whatever //do not write package name here */
import java.util.Scanner;

class Geekonacci {
    public static void main(String[] args) {
      int arr[] = {5,6,,3,8};
       
        Scanner sc = new Scanner(System.in);

        // Example input for A, B, C, and N
        
       int t = sc.nextInt();
       while(t-- > 0)
       {
        // Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int n = sc.nextInt();

        
        System.out.println( Geekonacci(A, B, C, n));
       }
       sc.close();
    }

    public static int Geekonacci(int A, int B, int C, int n) {
        // Debugging output
       

        // Base cases
        if (n == 1) return A;
        if (n == 2) return B;
        if (n == 3) return C;

        // Recursive calculation
        int fn1 = Geekonacci(A, B, C, n - 1);
        int fn2 = Geekonacci(A, B, C, n - 2);
        int fn3 = Geekonacci(A, B, C, n - 3);
        return fn1 + fn2 + fn3;
    }
    //bubble sort
    public static int bubble(int arr[] , int n , int i){
      if(arr[i] == n){
        return arr[i];
      }
      if(arr[i] > arr[i+1]){

        int temp[]= arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
        
      }
      return bubble(arr , n , i+1);
    }
}
