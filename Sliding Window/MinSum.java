/*Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. 
 If there is no such subarray, return 0 instead*/


public class MinSum{
    public static void main(String[] args) {
        int[] arr = {1,2,4,4};
        int low = 0;
        int high = 0;
        int sum = 0;

        int target = 4;

        int res = Integer.MAX_VALUE;

        while(high < arr.length){
            sum = sum + arr[high];

            while(sum >= target){

                int length = high-low+1;

                res = Math.min(res, length);
                sum = sum - arr[low];
                low++;

            }
            high++;
        }
        if(res == Integer.MAX_VALUE){
            System.out.println(0);
        }else{
        System.out.println(res);
        }
    }
}