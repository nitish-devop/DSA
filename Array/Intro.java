import java.util.Arrays;
class Intro {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(arr.length);

        // Copy no of elements from 0 to n-1
        int[] brr = Arrays.copyOf(arr,2);
        System.out.println(Arrays.toString(brr));

        // Copy no of elements from start to end-1
        brr = Arrays.copyOfRange(arr, 0, arr.length);
        System.out.println(Arrays.toString(brr));

        
        // Print array2
        System.out.println(Arrays.toString(brr));
        
        // Compare array
        System.out.println(Arrays.equals(arr,brr));
        
        // fill(arr[],value) : fill each cell of array with given value
        Arrays.fill(arr,5);
        
        // Print array1
        System.out.println(Arrays.toString(arr));
        






    
    }
}