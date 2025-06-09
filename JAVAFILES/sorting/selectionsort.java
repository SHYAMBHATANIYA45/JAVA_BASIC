public class selectionSort {
    public static void main(String args[]) {
        int arr[] = {3, 6, 2, 1};
        
        // Selection Sort Algorithm for Descending Order
        for (int i = 0; i < arr.length - 1; i++) {
            int maxPos = i; // Assume the current position has the maximum value
            
            // Find the index of the largest element in the remaining unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxPos]) { // Change condition to find the maximum
                    maxPos = j; // Update maxPos to the index of the new maximum element
                }
            }
            
            // Swap the largest element found with the element at the current position
            if (maxPos != i) {
                int temp = arr[maxPos];
                arr[maxPos] = arr[i];
                arr[i] = temp;
            }
        }
        
        // Print the sorted array in descending order
        for (int num : arr) {
            System.out.print(num);
        }
    }
}
