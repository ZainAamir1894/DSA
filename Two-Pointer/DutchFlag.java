public class DutchFlag{
   public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
                  //{0,0,1,1,2,2}

        int start = 0;
        int end = arr.length-1;


        while(start < end){
            if(arr[start] == 0){
                start++;
            }else{

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                end--;
            }
            
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
   }
}