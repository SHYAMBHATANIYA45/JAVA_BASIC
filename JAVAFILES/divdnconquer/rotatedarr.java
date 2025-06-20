import java.util.*;
public class rotatedarr{
public static void main(String args[]){
int arr[] = {4,5,6,7,0,1,2};
int target = 0;
int targIdx = search(arr,target,0,arr.length-1);
System.out.println("Target found at index: " + targIdx);
}
public static int search(int arr[],int target,int si,int ei){
    if(si > ei){
        return -1;
    }
    int mid = si + (ei-si)/2;
    if(arr[mid] == target){
        return mid;
    }
    if(arr[si] <= arr[mid]){
        if(target >= arr[si] && target <= arr[mid]){
            return search(arr,target,si,mid-1);
        }
        return search(arr,target,mid+1,ei);
    }
    if(target >= arr[mid] && target <= arr[ei]){
        return search(arr,target,mid+1,ei);
    }
    return search(arr,target,si,mid-1);
}
}   