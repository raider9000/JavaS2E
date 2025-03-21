import java.util.Arrays;
//This is the day_8 class of the Capgemini training , and the topics done are :- 
// 1.Multi D arrays 
// 2.Jagged Arrays
// 3.Trasnpose , rotation by 90 deg. , reversal and printing of 2D arrays
// 4.Array class functions such as deeptostring

//[Note] : The codes written here are as close to the codes written and shown by instructor. 
public class Multi_dimen_Array {
    public static void main(String args[]){
        // to make a simple 2D Array :- 
        int arr[][] = new int[3][3]; // This creates a simple 3x3 matrix

        //(Normal Rows and Columns concept used!)

        //To fetch the number of rows in the array:- 
        int len = arr.length;
        System.out.println(len);

        //To fetch number of columns in a specific row :- 
        int col_len = arr[2].length; //The row number has to be declared 
        System.out.println(col_len);

        //[Note] The empty multi dimensional array contains all 0 in every place by default 

        //Using the random multi 2D array method from randoms class
        arr = randoms.random_2D_Array(3, 3, 180, 120);
        //The above produced a 2d array of 3x3 filled with random numbers betweem 120 and 180

        //using the print 2d array method in randoms class
        randoms.print_2D_Array(arr); // this prints the array

        //Using Arrays.deepToString(Object[] arr) this method prints a multi dimen array in a readable format
        //without manually iterating through the array
        System.out.println(Arrays.deepToString(arr)); // inbuilt function in Arrays class of java
        
        //Using a for each loop to iterate over multi_dimen array :- 
        for(int[] i : arr){ //stores the 1D arrays within the 2D array
            for(int j : i){ //gets the elements of the 1D array stored in i
                System.out.print(j + " ");
            }
            System.out.println(); // makes it more readable
        }

        //Using the max in 2D array method in randoms method to find the max element in the array
        int max = randoms.max_in_2D_array(arr);
        System.out.println(max);

        //using the transpose method created in the randoms class :-
        int a[][] = new int[arr[0].length][arr.length];
        a = randoms.get_matrix_transpose(arr);
        randoms.print_2D_Array(a);

       //jagged arrays are multi dimensional arrays that have different sized sub arrays.  

    }
}
