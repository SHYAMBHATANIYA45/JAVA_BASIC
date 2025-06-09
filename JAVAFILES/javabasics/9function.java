import java.util.*;
public class function{
/* public static int calculateSum(int num1 , int num2){
    int sum = num1 + num2; 
    return sum;}
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("your sum is  :" + sum);*/

        
      /*  int A = 4;
        int B = 2;
        // swap the value from one value to another
       
       int temp =A;
        A = B;
        B = temp;
        System.out.println("value of a is :"+ A);
        System.out.println("value of b is :" + B);*/
/*public static int calcuProduct(int num1 ,int num2){
 int p = num1*num2;
 return p;}
 public static void main(String args[]){
int a =  3;
int b = 5;
int pro= calcuProduct(a,b);
 System.out.print(pro);}*/

// factorial of the number
public static int fectorial(int n){
int fact = (n)*(n-1)*(n-2)*(n-3);// we can also use the loops (^_^)
 return fact;
}
public static void facti(String args[]){
    int a = 4;
    int f = factorial(a);
    System.out.println(f);}


// find binomial coefficient
/*public static int binCoeff(int n,int r ){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nr = factorial(n-r);
    int binCoeff =fact_n/(fact_r)*(fact_nr);
   
    return binCoeff;
}
public static void main(String args[]){
    int n = 5;
    int r = 5;
    System.out.println(binCoeff(n,r));
    }*/
   

    // Method to calculate factorial
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate binomial coefficient
    public static int binCoeff(int n, int r) {
        if (r > n) {
            return 0; // If r is greater than n, return 0
        }
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n - r);
        int binCoeff = fact_n / (fact_r * fact_nr); // Corrected division
        return binCoeff;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        System.out.println(binCoeff(n, r)); // Output should be 1
    
}


   /* public static int sum(int a , int b){
    return a+b;
    }
    public static int sum (int a,int b, int c){
        return a+b+c;
    }*/
   /* public static void main(String args[]){
        System.out.println(sum(3,4,6));
         System.out.println(sum(3,4));}*/


    }


