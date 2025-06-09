import java.util.*;
public class creation2darray{

//Shyam Bahtaniya
    public static boolean SearchKey(int matrix[][] , int key){
        int n = matrix.length , m= matrix[0].length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j]==key){
                System.out.println("key is found in cell (" + i + "," + j + ")");
                return true;
            }
            
        }
       
    }
        return false;
    
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int key = 3;
        
        
        int n = matrix.length , m= matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n ; i++){
            for(int j = 0; j < m; j++ ){
                matrix[i][j] =  sc.nextInt();
            }
        }
         for(int i = 0; i<n ; i++){
            for(int j = 0; j < m; j++ ){
               System.out.print(matrix[i][j] + " ");
         }
        
        
        System.out.println();
} 
SearchKey(matrix , key);
    
        

}
}
