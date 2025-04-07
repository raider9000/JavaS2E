package Sorting;
import java.util.Arrays;
public class Insertion_Sort {
    //this class deals with insertion sort 
    //method that returns a random int array of size n within given max and min values
    public static int[] randomIntArray(int n, int min, int max) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return arr;
    }

    public static void print_array(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //insertion sort algorithm
    //The insertion sort algorithm works by dividing the array into a sorted and an unsorted part.
    //It iterates through the array, taking one element from the unsorted part and inserting it into the correct position in the sorted part.
    //This process is repeated until the entire array is sorted.
    //The time complexity of insertion sort is O(n^2) in the worst case and O(n) in the best case.
    //The space complexity is O(1) as it only requires a constant amount of additional space.
    //The insertion sort algorithm is efficient for small data sets and is also stable, meaning that it preserves the relative order of equal elements.
    //The insertion sort algorithm is also adaptive, meaning that it is more efficient for data sets that are already partially sorted.
    //The insertion sort algorithm is a simple and intuitive sorting algorithm that is easy to implement and understand.
    //The insertion sort algorithm is not suitable for large data sets as it has a time complexity of O(n^2) in the worst case.


    public static void insertion_sort(int arr[] , int n){
        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            int j = i - 1;
            //here the key is the element to be inserted into the sorted part of the array , the arr[j] > key condition is usedin order to stop the uneccessary shifting of elements , making the time complexity O(n) in the best case which is not the case for raw bubble sort
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            //This swaps the key with the element at the j+1 position
            //This is done to insert the key into the correct position in the sorted part of the array
            arr[j + 1] = key;
        }
    }


}
