//problem number 852 in leetcode
package Useful_Generic_Codes;
//An array which resembles a mnountain peak is given , [0 , 1 , 12 (peak) , 3, 4,3]
//here , the peak is at 12 at index 2. We have to find the peak at log n time
//The solution is to apply binary search on the array and solve it as such.
public class Mountain_Array_Peak_in_LOGN {

        //the function that takes an array input and outputs the peak
        public int peakIndexInMountainArray(int[] arr) {
            int n = arr.length; //storing the length of the array
            int low = 0 ; //low or start
            int high = n; //high or end 
            while(low < high){ //basic conditon for a binary search
                int mid = low + (low+high)/2; // calculates the mid index as per binary search method
                
                //if the element at mid index is higher than the element next to it then we know , 
                //that it is going towards the peak , so the high part of the binary search is changed to mid 
                if(arr[mid] > arr[mid + 1]) high = mid; 

                //if the array at mid index is same as or less than the next element , then the low
                //is changed with the mid+1 in order to avoid going towards the low side
                //low is changed to the next element index as it is greater than the element currently at 
                //index of mid. 
                else low = mid + 1;
            }

            //eventually low will point to the element which is the peak and returning low will 
            //return the index of the peak. 
            return low;
        }
}
