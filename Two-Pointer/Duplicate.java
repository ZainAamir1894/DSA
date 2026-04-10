/*Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores)*/


public class Duplicate{
    public static void main(String[] args){
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        int i = 0;
        int j= 1;

        while(j < arr.length ){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        for(int k = 0; k <= i; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();

        System.out.println(i+1);
    }
}