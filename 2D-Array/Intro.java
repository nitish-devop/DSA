import java.util.Arrays;
import java.util.Scanner;

public class Intro {
    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }
    
    public static int rowsum(int[][] arr){
        int max = 0;
        // calcualting row sum
        for(int i=0;i<arr.length;i++){
            int rowsum = 0;
            for(int j=0;j<arr[i].length;j++){
                rowsum += arr[i][j];
            }

            max = Math.max(max, rowsum);
        }
        return max;
    }

    public static int colsum(int[][] arr){
        int max = 0;
        // calcualting row sum
        for(int i=0;i<arr[0].length;i++){
            int colsums = 0;
            for(int j=0;j<arr.length;j++){
                colsums += arr[j][i];
            }
            System.out.println(colsums);
            max = Math.max(max, colsums);
        }
        return max;
    }
    public static int largestRowOrColSum(int[][] arr){
        int rowsum = rowsum(arr);
        int colsum = colsum(arr);
        return Math.max(rowsum, colsum);
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        // Print array
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        // Col wise print
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

       
    }
}
