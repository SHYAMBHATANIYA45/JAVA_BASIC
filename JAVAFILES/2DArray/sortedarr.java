import java.util.*;
public class sortedarr{
    public static boolean searchkey(int matrix[][], int key ){
        int row = 0 ;
        int col = matrix[0].length - 1;
 while(row < matrix.length && col >= 0){
    if(matrix[row][col] == key){
        System.out.println(" key is found at point(" + row + "," + col +")");
        return true;
    }
    else if(matrix[row][col] > key){
        col--;
        }
        else{
            row++;
        }
 }
             System.out.println( " not found");
             return false;
 
    }
public static void main(String args[]){
     int matrix[][] = {{10,20,30,40},
                       {15,25,35,45},
                       {27,29,37,48},
                       {33,34,35,38}};
        int key = 34;
       searchkey(matrix , key);

}
}