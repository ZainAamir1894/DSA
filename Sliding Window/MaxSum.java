public class MaxSum{
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        int sum = 0;

        //Sum in the first window
        for(int i = 0; i<k; i++){
            sum += arr[i];
        }

        int res  = sum;


        //Sliding window
        for(int j = k; j<arr.length; j++){
            sum = sum + arr[j] - arr[j-k];
            res = Math.max(res, sum);
        }
        System.out.println(res);
    }
}