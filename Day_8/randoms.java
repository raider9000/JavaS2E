public class randoms {

    //[Note] This class has been created to generate random numbers , randomly filled arrays ,
    //random prime numbers , etc.


    //This function produces a 2_dimensional array of random elements 
    public static int[][] random_2D_Array(int a , int b , int max , int min){
        int i , j = 0 ;
        int arr[][] = new int[a][b]; //a and b are the no. of rows and columns given by user
        for(i = 0 ; i < a ; i++){
            for(j = 0 ; j < b ; j++){
                arr[i][j] = random(max , min);
            }
        }
        return arr;
        
    }

    //This function produces a single random number within the max and min range given by user
    public static int random(int max , int min){
        if(max < min){
            throw new java.lang.Error("Index out of Bounds.");
        }else{
            int rand = (int)(min + Math. random( )*((max-min+1))); //formula for random number within range
            return rand;
        }
    }

    //This function is to print the 2D array:-
    public static void print_2D_Array(int arr[][]){
        int i , j = 0;
        for(i = 0 ; i < arr.length ; i++){
            for(j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //This method finds the max element in a 2D array :- 

    //[Concept] : Finding the max element of each of the sub arrays inside the main 2D array
    //, then making another 1D array of all those max elements and finding the max element 
    // inside that array. This finds the maximum element overall in the 2D array given.
    public static int max_in_2D_array(int arr [][]){
        int max = 0; int count = 0; //using count to hold the position of the max_Array
        int max_arr[] = new int[arr.length]; //creating the empty max array
        for(int i[] : arr){
            max_arr[count] = max_in_1D_Array(i);
            count++;
        }
        max = max_in_1D_Array(max_arr);
        return max;
    }

    //This method finds the max element in a 1D array :- 
    public static int max_in_1D_Array(int arr[]){
        int max = 0; // stores the max element
        for(int i = 0 ; i < arr.length-1 ; i++){ //looping till penultimate element 
            if(arr[i] < arr[i+1]) max = arr[i+1]; //if the next element is bigger than current element , storing the next element as max
        }
        return max; //returning the max element in the 1D array
    }

    //This method finds if the 2D array is Symmetric
    public static boolean is_Symmetric_2DArray(int arr[][]){
        if(arr.length != arr[0].length){
            return false;
        }else{
            for(int i = 0 ; i < arr.length ; i++){
                for(int j = i+1 ; j < arr[0].length ; j++){
                    if(arr[j][i] != arr[i][j]){
                        return false;
                    } 
                }
            }
            return true;
            }
    }

    //This method finds the transpose of a 2D matrix:-
    public static int[][] get_matrix_transpose(int arr[][]){
        int i = 0 , j = 0;
        int transpose[][] = new int[arr.length][arr[0].length];
        for(i = 0 ; i < arr.length ; i++){
            for(j = 0 ; j < arr[0].length ; j++){
                transpose[j][i] = arr[i][j]; //interchanges the rows and columns 
            }
        }
        return transpose; //returns the transpose of the matrix
    }

    //This method rotates the 2D array by 90 degrees. :-
    //[Concept] : Rotation of 90 degrees is done when a 2D array is taken and transposed first
    //then each of the rows of the transposed matrix is reversed.
    public static int[][] rotate_2D_byRight(int arr[][]){
        int temp[][] = new int[arr[0].length][arr.length];
        temp = get_matrix_transpose(arr);
        for(int a[] : temp){
            a = reverse_1D_Array(a);
        }
        return temp;
    }

    //This function rotates a single dimension array :-
    public static int[] reverse_1D_Array(int arr[]){
        int rev[] = new int[arr.length];
        int j = arr.length - 1;
        for(int i : arr){
            rev[j] = i;
            j--;
        }
        return rev;
    }
}

