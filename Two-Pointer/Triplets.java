public class Triplets{
    public static void main(String[] args) {
        int[] arr = {-2,0,1,3};
        int target = 2;


        for(int i = 0; i<arr.length-2; i++){ //4-2 = Array with indexes {0,1,2}
            int start = i+1;
            int end = arr.length-1;

            while(start < end){
                int sum = arr[i] + arr[start] + arr[end];

                if(sum < target){
                    for(int k = end; k>start; k--){ //searches between 1 and 3
                        System.out.println(arr[i] + ", " + arr[start] + ", " + arr[k]);
                    }
                    start++;
                }else{
                    end--;
                }
            }
        }
    }
}