public class QuickSort{
public static void printArray(int arr[]){
    
 for(int i = 0; i < arr.length;i++){
    System.out.print(arr[i] + " ");
 }
 System.out.println();
}

 public static void quicksort(int arr[], int si , int ei){
   if(si < ei){
    int pidx = partition(arr,si,ei);
    quicksort(arr,si,pidx-1); //left part 
    quicksort(arr , pidx+1 , ei); // right part
 }
}
 public static int partition(int arr[],int si,int ei){
    int pivot = arr[ei];
    int i = si-1;
 
 for(int j = si; j < ei ;j++){
    if(arr[j] <= pivot){
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 }
i++;
int temp = pivot;
arr[i] = arr[ei];
arr[ei] = temp;
return i;


}
public static void main(String args[]){
    int arr[] = {10,80,30,90,40,50,70};
    quicksort(arr,0,arr.length-1);
    printArray(arr);
}
}