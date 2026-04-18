/*
Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k. 
*/

public class SubarrayLessThanK{
    public static void main(String[] args) {
        int[] arr = {10,5,2,6};

        int low = 0;
        
        int k = 100;
        int prod = 1;
        int res = 0;

        for(int high = 0; high < arr.length; high++){
            prod = prod * arr[high];

            while(prod >= k){
                prod = prod / arr[low];
                low++;
            }
            res += high - low + 1;
        }
        System.out.print(res);
    }
}
