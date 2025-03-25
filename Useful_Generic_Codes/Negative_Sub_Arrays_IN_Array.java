import java.util.Scanner;
//this code calculates the number of negative subarrays in a user given array
public class Negative_Sub_Arrays_IN_Array {
    public static void main(String[] args) {
        
        //Taking input of the array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0; //initializing the count of no. of negative sub arrays
        
        //taking input of the user given array
        for(int i = 0 ; i < n ; i++) arr[i] = sc.nextInt();
        
        //the nested loop approach to take each of the elements in the array and permutating with the 
        for(int i = 0 ; i < n ; i++){
            int sum = 0; //sum that holds the sum of the element and all the previous element
            for(int j = i ; j < n ; j ++){
            //the above is the inner loop , it iterates through the    
                sum = sum + arr[j];
                if(sum < 0){
                    count++;
                }else{
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}
