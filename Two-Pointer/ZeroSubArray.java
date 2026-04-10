import java.util.Arrays;

public class ZeroSubArray {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4}; //[-1,0,1] [-1,-1,2]
        
        Arrays.sort(arr);
        //{-4,-1,-1,0,1,2}
        
        for(int i = 0; i < arr.length-2; i++){


            if (i > 0 && arr[i] == arr[i - 1]) continue;
        
        int start = i + 1;
        int end = arr.length - 1;

        while(start < end){
            int sum = arr[i] + arr[start] + arr[end];

            if(sum == 0){
                System.out.print("["+arr[i] + " " + arr[start] + " " + arr[end]+"]");
                start++;
                end--;
            } else if(sum < 0){
                start++;
            }else{
                end--;
            }
          }
        }
    }
}
