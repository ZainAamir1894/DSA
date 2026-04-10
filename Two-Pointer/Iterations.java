public class Iterations{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] output = new int[arr.length];

        for(int i = 0; i< arr.length; i++){
            int prod = 1;
        for(int j = 0; j < arr.length; j++){
            if(j != i){

                prod *= arr[j];

            }
          }
          output[i] = prod;
        }

        for(int num : output){
            System.out.print(num + " ");
        }
    }
}
