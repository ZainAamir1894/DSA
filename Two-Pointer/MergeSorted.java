public class MergeSorted{
    public static void main(String[] args){
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int id = 0;

        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                result[id++] = arr1[i++];
            } else {
                result[id++] = arr2[j++];
            }
        }

        
        while(i < arr1.length){
            result[id++] = arr1[i++];
        }

        
        while(j < arr2.length){
            result[id++] = arr2[j++];
        }

    
        for(int k = 0; k < result.length; k++){
            System.out.print(result[k] + " ");
        }
    }
}