/*Given an array of integers nums and an integer target, return indices of the two numbers
  such that they add up to target*/

/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1] */


public class TwoSum{
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

            int start = 0;
            int end = nums.length-1;

            while(start < end){
                int sum = nums[start] + nums[end];
                
                if(sum < target){
                    start++;
                }else if(sum > target){
                    end--;
                }else{
                    System.out.println(start+ ", " + end);
                    break;
                }
            }
    }
}
