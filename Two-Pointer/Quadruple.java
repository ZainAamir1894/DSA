/*Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]] */

import java.util.Arrays;

public class Quadruple {
    public static void main(String[] args) {
         int[] arr = {1,0,-1,0,-2,2}; //6-3 = 0,1,2,3
         int target = 0;

         Arrays.sort(arr);

         for(int i = 0; i<arr.length-3; i++){
            for(int j = i+1; j<arr.length-2; j++){
                
                int start = j+1;
                int end = arr.length-1;

                while(start < end){
                    int sum = arr[i] + arr[j] + arr[start] + arr[end];

                    if(sum == target){
                        System.out.println(arr[i] + ", " + arr[j] + ", " + arr[start] + ", " + arr[end]);
                        start++;
                        end--;

                        while(start < end && arr[start] == arr[start-1]){
                            start++;
                        }
                        while(start < end && arr[end] == arr[end+1]){
                            end--;
                        }
                    } else if(sum < target){
                        start++;
                    } else{
                        end--;
                    }
                }
            }
         }
         
    }
}
