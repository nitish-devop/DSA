import java.util.*;
import java.util.Scanner;
class Intro {
    public static int[] createArray(int n) {
        int[] arr = new int[n];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int search(int arr[], int x) {
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    public static int[] firstAndlast(int arr[],int x){
        int ans[] = {-1,-1};
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            if(arr[start] == x && ans[0] == -1){
                ans[0] = start;
            }
            start++;

            if(arr[end] == x && ans[1] == -1){
                ans[1] = end;
            }
            end--;
        }
        
        return ans;
    }

    public static int findOccurences(int arr[],int x){
       
        int start = 0;
        int end = arr.length-1;
        int count = 0;

        while(start < end){
            if(arr[start] == x){
                count += 1;
            }
            start++;

            if(arr[end] == x){
                count += 1;
            }
            end--;
        }
        if(arr[start] == x && arr[end]==x){
            count++;
        }
        return count;
    }

    public static void moveAllNegative(int arr[]){
        int nonZero = 0;
        int curr = 0;
        while(curr < arr.length){
            if(arr[curr] < 0){
                int temp = arr[curr];
                arr[curr] = arr[nonZero];
                arr[nonZero] = temp;
                nonZero++;
            }
            curr++;
        }
    
    }
    public static void main(String[] args) {
        int[] arr = {10,20,5,30,40,5,5,0,5};
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
        // Arrays.fill(arr,5);
        
        // Print array1
        System.out.println(Arrays.toString(arr));

        // int first[] = createArray(5);
        // System.out.println(Arrays.toString(first));

        int ans[] = firstAndlast(arr, 5);
        System.out.println(Arrays.toString(ans));

        System.out.println(Arrays.toString(Arrays.copyOf(arr,4)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,4,arr.length)));
        System.out.println(Arrays.equals(Arrays.copyOf(arr,4), Arrays.copyOfRange(arr, 0, 4)));

        int test[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Before sorting : "+Arrays.toString(test));
        // for(int i=0;i<test.length/2;i++){
        //     int temp = test[i];
        //     test[i] = test[test.length-i-1];
        //     test[test.length-i-1] = temp;
        // }
        
        // Sort the array
        Arrays.sort(test);
        System.out.println("After sorting : "+Arrays.toString(test));

        // find kth largest element
        int k = 2;
         k = k %test.length;
        System.out.println(test[test.length-k]);

        test = new int[]{1,2,3,3,3,3,5,3,4,5,3};
        int x = 3;
        int occurences = findOccurences(test, x);
        System.out.println(x+" occurences : "+occurences);

        test = new int[]{-1,-3,3,-4,21,91};
        moveAllNegative(test);
        System.out.println(Arrays.toString(test));







        








    
    }
}