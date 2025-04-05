package Sorting;

public class Bubble_sort {
    //method that returns a random int array of size n within given max and min values
    public static int[] randomIntArray(int n, int min, int max) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return arr;
    }
    
    public static void bubble_sort(int arr[] , int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print_array(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int n = 50;
        int min = 123;
        int max = 934817;
        int arr[] = randomIntArray(n, min, max);
        System.out.println("Before sorting: ");
        print_array(arr);
        bubble_sort(arr, n);
        System.out.println("After sorting: ");
        print_array(arr);
        // The time complexity of bubble sort is O(n^2) in the worst case and O(n) in the best case.
        // The space complexity is O(1) as it only requires a constant amount of additional space.
        
    }
}
