package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        
    }
    public static void divide(int [] arr , int start , int end){
           if(start >= end){
                return;
            }
            int mid = (start + end) / 2;
            divide(arr , start , mid);
            divide(arr , mid + 1 , end);
            conquer(arr , start , mid , end);  
        }
    public static void conquer(int[] arr , int start , int mid , int end){
        int leftarraylength = mid-start+1;
        int rightarraylength = end-mid;

        int[] left = new int[leftarraylength];
        int[] right = new int[rightarraylength];

        for(int i = 0 ; i < leftarraylength ; i++){
            left[i] = arr[start + i];
        }

        for(int i = 0 ; i < rightarraylength ; i++){
            right[i] = arr[mid + 1 + i];
        }

        int i = 0 , j = 0 , k = start;

        while(i < leftarraylength && j < rightarraylength){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < leftarraylength){
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j < rightarraylength){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

}
