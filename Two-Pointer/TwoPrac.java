public class TwoPrac{
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3};

        int left = 0;
        int right = arr.length-1;
        int target = 4;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                System.out.println(arr[left] + ", " + arr[right]);
                left++;
                right--;

                //CASE CHECK: Duplicate Pairs from each end
            while(left < right && arr[left] == arr[left-1]){
                left++;
            }
            while(right > left && arr[right] == arr[right+1]){
                right--;
            }
        }else if(sum < target){
            left++;
        } else{
            right--;
        }

        }
    }
}
