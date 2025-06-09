import java.util.*;
 public class arraybasics{
    public static void main(String  args[]){
        //creating array
        int marks[] = new int[50];
       int number[] ={1,23,3};
       Scanner sc = new Scanner(System.in);
       //inputs
       marks[0] = sc.nextInt();
       marks[1] = sc.nextInt();
       marks[2] = sc.nextInt();
       marks[3] = sc.nextInt();
       //outputs
       System.out.println("p " + marks[0]);
       System.out.println("c " + marks[1]);
       System.out.println("m " + marks[2]);
       System.out.println("civics " + marks[3]);

    } }