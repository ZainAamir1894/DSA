public class SortingSquare{
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
                  //{16,1,0,9,100}
                //{0,1,9,16,100}
        
        int[] result = new int[arr.length];

        int start = 0;
        int end = arr.length-1;
        int pos = arr.length-1;
        

        while(start <= end){
                    int left = arr[start]*arr[start];
                    int right = arr[end]*arr[end];
                    
                
                    if(left > right){
                        result[pos] = left;
                        start++;
                    }else{
                        result[pos] = right;
                        end--;
                    }
                    pos--; //Moves the sorted value to the first index (Sorts the array) | 4,3,2,1
                }

            for(int i : result){
                System.out.print(i + ", ");
            } 
        }
    }
